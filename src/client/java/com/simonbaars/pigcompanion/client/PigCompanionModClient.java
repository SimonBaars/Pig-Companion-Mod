package com.simonbaars.pigcompanion.client;

import com.simonbaars.pigcompanion.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.renderer.entity.EntityRenderers;

/**
 * Client-side initialization for Pig Companion Mod.
 * Registers custom entity renderers using MC 26.2 RenderState pattern.
 */
public class PigCompanionModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Register model layer (shared by all pig variants)
		ModelLayerRegistry.registerModelLayer(ModModelLayers.PIG_COMPANION, PigCompanionModel::createBodyLayer);
		
		// Register ArmoredPig renderers (4 variants)
		EntityRenderers.register(ModEntities.PIG_LEATHER, ArmoredPigRenderer.Leather::new);
		EntityRenderers.register(ModEntities.PIG_IRON, ArmoredPigRenderer.Iron::new);
		EntityRenderers.register(ModEntities.PIG_GOLD, ArmoredPigRenderer.Gold::new);
		EntityRenderers.register(ModEntities.PIG_DIAMOND, ArmoredPigRenderer.Diamond::new);
		
		// Register CompanionPig renderers (4 variants)
		EntityRenderers.register(ModEntities.PIG_COMPANION_LEATHER, CompanionPigRenderer.Leather::new);
		EntityRenderers.register(ModEntities.PIG_COMPANION_IRON, CompanionPigRenderer.Iron::new);
		EntityRenderers.register(ModEntities.PIG_COMPANION_GOLD, CompanionPigRenderer.Gold::new);
		EntityRenderers.register(ModEntities.PIG_COMPANION_DIAMOND, CompanionPigRenderer.Diamond::new);
		
		// Register SuperPig renderer
		EntityRenderers.register(ModEntities.SUPER_PIG, SuperPigRenderer::new);
	}
}
