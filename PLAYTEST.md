# Playtest Checklist — Pig Companion Mod (Fabric 26.2)

Target: Minecraft **26.2**, Fabric Loader **0.19.5**, Fabric API **0.159.0+26.2**, Java **25**.
Built JAR: `build/libs/pigcompanion-2.1.0.jar`

Use a fresh world (Creative recommended for coverage). Check every box.

## 0. Environment / load

- [ ] Install Fabric Loader 0.19.5 for Minecraft 26.2
- [ ] Install Fabric API `0.159.0+26.2`
- [ ] Place `pigcompanion-2.1.0.jar` in `mods/`
- [ ] Game launches without crash
- [ ] Mod list / logs show `pigcompanion` 2.1.0 loaded
- [ ] No errors referencing missing registries, attributes, or renderers

## 1. Custom items — registration & creative inventory

- [ ] Open Creative inventory → Tools & Utilities tab
- [ ] **Potato on a Stick** is present with correct name and texture
- [ ] **Upgraded Saddle** is present with correct name and texture
- [ ] `/give @s pigcompanion:potato_on_a_stick` works
- [ ] `/give @s pigcompanion:upgraded_saddle` works
- [ ] Potato on a Stick is damageable (durability bar / max damage 25)
- [ ] Upgraded Saddle stacks to 1

## 2. Crafting recipes

### Potato on a Stick (shaped)

```
R
 P
```

(`R` = Fishing Rod, `P` = Potato)

- [ ] Recipe produces `pigcompanion:potato_on_a_stick`
- [ ] Recipe appears in recipe book / REI/EMI if installed

### Upgraded Saddle (shapeless)

- [ ] Single vanilla Saddle in crafting grid → `pigcompanion:upgraded_saddle`
- [ ] Recipe appears in recipe book / REI/EMI if installed

## 3. Armored pig entity variants (summon + render)

Summon each and verify spawn, nameplate, and pig model/renderer (no purple-black missing model):

- [ ] `/summon pigcompanion:pig_leather`
- [ ] `/summon pigcompanion:pig_iron`
- [ ] `/summon pigcompanion:pig_gold`
- [ ] `/summon pigcompanion:pig_diamond`

For each armored pig:

- [ ] Entity has pig AI (wander / look)
- [ ] Entity has health / can take damage
- [ ] Entity despawns/saves normally across relog (optional)

## 4. Pig companion entity variants (summon + render)

- [ ] `/summon pigcompanion:pig_companion_leather`
- [ ] `/summon pigcompanion:pig_companion_iron`
- [ ] `/summon pigcompanion:pig_companion_gold`
- [ ] `/summon pigcompanion:pig_companion_diamond`

For each companion pig:

- [ ] Localized name shows correctly when looking at entity
- [ ] Renders with pig renderer without crash
- [ ] Behaves as a creature mob (passive pig baseline)

> Note: companion taming / follow / fight AI from the legacy 1.6.4 mod is **not** fully reimplemented yet; companions currently use vanilla Pig behavior as placeholders.

## 5. Item functionality — saddle & steering

- [ ] Spawn a vanilla pig: `/summon minecraft:pig`
- [ ] Right-click / interact with **Upgraded Saddle** on the pig
- [ ] Pig becomes saddled / mountable (Equippable saddle component)
- [ ] Player can mount the saddled pig
- [ ] While mounted, hold **Potato on a Stick** and boost/control movement (ItemSteerable)
- [ ] Using Potato on a Stick while steering consumes durability
- [ ] Potato on a Stick works against mod pig variants that use Pig / ItemSteerable (spot-check at least one armored + one companion)

## 6. Localization

- [ ] `item.pigcompanion.potato_on_a_stick` → "Potato on a Stick"
- [ ] `item.pigcompanion.upgraded_saddle` → "Upgraded Saddle"
- [ ] All eight entity translation keys resolve (armored + companion leather/iron/gold/diamond)

## 7. Assets / client items

- [ ] Item models resolve via `assets/pigcompanion/items/*.json` (no missing-model)
- [ ] Item textures from `textures/item/` display correctly
- [ ] Entity pig textures under `textures/entity/pig/` are present in the JAR (custom skins may not apply until custom renderers are wired; confirm no client crash)

## 8. Stability / smoke

- [ ] Spawn ~5 of each pig variant; no crash, acceptable FPS
- [ ] Relog with entities in world; world loads
- [ ] Leave and rejoin multiplayer / LAN (if available)
- [ ] No recurring log spam from pigcompanion

## Known limitations (do not fail playtest for these)

- Custom armored textures / companion AI / fighting behavior from the original Forge 1.6.4 mod are not fully ported; entities are vanilla-Pig-based placeholders with distinct registry IDs.
- No spawn eggs registered yet — use `/summon`.
- No custom loot tables beyond crafting recipes.

## Sign-off

| Field | Value |
|-------|-------|
| Tester | |
| Date (PT) | |
| MC / Loader / API | 26.2 / 0.19.5 / 0.159.0+26.2 |
| Result | PASS / FAIL |
| Notes | |
