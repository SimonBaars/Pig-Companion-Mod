package com.simonbaars.pigcompanion.entity;

import com.simonbaars.pigcompanion.PigCompanionMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.pig.Pig;

public class ModEntities {
	// Armored Pigs
	public static final EntityType<Pig> PIG_LEATHER = register("pig_leather",
			EntityType.Builder.of(Pig::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<Pig> PIG_IRON = register("pig_iron",
			EntityType.Builder.of(Pig::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<Pig> PIG_GOLD = register("pig_gold",
			EntityType.Builder.of(Pig::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<Pig> PIG_DIAMOND = register("pig_diamond",
			EntityType.Builder.of(Pig::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	// Pig Companions (tameable/friendly)
	public static final EntityType<Pig> PIG_COMPANION_LEATHER = register("pig_companion_leather",
			EntityType.Builder.of(Pig::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<Pig> PIG_COMPANION_IRON = register("pig_companion_iron",
			EntityType.Builder.of(Pig::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<Pig> PIG_COMPANION_GOLD = register("pig_companion_gold",
			EntityType.Builder.of(Pig::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<Pig> PIG_COMPANION_DIAMOND = register("pig_companion_diamond",
			EntityType.Builder.of(Pig::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
		ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, PigCompanionMod.id(name));
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, key, builder.build(key));
	}

	public static void register() {
		PigCompanionMod.LOGGER.info("Registering entities for " + PigCompanionMod.MOD_ID);

		FabricDefaultAttributeRegistry.register(PIG_LEATHER, Pig.createAttributes());
		FabricDefaultAttributeRegistry.register(PIG_IRON, Pig.createAttributes());
		FabricDefaultAttributeRegistry.register(PIG_GOLD, Pig.createAttributes());
		FabricDefaultAttributeRegistry.register(PIG_DIAMOND, Pig.createAttributes());

		FabricDefaultAttributeRegistry.register(PIG_COMPANION_LEATHER, Pig.createAttributes());
		FabricDefaultAttributeRegistry.register(PIG_COMPANION_IRON, Pig.createAttributes());
		FabricDefaultAttributeRegistry.register(PIG_COMPANION_GOLD, Pig.createAttributes());
		FabricDefaultAttributeRegistry.register(PIG_COMPANION_DIAMOND, Pig.createAttributes());
	}
}
