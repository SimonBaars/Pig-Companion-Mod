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

public class ModEntities {
	// Armored Pigs
	public static final EntityType<ArmoredPigEntity> PIG_LEATHER = register("pig_leather",
			EntityType.Builder.of(ArmoredPigEntity::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<ArmoredPigEntity> PIG_IRON = register("pig_iron",
			EntityType.Builder.of(ArmoredPigEntity::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<ArmoredPigEntity> PIG_GOLD = register("pig_gold",
			EntityType.Builder.of(ArmoredPigEntity::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<ArmoredPigEntity> PIG_DIAMOND = register("pig_diamond",
			EntityType.Builder.of(ArmoredPigEntity::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	// Pig Companions (tameable/friendly) - need factory methods for armor tiers
	public static final EntityType<CompanionPigEntity> PIG_COMPANION_LEATHER = register("pig_companion_leather",
			EntityType.Builder.<CompanionPigEntity>of((type, world) -> new CompanionPigEntity(type, world, 0), MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<CompanionPigEntity> PIG_COMPANION_IRON = register("pig_companion_iron",
			EntityType.Builder.<CompanionPigEntity>of((type, world) -> new CompanionPigEntity(type, world, 1), MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<CompanionPigEntity> PIG_COMPANION_GOLD = register("pig_companion_gold",
			EntityType.Builder.<CompanionPigEntity>of((type, world) -> new CompanionPigEntity(type, world, 2), MobCategory.CREATURE).sized(0.9f, 0.9f));

	public static final EntityType<CompanionPigEntity> PIG_COMPANION_DIAMOND = register("pig_companion_diamond",
			EntityType.Builder.<CompanionPigEntity>of((type, world) -> new CompanionPigEntity(type, world, 3), MobCategory.CREATURE).sized(0.9f, 0.9f));

	// SuperPig - Enhanced pig from original mod
	public static final EntityType<SuperPigEntity> SUPER_PIG = register("super_pig",
			EntityType.Builder.of(SuperPigEntity::new, MobCategory.CREATURE).sized(0.9f, 0.9f));

	private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
		ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, PigCompanionMod.id(name));
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, key, builder.build(key));
	}

	public static void register() {
		PigCompanionMod.LOGGER.info("Registering entities for " + PigCompanionMod.MOD_ID);

		FabricDefaultAttributeRegistry.register(PIG_LEATHER, ArmoredPigEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(PIG_IRON, ArmoredPigEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(PIG_GOLD, ArmoredPigEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(PIG_DIAMOND, ArmoredPigEntity.createMobAttributes());

		FabricDefaultAttributeRegistry.register(PIG_COMPANION_LEATHER, CompanionPigEntity.createCompanionPigAttributes());
		FabricDefaultAttributeRegistry.register(PIG_COMPANION_IRON, CompanionPigEntity.createCompanionPigAttributes());
		FabricDefaultAttributeRegistry.register(PIG_COMPANION_GOLD, CompanionPigEntity.createCompanionPigAttributes());
		FabricDefaultAttributeRegistry.register(PIG_COMPANION_DIAMOND, CompanionPigEntity.createCompanionPigAttributes());

		FabricDefaultAttributeRegistry.register(SUPER_PIG, SuperPigEntity.createSuperPigAttributes());
	}
}
