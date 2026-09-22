package com.simonbaars.pigcompanion.item;

import com.simonbaars.pigcompanion.entity.ArmoredPigEntity;
import com.simonbaars.pigcompanion.entity.CompanionPigEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class UpgradedSaddleItem extends Item {
    public UpgradedSaddleItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity entity, InteractionHand hand) {
        // Can saddle our custom pigs
        if (entity instanceof ArmoredPigEntity pig) {
            if (!pig.isSaddled() && !pig.isBaby()) {
                if (!entity.level().isClientSide()) {
                    pig.setSaddled(true);
                    // Play saddle sound
                    entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), 
                        SoundEvents.PIG_SADDLE, SoundSource.NEUTRAL, 0.5F, 1.0F);
                    
                    if (!player.hasInfiniteMaterials()) {
                        stack.shrink(1);
                    }
                }
                return InteractionResult.SUCCESS;
            }
        } else if (entity instanceof CompanionPigEntity pig) {
            if (!pig.isSaddled() && !pig.isBaby()) {
                if (!entity.level().isClientSide()) {
                    pig.setSaddled(true);
                    // Play saddle sound
                    entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), 
                        SoundEvents.PIG_SADDLE, SoundSource.NEUTRAL, 0.5F, 1.0F);
                    
                    if (!player.hasInfiniteMaterials()) {
                        stack.shrink(1);
                    }
                }
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }
}
