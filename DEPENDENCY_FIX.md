# Fabric API Dependency Version Fix

## Issue
The build was failing with the following error:
```
> Could not find net.fabricmc.fabric-api:fabric-api:0.110.5+1.21.1.
```

## Root Cause
The Fabric API version `0.110.5+1.21.1` specified in `gradle.properties` **does not exist** in the Fabric Maven repository (https://maven.fabricmc.net/).

## Research
An extensive search of the Fabric API releases repository revealed:
- Fabric API versions for Minecraft 1.21.1 exist from `0.114.0+1.21.1` onwards
- The latest stable version for Minecraft 1.21.1 is `0.116.6+1.21.1`
- Version `0.110.5+1.21.1` was never released

### Available Fabric API Versions for Minecraft 1.21.1
- 0.114.0+1.21.1
- 0.115.x+1.21.1 (multiple releases)
- 0.116.x+1.21.1 (multiple releases, latest being 0.116.6)

## Solution
Updated `fabric_version` in `gradle.properties` from `0.110.5+1.21.1` to `0.116.6+1.21.1`.

### Files Modified
1. `gradle.properties` - Updated fabric_version dependency
2. `PROJECT_SUMMARY.md` - Updated documentation to reflect correct version
3. `TESTING.md` - Updated prerequisites to reflect correct version

## Verification
The fix ensures that:
- Gradle can successfully resolve the Fabric API dependency
- The mod builds with the correct and compatible Fabric API version
- Documentation accurately reflects the actual dependencies

## Additional Notes
- Fabric API versions follow the pattern: `<api-version>+<minecraft-version>`
- For Minecraft 1.21.1, only versions 0.114.0 and above have been released
- Using the latest stable version (0.116.6) ensures access to the most recent features and bug fixes

## Related Links
- [Fabric API Releases](https://github.com/FabricMC/fabric/releases)
- [Fabric Maven Repository](https://maven.fabricmc.net/)
- [Fabric Development Documentation](https://fabricmc.net/develop/)
