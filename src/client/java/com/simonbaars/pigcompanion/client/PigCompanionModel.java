package com.simonbaars.pigcompanion.client;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.util.Mth;

/**
 * Pig model geometry matching vanilla pig (64x32 texture).
 * Based on vanilla PigModel but adapted for EntityRenderState instead of entity-specific state.
 */
public class PigCompanionModel extends EntityModel<EntityRenderState> {
	private final ModelPart head;
	private final ModelPart body;

	public PigCompanionModel(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = new MeshDefinition();
		PartDefinition root = mesh.getRoot();

		// Head: 8x8x8 box at (0, 12, -6)
		PartDefinition head = root.addOrReplaceChild(
			"head",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F)
				.texOffs(16, 16).addBox(-2.0F, 0.0F, -9.0F, 4.0F, 3.0F, 1.0F), // snout
			PartPose.offset(0.0F, 12.0F, -6.0F)
		);

		// Body: 16x8x8 box at (0, 11, 2), rotated 90 degrees on X
		root.addOrReplaceChild(
			"body",
			CubeListBuilder.create()
				.texOffs(28, 8).addBox(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 11.0F, 2.0F, Mth.HALF_PI, 0.0F, 0.0F)
		);

		// Right hind leg
		root.addOrReplaceChild(
			"right_hind_leg",
			CubeListBuilder.create()
				.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F),
			PartPose.offset(-3.0F, 18.0F, 7.0F)
		);

		// Left hind leg
		root.addOrReplaceChild(
			"left_hind_leg",
			CubeListBuilder.create()
				.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F),
			PartPose.offset(3.0F, 18.0F, 7.0F)
		);

		// Right front leg
		root.addOrReplaceChild(
			"right_front_leg",
			CubeListBuilder.create()
				.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F),
			PartPose.offset(-3.0F, 18.0F, -5.0F)
		);

		// Left front leg
		root.addOrReplaceChild(
			"left_front_leg",
			CubeListBuilder.create()
				.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F),
			PartPose.offset(3.0F, 18.0F, -5.0F)
		);

		return LayerDefinition.create(mesh, 64, 32);
	}

	@Override
	public void setupAnim(EntityRenderState state) {
		super.setupAnim(state);
		
		// Baby pigs have bigger heads
		if (state instanceof PigCompanionRenderState pigState && pigState.isBaby) {
			this.head.setPos(0.0F, 12.0F + 5.0F, -6.0F);
		} else {
			this.head.setPos(0.0F, 12.0F, -6.0F);
		}
	}
}
