package com.simonbaars.pigcompanion.entity;

import com.simonbaars.pigcompanion.PigCompanionMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
// Armored Pigs
public static final EntityType<ArmoredPigEntity> PIG_LEATHER = registerArmored("pig_leather",
EntityType.Builder.create((EntityType.EntityFactory<ArmoredPigEntity>) ArmoredPigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<ArmoredPigEntity> PIG_IRON = registerArmored("pig_iron",
EntityType.Builder.create((EntityType.EntityFactory<ArmoredPigEntity>) ArmoredPigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<ArmoredPigEntity> PIG_GOLD = registerArmored("pig_gold",
EntityType.Builder.create((EntityType.EntityFactory<ArmoredPigEntity>) ArmoredPigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<ArmoredPigEntity> PIG_DIAMOND = registerArmored("pig_diamond",
EntityType.Builder.create((EntityType.EntityFactory<ArmoredPigEntity>) ArmoredPigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

// Pig Companions (tameable/friendly)
public static final EntityType<CompanionPigEntity> PIG_COMPANION_LEATHER = registerCompanion("pig_companion_leather",
EntityType.Builder.create((EntityType.EntityFactory<CompanionPigEntity>) (type, world) -> new CompanionPigEntity(type, world, 0), SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<CompanionPigEntity> PIG_COMPANION_IRON = registerCompanion("pig_companion_iron",
EntityType.Builder.create((EntityType.EntityFactory<CompanionPigEntity>) (type, world) -> new CompanionPigEntity(type, world, 1), SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<CompanionPigEntity> PIG_COMPANION_GOLD = registerCompanion("pig_companion_gold",
EntityType.Builder.create((EntityType.EntityFactory<CompanionPigEntity>) (type, world) -> new CompanionPigEntity(type, world, 2), SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<CompanionPigEntity> PIG_COMPANION_DIAMOND = registerCompanion("pig_companion_diamond",
EntityType.Builder.create((EntityType.EntityFactory<CompanionPigEntity>) (type, world) -> new CompanionPigEntity(type, world, 3), SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

// SuperPig - Enhanced pig from original mod
public static final EntityType<SuperPigEntity> SUPER_PIG = registerSuper("super_pig",
EntityType.Builder.create((EntityType.EntityFactory<SuperPigEntity>) SuperPigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

private static <T extends ArmoredPigEntity> EntityType<T> registerArmored(String name, EntityType<T> type) {
return Registry.register(Registries.ENTITY_TYPE, Identifier.of(PigCompanionMod.MOD_ID, name), type);
}

private static <T extends CompanionPigEntity> EntityType<T> registerCompanion(String name, EntityType<T> type) {
return Registry.register(Registries.ENTITY_TYPE, Identifier.of(PigCompanionMod.MOD_ID, name), type);
}

private static <T extends SuperPigEntity> EntityType<T> registerSuper(String name, EntityType<T> type) {
return Registry.register(Registries.ENTITY_TYPE, Identifier.of(PigCompanionMod.MOD_ID, name), type);
}

public static void register() {
PigCompanionMod.LOGGER.info("Registering entities for " + PigCompanionMod.MOD_ID);

// Register default attributes for armored pig variants
FabricDefaultAttributeRegistry.register(PIG_LEATHER, ArmoredPigEntity.createMobAttributes());
FabricDefaultAttributeRegistry.register(PIG_IRON, ArmoredPigEntity.createMobAttributes());
FabricDefaultAttributeRegistry.register(PIG_GOLD, ArmoredPigEntity.createMobAttributes());
FabricDefaultAttributeRegistry.register(PIG_DIAMOND, ArmoredPigEntity.createMobAttributes());

// Register attributes for companion pig variants with attack capabilities
FabricDefaultAttributeRegistry.register(PIG_COMPANION_LEATHER, CompanionPigEntity.createCompanionPigAttributes());
FabricDefaultAttributeRegistry.register(PIG_COMPANION_IRON, CompanionPigEntity.createCompanionPigAttributes());
FabricDefaultAttributeRegistry.register(PIG_COMPANION_GOLD, CompanionPigEntity.createCompanionPigAttributes());
FabricDefaultAttributeRegistry.register(PIG_COMPANION_DIAMOND, CompanionPigEntity.createCompanionPigAttributes());

// Register SuperPig
FabricDefaultAttributeRegistry.register(SUPER_PIG, SuperPigEntity.createSuperPigAttributes());
}
}
