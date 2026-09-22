package com.simonbaars.pigcompanion.entity;

import com.simonbaars.pigcompanion.item.ModItems;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CompanionPigEntity extends AnimalEntity {
    private static final TrackedData<Boolean> SADDLED = DataTracker.registerData(CompanionPigEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    private static final TrackedData<Integer> BOOST_TIME = DataTracker.registerData(CompanionPigEntity.class, TrackedDataHandlerRegistry.INTEGER);
    
    private final int armorTier; // 0=leather, 1=iron, 2=gold, 3=diamond

    public CompanionPigEntity(EntityType<? extends CompanionPigEntity> entityType, World world, int armorTier) {
        super(entityType, world);
        this.armorTier = armorTier;
    }

    public static DefaultAttributeContainer.Builder createCompanionPigAttributes() {
        return AnimalEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 15.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 6.0);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.25));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.0));
        this.goalSelector.add(3, new TemptGoal(this, 1.2, stack -> 
            stack.isOf(Items.CARROT) || stack.isOf(Items.POTATO) || stack.isOf(Items.BEETROOT), false));
        this.goalSelector.add(4, new TemptGoal(this, 1.2, stack -> 
            stack.isOf(ModItems.POTATO_ON_A_STICK), false));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 6.0f));
        this.goalSelector.add(7, new LookAroundGoal(this));
        this.goalSelector.add(8, new MeleeAttackGoal(this, 1.0, true));

        // Attack hostile mobs
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, HostileEntity.class, true));
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(Items.CARROT) || stack.isOf(Items.POTATO) || stack.isOf(Items.BEETROOT);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.PIG_COMPANION_LEATHER.create(world);
    }

    public boolean isSaddled() {
        return this.dataTracker.get(SADDLED);
    }

    public void setSaddled(boolean saddled) {
        this.dataTracker.set(SADDLED, saddled);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(SADDLED, false);
        builder.add(BOOST_TIME, 0);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putBoolean("Saddle", this.isSaddled());
        nbt.putInt("ArmorTier", this.armorTier);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.setSaddled(nbt.getBoolean("Saddle"));
    }

    public int getArmorTier() {
        return this.armorTier;
    }

    @Override
    public boolean tryAttack(Entity target) {
        float damage = (float)this.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        DamageSource damageSource = this.getDamageSources().mobAttack(this);
        boolean bl = target.damage(damageSource, damage);
        if (bl) {
            this.onAttacking(target);
        }
        return bl;
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        // Allow player to mount if saddled and not a baby
        if (this.isSaddled() && !this.isBaby() && !this.hasPassengers() && !player.shouldCancelInteraction()) {
            if (!this.getWorld().isClient) {
                player.startRiding(this);
            }
            return ActionResult.success(this.getWorld().isClient);
        }
        
        return super.interactMob(player, hand);
    }
}
