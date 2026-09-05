# Migration Notes: Fabric 1.21.1 → Minecraft 26.2

This documents the large jump from the previous Fabric 1.21.1 (Yarn) line to
unobfuscated Minecraft **26.2** (official Mojmap / no Yarn).

## Version matrix

| Component | Before (1.21.1) | After (26.2) |
|-----------|-----------------|--------------|
| Minecraft | 1.21.1 | **26.2** |
| Fabric Loader | 0.16.9 | **0.19.5** |
| Fabric API | 0.116.6+1.21.1 | **0.159.0+26.2** |
| Loom plugin | `fabric-loom` 1.6.12 (remap) | `net.fabricmc.fabric-loom` **1.17.20** (no remap) |
| Mappings | Yarn `1.21.1+build.1` | **None** (game is unobfuscated Mojang names) |
| Gradle | 8.10.2 | **9.5.1** |
| Java | 21 | **25** |
| Mod version | 2.0.0 | **2.1.0** |

## Tooling / build script

1. Switched Loom plugin ID to `net.fabricmc.fabric-loom` (required for 26.1+ unobfuscated game).
2. Removed Yarn mappings / remapping — Loom no longer remaps mods on 26.x.
3. Replaced `modImplementation` with standard `implementation` for loader + Fabric API.
4. Bumped wrapper to Gradle 9.5.1 and Java release to 25.
5. `fabric.mod.json`: `minecraft` uses `~${minecraft_version}`; `java` `>=25`; mixin `compatibilityLevel` `JAVA_25`.

Intermediate Minecraft lines (1.21.2–1.21.11, 26.1) were not staged as separate
published branches in this port; changes below fold those intermediary breaks into one hop.

## Yarn → Mojmap renames used by this mod

| Yarn (1.21.1) | Mojmap (26.2) |
|---------------|---------------|
| `net.minecraft.util.Identifier` | `net.minecraft.resources.Identifier` |
| `Identifier.of(ns, path)` | `Identifier.fromNamespaceAndPath(ns, path)` |
| Yarn `Registries` registry package | `BuiltInRegistries` + `net.minecraft.core.Registry` + `ResourceKey` |
| `EntityType` static fields (`EntityType.PIG`) | `EntityTypes.PIG` |
| `SpawnGroup` | `MobCategory` |
| `PigEntity` | `net.minecraft.world.entity.animal.pig.Pig` |
| `PigEntity.createPigAttributes()` | `Pig.createAttributes()` |
| `Item.Settings` / `maxCount` / `maxDamage` | `Item.Properties` / `stacksTo` / `durability` |
| `OnAStickItem` | `FoodOnAStickItem` |
| `SaddleItem` | Plain `Item` + `DataComponents.EQUIPPABLE` / `Equippable.saddle()` |
| `ItemGroups` / `ItemGroupEvents` | Creative tab ResourceKey + `CreativeModeTabEvents` |
| `EntityRendererRegistry` + `PigEntityRenderer` | `EntityRenderers.register` + `PigRenderer` |

## Registration API changes

### Entities

- Builder flow is now `EntityType.Builder.of(...).sized(...); builder.build(ResourceKey)`.
- Register with `ResourceKey.create(Registries.ENTITY_TYPE, id)` into `BuiltInRegistries.ENTITY_TYPE`.
- Default attributes still via `FabricDefaultAttributeRegistry`.

### Items

- Every `Item.Properties` must `setId(ResourceKey)` before construction.
- Potato on a Stick: `new FoodOnAStickItem<>(EntityTypes.PIG, 7, properties)`.
- Upgraded Saddle: no `SaddleItem` class; mirror vanilla with
  `.component(DataComponents.EQUIPPABLE, Equippable.saddle())`.
- Creative tab keys such as `TOOLS_AND_UTILITIES` are no longer public fields on
  `CreativeModeTabs`; construct
  `ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.withDefaultNamespace("tools_and_utilities"))`
  and use `CreativeModeTabEvents.modifyOutputEvent(...)`.

### Client assets

- Added `assets/pigcompanion/items/{potato_on_a_stick,upgraded_saddle}.json` client item
  definitions (required since the 1.21.4 item model split).

## Package moves observed in 26.x

- Animals are split into subpackages (e.g. `world.entity.animal.pig.Pig`).
- Entity type constants live on `EntityTypes` rather than `EntityType`.
- Creative tab Fabric API moved to `net.fabricmc.fabric.api.creativetab.v1`.

## Behavioral / feature notes

- Entity variants remain vanilla-`Pig` placeholders with distinct registry IDs (same
  approach as the 1.21.1 Fabric port). Full companion AI / armored rendering from
  the original Forge 1.6.4 mod is still pending.
- Custom entity textures are packaged but vanilla `PigRenderer` does not automatically
  select mod textures; visual armor skins may need a custom renderer later.

## Verification

```bash
export JAVA_HOME=/path/to/jdk-25
./gradlew build
```

Expected artifact: `build/libs/pigcompanion-2.1.0.jar`.

See `PLAYTEST.md` for the full in-game feature checklist.
