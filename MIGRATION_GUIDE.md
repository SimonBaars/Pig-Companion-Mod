# Pig Companion Mod - Migration Guide

## Overview
This document describes the migration of the Pig Companion Mod from Minecraft 1.6.4 (Forge) to Minecraft 1.21.1 (Fabric).

## Major Changes

### Version Update
- **From**: Minecraft 1.6.4 with Forge
- **To**: Minecraft 1.21.1 with Fabric
- **Mod Version**: 1.6.4 → 2.0.0

### Build System
- **Added**: Gradle build system with Fabric Loom plugin
- **Added**: Gradle wrapper for reproducible builds
- **Added**: GitHub Actions CI/CD pipeline

### Package Structure
```
Old (1.6.4 Forge):
modid/pigcompanion/
├── core/
├── pigs/
└── items/

New (1.21.1 Fabric):
com/simonbaars/pigcompanion/
├── entity/
├── item/
└── client/
```

### Entities
All pig entities have been registered using Fabric's entity registration system:

**Armored Pigs:**
- `pig_leather` - Leather Armored Pig
- `pig_iron` - Iron Armored Pig
- `pig_gold` - Gold Armored Pig
- `pig_diamond` - Diamond Armored Pig

**Pig Companions (Tameable):**
- `pig_companion_leather` - Leather Pig Companion
- `pig_companion_iron` - Iron Pig Companion
- `pig_companion_gold` - Gold Pig Companion
- `pig_companion_diamond` - Diamond Pig Companion

### Items
- `potato_on_a_stick` - Potato on a Stick (for controlling pigs)
- `upgraded_saddle` - Upgraded Saddle (enhanced pig saddle)

### Asset Migration
All assets have been migrated to the modern Fabric structure:

```
assets/pigcompanion/
├── icon.png (mod icon)
├── lang/
│   └── en_us.json (translations)
├── models/
│   └── item/ (item models)
├── textures/
│   ├── entity/pig/ (pig textures)
│   └── item/ (item textures)
```

### Recipes
Crafting recipes have been converted to JSON format:
- Potato on a Stick: Fishing Rod + Potato
- Upgraded Saddle: Saddle (shapeless)

## Building the Mod

### Requirements
- Java 21 or higher
- Internet connection (for downloading dependencies)

### Build Commands
```bash
# Build the mod
./gradlew build

# Run the game in development
./gradlew runClient

# Clean build artifacts
./gradlew clean
```

### Build Output
Compiled JARs will be in `build/libs/`:
- `pigcompanion-2.0.0.jar` - Main mod JAR
- `pigcompanion-2.0.0-sources.jar` - Source JAR

## Installation

### For Players
1. Install [Fabric Loader](https://fabricmc.net/use/) for Minecraft 1.21.1
2. Install [Fabric API](https://modrinth.com/mod/fabric-api)
3. Download the mod JAR from releases
4. Place in your `.minecraft/mods` folder
5. Launch Minecraft with the Fabric profile

### For Developers
1. Clone the repository
2. Run `./gradlew build` to build the mod
3. Run `./gradlew runClient` to test in development
4. Mod source is in `src/main/java` and `src/client/java`

## CI/CD Pipeline

The mod now includes a GitHub Actions workflow (`.github/workflows/build.yml`) that:
1. Automatically builds on every push to main
2. Runs on all pull requests
3. Can be manually triggered
4. Uploads build artifacts
5. Uploads build reports on failure

## Future Enhancements

The current implementation uses simplified pig entities. Future updates could include:

### Entity Behaviors
- Custom AI for companion pigs (follow owner, attack enemies)
- Different stats based on armor type
- Taming mechanics using specific items
- Breeding mechanics for armored pigs

### Combat Features
- Companion pigs defend the player
- Different attack strengths based on armor
- Special abilities for each armor tier

### Interactions
- Rideable pigs with saddles
- Inventory for companion pigs
- Command system for pig companions
- Name tags and customization

### Additional Items
- Pig armor pieces (separate from entity)
- Food items specific to pigs
- Special weapons/tools for pig training

## Testing Checklist

### Build Testing
- [x] Gradle build completes successfully
- [ ] CI/CD pipeline runs without errors
- [ ] No compilation warnings

### In-Game Testing
- [ ] Mod loads without crashes
- [ ] All entities spawn correctly
- [ ] Entity textures render properly
- [ ] Items appear in creative inventory
- [ ] Items have correct names/descriptions
- [ ] Crafting recipes work
- [ ] Potato on a Stick controls pigs
- [ ] Upgraded Saddle can be applied to pigs

### Compatibility Testing
- [ ] Works with Fabric API
- [ ] Compatible with other common Fabric mods
- [ ] No conflicts with vanilla pig behavior

## Credits
- **Original Mod**: SimJoo (Minecraft 1.6.4)
- **Fabric Port**: SimonBaars (Minecraft 1.21.1)
- **Build System**: Gradle with Fabric Loom
- **Mod Loader**: Fabric

## License
MIT License - See LICENSE file for details
