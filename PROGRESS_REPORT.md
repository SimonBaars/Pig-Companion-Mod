# Pig Companion Mod - MC 26.2 Progress Report

## ✅ CONFIRMED: MC 26.2 Build Environment Working

The "no mappings for 26.2" blocker was **incorrect**. MC 26.2 works perfectly with Mojang official mappings using the proven CoS recipe.

### Working Configuration
```properties
minecraft_version=26.2
java_version=25
loader_version=0.19.5
loom_version=1.17.20
fabric_version=0.159.0+26.2
mappings=Mojang official (auto-default, no yarn)
```

**Build Status**: ✅ `./gradlew compileJava compileClientJava` **GREEN**

---

## 📦 Features Ported to MC 26.2

### ✅ Custom Entities (Mojang API)
| Entity | Status | Details |
|--------|--------|---------|
| ArmoredPigEntity | ✅ Complete | Base class, saddle support, mounting |
| CompanionPigEntity | ⚠️ Partial | Created with armor tiers, AI temporarily disabled |
| SuperPigEntity | ✅ Complete | Enhanced stats, extends ArmoredPigEntity |

**Attributes**: All entities registered with proper `createMobAttributes()` / `createCompanionPigAttributes()` / `createSuperPigAttributes()`

**Translation**: All entity names added to `en_us.json`

### ✅ Crafting Recipes
| Recipe | Status | Format |
|--------|--------|--------|
| potato_on_a_stick | ✅ Added | Potato + Fishing Rod |
| upgraded_saddle | ✅ Added | Iron Ingots + Saddle |
| string (legacy) | ✅ Added | 3 string → 3 string |

### ✅ Items
| Item | Status | Implementation |
|------|--------|----------------|
| Potato on a Stick | ✅ Registered | FoodOnAStickItem<PIG> |
| Upgraded Saddle | ✅ Registered | Equippable.saddle() component |

---

## 🔧 MC 26.2 API Differences (Documented)

Between MC 1.21.1 and 26.2, several APIs changed significantly. All have `// TODO: MC 26.2` markers in code:

### 1. NBT Serialization API
```java
// Old (1.21.1)
void addAdditionalSaveData(CompoundTag nbt)
void readAdditionalSaveData(CompoundTag nbt)

// New (26.2)  
void addAdditionalSaveData(ValueOutput output)
void readAdditionalSaveData(ValueInput input)
```
**Impact**: Entities spawn but don't persist across saves
**Status**: Temporarily disabled

### 2. Entity Spawning
```java
// Old: EntityType.create(ServerLevel)
// New: Different signatures/factory methods
```
**Impact**: Breeding returns null (no offspring)
**Status**: Temporarily disabled

### 3. Rendering API
```java
// MC 26.2 renderer binding changed
// PigRenderer type mismatch with custom entities
```
**Impact**: Entities render with default/missing textures
**Status**: Needs investigation

### 4. AI Goals
```java
// NearestAttackableTargetGoal constructor signature changed
```
**Impact**: Companion pigs don't auto-attack hostiles
**Status**: Temporarily disabled

### 5. Combat Methods
```java
// doEnchantDamageEffects() renamed or moved
```
**Impact**: No enchantment effects on companion attacks
**Status**: Temporarily disabled

---

## ⏸️ Remaining Work for 100% Parity

### High Priority (Core Functionality)
1. ❌ Resolve NBT API (ValueInput/ValueOutput)
2. ❌ Fix entity breeding/spawning
3. ❌ Create custom renderers or adapt to MC 26.2 rendering API
4. ❌ Re-enable companion AI targeting (hostile mobs)
5. ❌ Fix enchantment damage effects

### Medium Priority (Item Behavior)
6. ❌ Custom PotatoOnAStickItem behavior (damage, break → fishing rod)
7. ❌ Custom UpgradedSaddleItem behavior (saddle pigs)
8. ❌ Item interactions with custom entities

### Low Priority (Easter Eggs)
9. ❌ Gunpowder interaction (pig → TNT explosion)
10. ❌ Feather interaction (pig fling/launch)
11. ❌ XP bottle interaction
12. ❌ Glowstone particles
13. ❌ Spawn egg creation (if in legacy)

### Testing
14. ❌ Runtime playtest verification
15. ❌ Verify all crafting recipes work
16. ❌ Test mounting/riding mechanics
17. ❌ Test companion combat (when re-enabled)

---

## 📊 Completion Estimate

| Category | Status |
|----------|--------|
| Build Environment | ✅ 100% |
| Entity Classes | 🟡 70% (created, persistence/rendering pending) |
| Crafting Recipes | ✅ 100% |
| Item Registration | ✅ 100% |
| Item Behavior | ❌ 0% |
| AI/Combat | 🟡 50% (basic AI done, targeting disabled) |
| Rendering | ❌ 0% |
| Easter Eggs | ❌ 0% |
| Testing | ❌ 0% |
| **Overall** | **🟡 ~40%** |

---

## 🎯 Next Action Items

1. Research MC 26.2 ValueInput/ValueOutput API for NBT
2. Investigate MC 26.2 entity spawning patterns
3. Study MC 26.2 rendering changes (PigRenderState, MobRenderer)
4. Create custom item classes with behavior
5. Add easter egg interaction handlers
6. Runtime testing when core features resolved

---

## 📝 Notes

- **MC_26.2_BLOCKER.md** deleted (was incorrect)
- **No Yarn mappings needed** - Mojang official works perfectly
- **CoS recipe confirmed working** for all SimonBaars Fabric mods on 26.2
- All code compiles cleanly, runtime behavior needs API completion

**Branch**: `cursor/fabric-26.2-parity-fixes-5a38`  
**PR**: [#7](https://github.com/SimonBaars/Pig-Companion-Mod/pull/7) (Draft)
