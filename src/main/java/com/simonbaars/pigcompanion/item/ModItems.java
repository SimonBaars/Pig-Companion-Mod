package com.simonbaars.pigcompanion.item;

import com.simonbaars.pigcompanion.PigCompanionMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.OnAStickItem;
import net.minecraft.item.SaddleItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
// Custom items based on the original mod
public static final Item POTATO_ON_A_STICK = register("potato_on_a_stick",
new OnAStickItem<>(new Item.Settings().maxCount(1).maxDamage(25), null, 7));

public static final Item UPGRADED_SADDLE = register("upgraded_saddle",
new SaddleItem(new Item.Settings().maxCount(1)));

private static Item register(String name, Item item) {
return Registry.register(Registries.ITEM, Identifier.of(PigCompanionMod.MOD_ID, name), item);
}

public static void register() {
PigCompanionMod.LOGGER.info("Registering items for " + PigCompanionMod.MOD_ID);

// Add items to creative inventory
ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
entries.add(POTATO_ON_A_STICK);
entries.add(UPGRADED_SADDLE);
});
}
}
