# PLAYTEST RESULTS — Pig Companion Mod (Fabric 26.2)

| Field | Value |
|---|---|
| Tester | Simon Baars (automated playtest) |
| Date (PT) | 2026-09-05 |
| JAR / sources | Loom `runClient` with string-ingredient recipes (`058a61a`+) |
| MC / Loader / API | 26.2 / 0.19.5 / 0.159.0+26.2 |
| Java / display | Java 25 (`/workspace/jdk-25`) / `DISPLAY=:1` |
| Authentication | Offline `Player709`; no Microsoft login |
| Overall | **PASS** for crafting recipes; prior entity/item smoke still good |

## Crafting re-verify (this pass)

| Recipe | Type | Ingredients | Result | Evidence |
|---|---|---|---|---|
| `pigcompanion:potato_on_a_stick` | shaped 2×2 | Fishing Rod (TL) + Potato (BR) | Potato on a Stick | `playtest-shots/craft-potato-stick-grid.png`, `craft-potato-stick-result.png`, `craft-potato-stick-tooltip.png` |
| `pigcompanion:upgraded_saddle` | shapeless | Saddle | Upgraded Saddle | `playtest-shots/craft-upgraded-saddle-grid.png`, `craft-upgraded-saddle-done.png`, `craft-upgraded-saddle-tooltip.png` |

Runtime:
- World load / `/reload` → **Loaded 1587 recipes**
- **No** `Couldn't parse data file 'pigcompanion:…'` errors (previous `{item:…}` format had failed both recipes; 1585 recipes)
- `/recipe give @s pigcompanion:potato_on_a_stick` and `…:upgraded_saddle` unlock OK
- Survival inventory crafting produced both outputs with correct tooltips

## Recipes verified

1. **potato_on_a_stick** — PASS
2. **upgraded_saddle** — PASS

## Prior smoke (still valid)

- Mod loads; creative items + `/give` OK
- Eight armored/companion pig summons render
- Upgraded Saddle mounts; Potato on a Stick held while mounted (steering durability inconclusive)
- Shots: `all-variants.png`, `steering-mounted.png`

## Push status

Local fix + craft verification are committed on `cursor/fabric-26.2` only. **Push remains blocked** (do not fight auth).

## Known limitations

Custom armor textures / companion AI / spawn eggs still not fully ported from legacy Forge 1.6.4.
