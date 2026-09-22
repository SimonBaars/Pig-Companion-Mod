package com.simonbaars.pigcompanion.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simonbaars.pigcompanion.PigCompanionMod;
import com.simonbaars.pigcompanion.entity.SuperPigEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;

/**
 * Renderer for SuperPigEntity.
 * Follows MC 26.2 RenderState pattern from Tractor mod.
 */
public class SuperPigRenderer extends EntityRenderer<SuperPigEntity, PigCompanionRenderState> {
	private static final Identifier TEXTURE = PigCompanionMod.id("textures/entity/pig/pig.png");
	
	private final EntityModel<net.minecraft.client.renderer.entity.state.EntityRenderState> model;

	public SuperPigRenderer(EntityRendererProvider.Context context) {
		super(context);
		this.shadowRadius = 0.5F;
		this.model = new PigCompanionModel(context.bakeLayer(ModModelLayers.PIG_COMPANION));
	}

	@Override
	public PigCompanionRenderState createRenderState() {
		return new PigCompanionRenderState();
	}

	@Override
	public void extractRenderState(SuperPigEntity entity, PigCompanionRenderState state, float partialTick) {
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
		
		collector.submitModel(model, state, poseStack, TEXTURE, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor, null);
		poseStack.popPose();
		super.submit(state, poseStack, collector, camera);
	}
}
