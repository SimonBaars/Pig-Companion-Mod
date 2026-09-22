package com.simonbaars.pigcompanion.item;

import com.simonbaars.pigcompanion.entity.ArmoredPigEntity;
import com.simonbaars.pigcompanion.entity.CompanionPigEntity;
import com.simonbaars.pigcompanion.entity.SuperPigEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

/**
 * Potato on a Stick - Used to control and boost pigs
 * Based on the original 1.6.4 ItemCarrotOnAStick2 implementation
 */
public class PotatoOnAStickItem extends Item {

    public PotatoOnAStickItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        return super.useOnEntity(stack, user, entity, hand);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        
        if (user.hasVehicle()) {
            Entity vehicle = user.getVehicle();
            
            // Check if riding a custom pig
            if (vehicle instanceof ArmoredPigEntity || 
                vehicle instanceof CompanionPigEntity || 
                vehicle instanceof SuperPigEntity) {
                
                // Boost speed and damage the item
                if (stack.getMaxDamage() - stack.getDamage() >= 7) {
                    // Boost the pig's speed (this would need pig AI controller implementation)
                    // For now, just damage the item
                    stack.damage(7, user, user.getPreferredEquipmentSlot(stack));
                    
                    if (stack.getDamage() >= stack.getMaxDamage()) {
                        // Return fishing rod when broken
                        return TypedActionResult.success(new ItemStack(Items.FISHING_ROD), world.isClient());
                    }
                    
                    return TypedActionResult.success(stack, world.isClient());
                }
            }
        }
        
        return TypedActionResult.pass(stack);
    }
}
