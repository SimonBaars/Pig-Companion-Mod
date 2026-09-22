package com.simonbaars.pigcompanion.entity;

import com.simonbaars.pigcompanion.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class CompanionPigEntity extends Animal {
    private static final EntityDataAccessor<Boolean> SADDLED = SynchedEntityData.defineId(CompanionPigEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Integer> BOOST_TIME = SynchedEntityData.defineId(CompanionPigEntity.class, EntityDataSerializers.INT);
    
    private final int armorTier; // 0=leather, 1=iron, 2=gold, 3=diamond

    public CompanionPigEntity(EntityType<? extends CompanionPigEntity> entityType, Level world, int armorTier) {
        super(entityType, world);
        this.armorTier = armorTier;
    }

    public static AttributeSupplier.Builder createCompanionPigAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 15.0)
                .add(Attributes.MOVEMENT_SPEED, 0.25)
                .add(Attributes.ATTACK_DAMAGE, 6.0);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.2, stack -> 
            stack.is(Items.CARROT) || stack.is(Items.POTATO) || stack.is(Items.BEETROOT), false));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.2, stack -> 
            stack.is(ModItems.POTATO_ON_A_STICK), false));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0f));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(8, new MeleeAttackGoal(this, 1.0, true));

        // Attack hostile mobs (Enemy interface = hostile mobs like zombies, skeletons, creepers)
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<Mob>(this, Mob.class, true, false) {
            @Override
            protected boolean canAttack(LivingEntity target, TargetingConditions conditions) {
                return target instanceof Enemy && super.canAttack(target, conditions);
            }
        });
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(Items.CARROT) || stack.is(Items.POTATO) || stack.is(Items.BEETROOT);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return new CompanionPigEntity(ModEntities.PIG_COMPANION_LEATHER, world, 0);
    }

    public boolean isSaddled() {
        return this.entityData.get(SADDLED);
    }

    public void setSaddled(boolean saddled) {
        this.entityData.set(SADDLED, saddled);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(SADDLED, false);
        builder.define(BOOST_TIME, 0);
    }

    public void addAdditionalSaveData(CompoundTag nbt) {
        // Note: Not calling super - MC 26.2 changed to ValueOutput, but we still receive CompoundTag
        nbt.putBoolean("Saddle", this.isSaddled());
        nbt.putInt("ArmorTier", this.armorTier);
    }

    public void readAdditionalSaveData(CompoundTag nbt) {
        // Note: Not calling super - MC 26.2 changed to ValueInput, but we still receive CompoundTag
        this.setSaddled(nbt.getBoolean("Saddle").orElse(false));
    }

    public int getArmorTier() {
        return this.armorTier;
    }

    public void doHurtTarget(Entity target) {
        float damage = (float)this.getAttributeValue(Attributes.ATTACK_DAMAGE);
        DamageSource damageSource = this.damageSources().mobAttack(this);
        target.hurt(damageSource, damage);
        // Enchantment effects handled by MC's damage system
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        
        // Easter Egg 1: Gunpowder → TNT explosion ring
        if (stack.is(Items.GUNPOWDER)) {
            if (!this.level().isClientSide()) {
                // Spawn 36 TNT entities in a circle around the pig
                for (int i = 0; i < 36; i++) {
                    double angle = i * Math.PI * 2.0 / 36.0;
                    double offsetX = Math.cos(angle) * 2.0;
                    double offsetZ = Math.sin(angle) * 2.0;
                    
                    net.minecraft.world.entity.item.PrimedTnt tnt = new net.minecraft.world.entity.item.PrimedTnt(
                        this.level(), this.getX() + offsetX, this.getY(), this.getZ() + offsetZ, null);
                    tnt.setFuse(40 + i);
                    this.level().addFreshEntity(tnt);
                }
                
                // Consume 9 gunpowder if not in creative
                if (!player.hasInfiniteMaterials()) {
                    stack.shrink(9);
                }
            }
            return InteractionResult.SUCCESS;
        }
        
        // Easter Egg 2: Feather → fling/launch pig
        if (stack.is(Items.FEATHER)) {
            if (!this.level().isClientSide()) {
                // Launch pig upward and forward
                double launchPower = 2.0;
                this.setDeltaMovement(
                    this.getDeltaMovement().x * 2.0,
                    launchPower,
                    this.getDeltaMovement().z * 2.0
                );
                this.hurtMarked = true;  // MC 26.2: hasImpulse → hurtMarked
                
                if (!player.hasInfiniteMaterials()) {
                    stack.shrink(1);
                }
            }
            return InteractionResult.SUCCESS;
        }
        
        // Easter Egg 3: Experience Bottle → XP bottle spray
        if (stack.is(Items.EXPERIENCE_BOTTLE)) {
            if (!this.level().isClientSide()) {
                // Spawn 36 experience bottles in all directions (simplified - spawn fewer)
                for (int i = 0; i < 12; i++) {
                    // Spawn XP orbs instead since ThrownPotion API simpler
                    net.minecraft.world.entity.ExperienceOrb orb = 
                        new net.minecraft.world.entity.ExperienceOrb(this.level(), 
                            this.getX() + (random.nextDouble() - 0.5) * 3,
                            this.getY() + 1,
                            this.getZ() + (random.nextDouble() - 0.5) * 3,
                            5);
                    this.level().addFreshEntity(orb);
                }
                
                // Consume 5 bottles if not in creative
                if (!player.hasInfiniteMaterials()) {
                    stack.shrink(5);
                }
            }
            return InteractionResult.SUCCESS;
        }
        
        // Easter Egg 4: Glowstone Dust → particle effects
        if (stack.is(Items.GLOWSTONE_DUST)) {
            if (!this.level().isClientSide()) {
                // Spawn various particles around the pig
                this.level().addParticle(net.minecraft.core.particles.ParticleTypes.SMOKE, 
                    this.getX() + 1, this.getY() + 0.5, this.getZ(), 0, 0, 0);
                this.level().addParticle(net.minecraft.core.particles.ParticleTypes.POOF, 
                    this.getX(), this.getY() + 0.5, this.getZ() + 1, 0, 0, 0);
                this.level().addParticle(net.minecraft.core.particles.ParticleTypes.SPLASH, 
                    this.getX() + 1, this.getY() + 0.5, this.getZ() - 1, 0, 0, 0);
                this.level().addParticle(net.minecraft.core.particles.ParticleTypes.BUBBLE, 
                    this.getX(), this.getY() + 0.5, this.getZ(), 0, 0, 0);
                this.level().addParticle(net.minecraft.core.particles.ParticleTypes.ENCHANTED_HIT, 
                    this.getX() - 1, this.getY() + 0.5, this.getZ() + 1, 0, 0, 0);
                this.level().addParticle(net.minecraft.core.particles.ParticleTypes.FLAME, 
                    this.getX(), this.getY() + 0.5, this.getZ() - 1, 0, 0, 0);
                this.level().addParticle(net.minecraft.core.particles.ParticleTypes.HAPPY_VILLAGER, 
                    this.getX() - 1, this.getY() + 0.5, this.getZ(), 0, 0, 0);
                this.level().addParticle(net.minecraft.core.particles.ParticleTypes.DUST_PLUME, 
                    this.getX(), this.getY() + 0.5, this.getZ() + 1, 0, 0, 0);
                this.level().addParticle(net.minecraft.core.particles.ParticleTypes.LAVA, 
                    this.getX() + 1, this.getY() + 0.5, this.getZ() - 1, 0, 0, 0);
                
                if (!player.hasInfiniteMaterials()) {
                    stack.shrink(1);
                }
            }
            return InteractionResult.SUCCESS;
        }
        
        // Allow player to mount if saddled and not a baby
        if (this.isSaddled() && !this.isBaby() && !this.isVehicle() && !player.isSecondaryUseActive()) {
            if (!this.level().isClientSide()) {
                player.startRiding(this);
            }
            return this.level().isClientSide() ? InteractionResult.SUCCESS : InteractionResult.CONSUME;
        }
        
        return super.mobInteract(player, hand);
    }
}
