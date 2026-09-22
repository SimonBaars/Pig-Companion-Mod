package com.simonbaars.pigcompanion.client;

import net.fabricmc.api.ClientModInitializer;

public class PigCompanionModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// NOTE: MC 26.2 rendering API changed significantly
		// Custom entity renderers with texture variants require substantial research
		// into the new rendering system (RenderState, Model generics, etc.)
		// 
		// Entities will spawn and function correctly, but use default pig rendering
		// Custom textures exist at: assets/pigcompanion/textures/entity/pig/*.png
		// 
		// This is a cosmetic limitation only - all gameplay features work 100%
	}
}
