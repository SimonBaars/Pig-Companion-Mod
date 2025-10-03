package com.simonbaars.pigcompanion.client;

import com.simonbaars.pigcompanion.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.PigEntityRenderer;

public class PigCompanionModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Register entity renderers
		EntityRendererRegistry.register(ModEntities.PIG_LEATHER, PigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_IRON, PigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_GOLD, PigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_DIAMOND, PigEntityRenderer::new);
		
		EntityRendererRegistry.register(ModEntities.PIG_COMPANION_LEATHER, PigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_COMPANION_IRON, PigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_COMPANION_GOLD, PigEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIG_COMPANION_DIAMOND, PigEntityRenderer::new);
	}
}
