package com.simonbaars.pigcompanion.entity;

import com.simonbaars.pigcompanion.PigCompanionMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
// Armored Pigs
public static final EntityType<PigEntity> PIG_LEATHER = register("pig_leather",
EntityType.Builder.create(PigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<PigEntity> PIG_IRON = register("pig_iron",
EntityType.Builder.create(PigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<PigEntity> PIG_GOLD = register("pig_gold",
EntityType.Builder.create(PigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<PigEntity> PIG_DIAMOND = register("pig_diamond",
EntityType.Builder.create(PigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

// Pig Companions (tameable/friendly)
public static final EntityType<PigEntity> PIG_COMPANION_LEATHER = register("pig_companion_leather",
EntityType.Builder.create(PigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<PigEntity> PIG_COMPANION_IRON = register("pig_companion_iron",
EntityType.Builder.create(PigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<PigEntity> PIG_COMPANION_GOLD = register("pig_companion_gold",
EntityType.Builder.create(PigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

public static final EntityType<PigEntity> PIG_COMPANION_DIAMOND = register("pig_companion_diamond",
EntityType.Builder.create(PigEntity::new, SpawnGroup.CREATURE)
.dimensions(0.9f, 0.9f)
.build());

private static <T extends PigEntity> EntityType<T> register(String name, EntityType<T> type) {
return Registry.register(Registries.ENTITY_TYPE, Identifier.of(PigCompanionMod.MOD_ID, name), type);
}

public static void register() {
PigCompanionMod.LOGGER.info("Registering entities for " + PigCompanionMod.MOD_ID);

// Register default attributes for all pig variants
FabricDefaultAttributeRegistry.register(PIG_LEATHER, PigEntity.createPigAttributes());
FabricDefaultAttributeRegistry.register(PIG_IRON, PigEntity.createPigAttributes());
FabricDefaultAttributeRegistry.register(PIG_GOLD, PigEntity.createPigAttributes());
FabricDefaultAttributeRegistry.register(PIG_DIAMOND, PigEntity.createPigAttributes());

FabricDefaultAttributeRegistry.register(PIG_COMPANION_LEATHER, PigEntity.createPigAttributes());
FabricDefaultAttributeRegistry.register(PIG_COMPANION_IRON, PigEntity.createPigAttributes());
FabricDefaultAttributeRegistry.register(PIG_COMPANION_GOLD, PigEntity.createPigAttributes());
FabricDefaultAttributeRegistry.register(PIG_COMPANION_DIAMOND, PigEntity.createPigAttributes());
}
}
