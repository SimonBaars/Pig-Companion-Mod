package com.simonbaars.pigcompanion.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simonbaars.pigcompanion.PigCompanionMod;
import com.simonbaars.pigcompanion.entity.ArmoredPigEntity;
import com.simonbaars.pigcompanion.entity.ModEntities;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;

/**
 * Renderer for ArmoredPigEntity (leather, iron, gold, diamond variants).
 * Follows MC 26.2 RenderState pattern from Tractor mod.
 */
public class ArmoredPigRenderer extends EntityRenderer<ArmoredPigEntity, PigCompanionRenderState> {
	private static final Identifier LEATHER = PigCompanionMod.id("textures/entity/pig/pig_leather.png");
	private static final Identifier IRON = PigCompanionMod.id("textures/entity/pig/pig_iron.png");
	private static final Identifier GOLD = PigCompanionMod.id("textures/entity/pig/pig_gold.png");
	private static final Identifier DIAMOND = PigCompanionMod.id("textures/entity/pig/pig_diamond.png");
	
	private final EntityModel<net.minecraft.client.renderer.entity.state.EntityRenderState> model;

	public ArmoredPigRenderer(EntityRendererProvider.Context context) {
		super(context);
		this.shadowRadius = 0.5F;
		this.model = new PigCompanionModel(context.bakeLayer(ModModelLayers.PIG_COMPANION));
	}

	@Override
	public PigCompanionRenderState createRenderState() {
		return new PigCompanionRenderState();
	}

	@Override
	public void extractRenderState(ArmoredPigEntity entity, PigCompanionRenderState state, float partialTick) {
		super.extractRenderState(entity, state, partialTick);
		state.isBaby = entity.isBaby();
		state.isSaddled = entity.isSaddled();
	}

	@Override
	public void submit(PigCompanionRenderState state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
		poseStack.pushPose();
		
		// Baby pigs are smaller
		if (state.isBaby) {
			poseStack.scale(0.5F, 0.5F, 0.5F);
			poseStack.translate(0.0F, 1.5F, 0.0F);
		}
		
		// Pick texture based on entity type (stored in state during extraction)
		Identifier texture = getTexture(state);
		
		collector.submitModel(model, state, poseStack, texture, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor, null);
		poseStack.popPose();
		super.submit(state, poseStack, collector, camera);
	}
	
	protected Identifier getTexture(PigCompanionRenderState state) {
		// Default to leather - subclasses or entity type check would determine variant
		// For now, we'll return leather. This will be refined when we register per-type renderers.
		return LEATHER;
	}
	
	// Factory methods for each variant
	public static class Leather extends ArmoredPigRenderer {
		public Leather(EntityRendererProvider.Context context) {
			super(context);
		}
		
		@Override
		protected Identifier getTexture(PigCompanionRenderState state) {
			return LEATHER;
		}
	}
	
	public static class Iron extends ArmoredPigRenderer {
		public Iron(EntityRendererProvider.Context context) {
			super(context);
		}
		
		@Override
		protected Identifier getTexture(PigCompanionRenderState state) {
			return IRON;
		}
	}
	
	public static class Gold extends ArmoredPigRenderer {
		public Gold(EntityRendererProvider.Context context) {
			super(context);
		}
		
		@Override
		protected Identifier getTexture(PigCompanionRenderState state) {
			return GOLD;
		}
	}
	
	public static class Diamond extends ArmoredPigRenderer {
		public Diamond(EntityRendererProvider.Context context) {
			super(context);
		}
		
		@Override
		protected Identifier getTexture(PigCompanionRenderState state) {
			return DIAMOND;
		}
	}
}
