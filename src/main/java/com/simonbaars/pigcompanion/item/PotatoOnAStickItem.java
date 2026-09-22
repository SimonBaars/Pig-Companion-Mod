package com.simonbaars.pigcompanion.item;

import com.simonbaars.pigcompanion.entity.ArmoredPigEntity;
import com.simonbaars.pigcompanion.entity.CompanionPigEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class PotatoOnAStickItem extends Item {
    public PotatoOnAStickItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity entity, InteractionHand hand) {
        // Can only use on our custom pig entities
        if (entity instanceof ArmoredPigEntity || entity instanceof CompanionPigEntity) {
            if (!entity.level().isClientSide()) {
                // Damage the stick
                stack.hurtAndBreak(1, player, player.getEquipmentSlotForItem(stack));
                
                // If broken (durability 0), give back fishing rod
                if (stack.getDamageValue() >= stack.getMaxDamage()) {
                    player.setItemInHand(hand, new ItemStack(Items.FISHING_ROD));
                }
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
