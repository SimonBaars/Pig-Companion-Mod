# Testing Guide

## Prerequisites
- Minecraft 1.21.1
- Fabric Loader 0.16.9+
- Fabric API 0.116.6+
- Java 21

## Local Build Testing

### 1. Build the Mod
```bash
./gradlew build
```
Expected: Build completes without errors, JAR created in `build/libs/`

### 2. Run in Development
```bash
./gradlew runClient
```
Expected: Minecraft launches with the mod loaded

## In-Game Testing

### Test 1: Mod Loading
1. Launch Minecraft with Fabric
2. Check mod menu shows "Pig Companion Mod 2.0.0"
3. No crash reports

**Expected Result**: Mod appears in mod list, game loads normally

### Test 2: Item Registration
1. Open creative inventory
2. Search for "potato" and "saddle"
3. Find custom items

**Expected Result**:
- ✓ Potato on a Stick is visible
- ✓ Upgraded Saddle is visible
- ✓ Items have correct textures
- ✓ Items have correct names

### Test 3: Crafting Recipes
**Recipe 1: Potato on a Stick**
```
[Fishing Rod] [ ]
[           ] [Potato]
```

**Recipe 2: Upgraded Saddle**
```
[Saddle] (shapeless)
```

**Expected Result**: Both recipes work and produce correct items

### Test 4: Entity Spawning
1. Use `/summon pigcompanion:pig_leather ~ ~ ~`
2. Repeat for other variants:
   - `pigcompanion:pig_iron`
   - `pigcompanion:pig_gold`
   - `pigcompanion:pig_diamond`
   - `pigcompanion:pig_companion_leather`
   - `pigcompanion:pig_companion_iron`
   - `pigcompanion:pig_companion_gold`
   - `pigcompanion:pig_companion_diamond`

**Expected Result**: 
- ✓ Entities spawn without errors
- ✓ Entities render with correct textures
- ✓ Entities have correct names when hovering

### Test 5: Item Functionality
1. Give yourself a pig and upgraded saddle
2. Right-click pig with saddle
3. Mount the pig
4. Use Potato on a Stick to control

**Expected Result**:
- ✓ Saddle can be applied to pig
- ✓ Player can mount saddled pig
- ✓ Potato on a Stick controls pig movement

## CI/CD Testing

### GitHub Actions Build
1. Push changes to main branch or create PR
2. Check Actions tab on GitHub
3. Verify build workflow runs

**Expected Result**:
- ✓ Workflow triggers automatically
- ✓ Build completes successfully
- ✓ Artifacts are uploaded
- ✓ No build errors or warnings

### Build Artifacts
1. Download artifact from successful build
2. Extract pigcompanion-2.0.0.jar
3. Install in Minecraft mods folder
4. Launch game

**Expected Result**: Mod works identically to local build

## Performance Testing

### Spawn Many Entities
1. Use command to spawn 10 of each pig variant
2. Monitor FPS and game performance
3. Check for lag or memory issues

**Expected Result**: Reasonable performance, no crashes

### Long-Running Session
1. Play with mod for 30+ minutes
2. Spawn entities, use items, craft recipes
3. Monitor for memory leaks or crashes

**Expected Result**: Stable gameplay, no issues

## Compatibility Testing

### With Fabric API Only
- Install only Fabric API + this mod
- Test all features

### With Other Mods
Test with popular Fabric mods:
- JEI/REI (recipe viewer)
- Mod Menu
- OptiFabric (if compatible)

**Expected Result**: No conflicts, mod works normally

## Issue Reporting

If you find any issues, please report with:
- Minecraft version
- Fabric Loader version
- Fabric API version
- Other mods installed
- Steps to reproduce
- Screenshots/crash logs

## Known Limitations

Current implementation:
- Uses vanilla pig behavior (custom AI not yet implemented)
- Entities are placeholders extending vanilla PigEntity
- Advanced features from 1.6.4 version pending port
- Companion pigs don't yet have taming/following behavior

These are planned for future updates.
