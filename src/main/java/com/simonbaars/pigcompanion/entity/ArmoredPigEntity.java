package com.simonbaars.pigcompanion.entity;

import com.simonbaars.pigcompanion.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ArmoredPigEntity extends Animal {
    private static final EntityDataAccessor<Boolean> SADDLED = SynchedEntityData.defineId(ArmoredPigEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Integer> BOOST_TIME = SynchedEntityData.defineId(ArmoredPigEntity.class, EntityDataSerializers.INT);
    
    public ArmoredPigEntity(EntityType<? extends ArmoredPigEntity> entityType, Level world) {
        super(entityType, world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.2, stack -> 
            stack.is(Items.CARROT) || stack.is(Items.POTATO) || stack.is(Items.BEETROOT), false));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.2, stack -> 
            stack.is(ModItems.POTATO_ON_A_STICK), false));
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.1));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0f));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(Items.CARROT) || stack.is(Items.POTATO) || stack.is(Items.BEETROOT);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return new ArmoredPigEntity(ModEntities.PIG_LEATHER, world);
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
    }

    public void readAdditionalSaveData(CompoundTag nbt) {
        // Note: Not calling super - MC 26.2 changed to ValueInput, but we still receive CompoundTag
        this.setSaddled(nbt.getBoolean("Saddle").orElse(false));
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
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
