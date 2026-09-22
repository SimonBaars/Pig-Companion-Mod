package com.simonbaars.pigcompanion.client;

import com.simonbaars.pigcompanion.client.render.CustomPigEntityRenderer;
import com.simonbaars.pigcompanion.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class PigCompanionModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Register entity renderers with custom renderer
		EntityRendererRegistry.register(ModEntities.PIG_LEATHER, CustomPigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_IRON, CustomPigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_GOLD, CustomPigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_DIAMOND, CustomPigEntityRenderer::new);
		
		EntityRendererRegistry.register(ModEntities.PIG_COMPANION_LEATHER, CustomPigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_COMPANION_IRON, CustomPigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_COMPANION_GOLD, CustomPigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_COMPANION_DIAMOND, CustomPigEntityRenderer::new);
		
		EntityRendererRegistry.register(ModEntities.SUPER_PIG, CustomPigEntityRenderer::new);
	}
}
