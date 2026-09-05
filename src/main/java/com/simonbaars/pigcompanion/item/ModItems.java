package com.simonbaars.pigcompanion.item;

import com.simonbaars.pigcompanion.PigCompanionMod;
import java.util.function.Function;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.FoodOnAStickItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.Equippable;

public class ModItems {
	private static final ResourceKey<CreativeModeTab> TOOLS_AND_UTILITIES =
			ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.withDefaultNamespace("tools_and_utilities"));

	public static final Item POTATO_ON_A_STICK = register("potato_on_a_stick",
			properties -> new FoodOnAStickItem<>(EntityTypes.PIG, 7, properties),
			new Item.Properties().stacksTo(1).durability(25));

	public static final Item UPGRADED_SADDLE = register("upgraded_saddle",
			Item::new,
			new Item.Properties()
					.stacksTo(1)
					.component(DataComponents.EQUIPPABLE, Equippable.saddle()));

	private static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {
		ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, PigCompanionMod.id(name));
		Item item = factory.apply(settings.setId(key));
		return Registry.register(BuiltInRegistries.ITEM, key, item);
	}

	public static void register() {
		PigCompanionMod.LOGGER.info("Registering items for " + PigCompanionMod.MOD_ID);

		CreativeModeTabEvents.modifyOutputEvent(TOOLS_AND_UTILITIES).register(output -> {
			output.accept(POTATO_ON_A_STICK);
			output.accept(UPGRADED_SADDLE);
		});
	}
}
