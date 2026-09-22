package com.simonbaars.pigcompanion.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simonbaars.pigcompanion.PigCompanionMod;
import com.simonbaars.pigcompanion.entity.CompanionPigEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;

/**
 * Renderer for CompanionPigEntity (leather, iron, gold, diamond variants).
 * Follows MC 26.2 RenderState pattern from Tractor mod.
 */
public class CompanionPigRenderer extends EntityRenderer<CompanionPigEntity, PigCompanionRenderState> {
	private static final Identifier LEATHER = PigCompanionMod.id("textures/entity/pig/pig_companion_leather.png");
	private static final Identifier IRON = PigCompanionMod.id("textures/entity/pig/pig_companion_iron.png");
	private static final Identifier GOLD = PigCompanionMod.id("textures/entity/pig/pig_companion_gold.png");
	private static final Identifier DIAMOND = PigCompanionMod.id("textures/entity/pig/pig_companion_diamond.png");
	
	private final EntityModel<net.minecraft.client.renderer.entity.state.EntityRenderState> model;

	public CompanionPigRenderer(EntityRendererProvider.Context context) {
		super(context);
		this.shadowRadius = 0.5F;
		this.model = new PigCompanionModel(context.bakeLayer(ModModelLayers.PIG_COMPANION));
	}

	@Override
	public PigCompanionRenderState createRenderState() {
		return new PigCompanionRenderState();
	}

	@Override
	public void extractRenderState(CompanionPigEntity entity, PigCompanionRenderState state, float partialTick) {
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
		
		Identifier texture = getTexture(state);
		
		collector.submitModel(model, state, poseStack, texture, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor, null);
		poseStack.popPose();
		super.submit(state, poseStack, collector, camera);
	}
	
	protected Identifier getTexture(PigCompanionRenderState state) {
		return LEATHER;
	}
	
	// Factory methods for each variant
	public static class Leather extends CompanionPigRenderer {
		public Leather(EntityRendererProvider.Context context) {
			super(context);
		}
		
		@Override
		protected Identifier getTexture(PigCompanionRenderState state) {
			return LEATHER;
		}
	}
	
	public static class Iron extends CompanionPigRenderer {
		public Iron(EntityRendererProvider.Context context) {
			super(context);
		}
		
		@Override
		protected Identifier getTexture(PigCompanionRenderState state) {
			return IRON;
		}
	}
	
	public static class Gold extends CompanionPigRenderer {
		public Gold(EntityRendererProvider.Context context) {
			super(context);
		}
		
		@Override
		protected Identifier getTexture(PigCompanionRenderState state) {
			return GOLD;
		}
	}
	
	public static class Diamond extends CompanionPigRenderer {
		public Diamond(EntityRendererProvider.Context context) {
			super(context);
		}
		
		@Override
		protected Identifier getTexture(PigCompanionRenderState state) {
			return DIAMOND;
		}
	}
}
