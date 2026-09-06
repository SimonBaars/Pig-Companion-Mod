package com.simonbaars.pigcompanion.client;

import com.simonbaars.pigcompanion.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.PigRenderer;

public class PigCompanionModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRenderers.register(ModEntities.PIG_LEATHER, PigRenderer::new);
		EntityRenderers.register(ModEntities.PIG_IRON, PigRenderer::new);
		EntityRenderers.register(ModEntities.PIG_GOLD, PigRenderer::new);
		EntityRenderers.register(ModEntities.PIG_DIAMOND, PigRenderer::new);

		EntityRenderers.register(ModEntities.PIG_COMPANION_LEATHER, PigRenderer::new);
		EntityRenderers.register(ModEntities.PIG_COMPANION_IRON, PigRenderer::new);
		EntityRenderers.register(ModEntities.PIG_COMPANION_GOLD, PigRenderer::new);
		EntityRenderers.register(ModEntities.PIG_COMPANION_DIAMOND, PigRenderer::new);
	}
}
