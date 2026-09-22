package com.simonbaars.pigcompanion.entity;

import com.simonbaars.pigcompanion.item.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

/**
 * SuperPig - The enhanced pig entity from the original mod
 * Spawns naturally and has enhanced stats
 */
public class SuperPigEntity extends ArmoredPigEntity {

    public SuperPigEntity(EntityType<? extends SuperPigEntity> entityType, Level world) {
        super(entityType, world);
    }

    public static AttributeSupplier.Builder createSuperPigAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0)
                .add(Attributes.MOVEMENT_SPEED, 0.3);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.4));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.3, stack -> 
            stack.is(Items.CARROT) || stack.is(Items.POTATO) || stack.is(Items.BEETROOT), false));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.3, stack -> 
            stack.is(ModItems.POTATO_ON_A_STICK), false));
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.2));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.1));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0f));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return new SuperPigEntity(ModEntities.SUPER_PIG, world);
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
