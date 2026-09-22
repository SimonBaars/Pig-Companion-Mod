package com.simonbaars.pigcompanion.item;

import com.simonbaars.pigcompanion.entity.ArmoredPigEntity;
import com.simonbaars.pigcompanion.entity.CompanionPigEntity;
import com.simonbaars.pigcompanion.entity.SuperPigEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

/**
 * Upgraded Saddle - Can be used to saddle custom pig entities
 * Based on the original 1.6.4 ItemSaddle2 implementation
 */
public class UpgradedSaddleItem extends Item {

    public UpgradedSaddleItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        // Check if it's one of our custom pigs
        if (entity instanceof ArmoredPigEntity armoredPig) {
            if (!armoredPig.isSaddled() && !armoredPig.isBaby()) {
                armoredPig.setSaddled(true);
                stack.decrement(1);
                return ActionResult.success(user.getWorld().isClient());
            }
            return ActionResult.SUCCESS;
        }
        
        if (entity instanceof CompanionPigEntity companionPig) {
            if (!companionPig.isSaddled() && !companionPig.isBaby()) {
                companionPig.setSaddled(true);
                stack.decrement(1);
                return ActionResult.success(user.getWorld().isClient());
            }
            return ActionResult.SUCCESS;
        }
        
        if (entity instanceof SuperPigEntity superPig) {
            if (!superPig.isSaddled() && !superPig.isBaby()) {
                superPig.setSaddled(true);
                stack.decrement(1);
                return ActionResult.success(user.getWorld().isClient());
            }
            return ActionResult.SUCCESS;
        }
        
        return super.useOnEntity(stack, user, entity, hand);
    }
}
