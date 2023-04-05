package net.mcreator.midnightweapons.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelUndead_King<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("midnight_weapons", "model_undead_king"), "main");
	public final ModelPart HITBOX;
	public final ModelPart body;

	public ModelUndead_King(ModelPart root) {
		this.HITBOX = root.getChild("HITBOX");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition HITBOX = partdefinition.addOrReplaceChild("HITBOX", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -28.0F, -7.0F, 18.0F, 49.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, -4.0F, -6.0F, 12.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 5.9671F, 2.772F, 12.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, 4.5F));
		PartDefinition cube_r1 = leg1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 1.0F, -0.03F, 12.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.5F, 3.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = leg1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -1.0F, -0.5F, 12.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 5.9671F, -2.772F, 12.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -5.5F));
		PartDefinition cube_r3 = leg2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 1.0F, 0.0F, 12.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.5F, -2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r4 = leg2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -1.0F, -0.5F, 12.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition leg3 = body.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -1.5F, -0.5F));
		PartDefinition bone28 = leg3.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition bone29 = bone28.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -6.0F, 0.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition leg4 = body.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -1.5F, -0.5F));
		PartDefinition bone30 = leg4.addOrReplaceChild("bone30", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition bone31 = bone30.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -6.0F, 0.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition body1 = body4.addOrReplaceChild("body1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.75F, -8.53F, -7.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.78F, -9.5F, -7.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.75F, -8.53F, -7.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(4.75F, -9.5F, -7.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -8.0F, -5.0F, 14.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition cube_r5 = body1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.015F, -8.0F, -5.0F, 0.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0139F, -7.9943F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r6 = body1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.015F, -8.0F, -5.0F, 0.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0139F, -7.9943F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r7 = body1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-8.5F, -8.0F, -0.015F, 18.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -8.0F, 5.015F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r8 = body1.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.2575F, -0.0225F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.2575F, -0.9925F, -3.5F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.2425F, -0.0225F, -3.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(8.2125F, -0.9925F, -3.5F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9925F, 1.4925F, -3.5F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r9 = body1.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -0.2725F, -1.0075F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, -1.2425F, -0.0075F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -2.0075F, -6.4925F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r10 = body1.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5075F, -3.0F, -0.9925F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5075F, -3.0F, -0.0225F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0075F, -5.5F, -6.5075F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r11 = body1.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.4775F, -3.0F, -0.9925F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.5075F, -3.0F, -0.0225F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0075F, -5.5F, -6.5075F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r12 = body1.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.2725F, -1.0075F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -1.2425F, -0.0075F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -2.0075F, -6.4925F, 0.0F, 0.0F, 0.3927F));
		PartDefinition h_head = body1.addOrReplaceChild("h_head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -10.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.97F, -12.0F, -3.03F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -12.0F, -3.03F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -12.0F, -3.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -12.0F, 2.97F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));
		PartDefinition cube_r13 = h_head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -0.5F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.8839F, -4.4697F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r14 = h_head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.45F, -0.75F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.45F, -6.0F, -5.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r15 = h_head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-0.45F, -2.0F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.45F, -5.8232F, -3.409F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hand1 = body1.addOrReplaceChild("hand1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -5.0F, -1.0F));
		PartDefinition bone3 = hand1.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));
		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.5F, -0.015F, 7.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.5F, -2.985F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.015F, -5.5F, 7.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0057F, 2.9861F, 0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.5F, -0.015F, 7.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0057F, 0.5F, 2.9861F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.015F, -5.5F, 7.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -3.015F, 0.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition bone2 = bone3.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -2.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.0F, 1.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(11.0F, -1.0F, 0.0F));
		PartDefinition ping1 = bone2.addOrReplaceChild("ping1", CubeListBuilder.create().texOffs(0, 0).addBox(0.064F, 0.0F, 1.7681F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.064F, 0.0F, -2.7681F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 1.0F, 0.5F));
		PartDefinition bone13 = ping1.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0456F, 0.0F, 1.7709F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.0456F, 0.0F, -2.7709F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.0F, 0.0F));
		PartDefinition pinge = bone2.addOrReplaceChild("pinge", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 2.0F, -3.0F));
		PartDefinition cube_r20 = pinge.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.5F, 0.5F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hand2 = body1.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -5.0F, -1.0F));
		PartDefinition bone20 = hand2.addOrReplaceChild("bone20",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 0.0F, 0.0F));
		PartDefinition cube_r21 = bone20.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -5.5F, -0.015F, 7.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.5F, -2.985F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r22 = bone20.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -0.015F, -5.5F, 7.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0057F, 2.9861F, 0.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r23 = bone20.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -5.5F, -0.015F, 7.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0057F, 0.5F, 2.9861F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r24 = bone20.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -0.015F, -5.5F, 7.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -3.015F, 0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition book = bone20.addOrReplaceChild("book", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, 0.0F, -7.0F, 11.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.0F, 5.0F, 0.0F));
		PartDefinition bone37 = book.addOrReplaceChild("bone37", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -2.0F, -7.0F, 11.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone21 = bone20.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-6.5978F, 2.1539F, -3.8124F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, 1.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.0F, -1.0F, 0.0F));
		PartDefinition cube_r25 = bone21.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 2.5F, -2.5F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r26 = bone21.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, -1.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.5F, -0.5F, -3.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.5F, -0.5F, 0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.7748F, 0.926F, 1.25F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r27 = bone21.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-3.0F, -0.5F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -0.5F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.5F, 0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition sas2 = body1.addOrReplaceChild("sas2",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -7.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, -4.0F));
		PartDefinition bone8 = sas2.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.0F, -1.0F, -7.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -7.0F));
		PartDefinition bone7 = bone8.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -7.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -7.0F));
		PartDefinition sas4 = body1.addOrReplaceChild("sas4",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -7.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 0.0F, -4.0F));
		PartDefinition bone32 = sas4.addOrReplaceChild("bone32",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.0F, -1.0F, -7.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -7.0F));
		PartDefinition bone33 = bone32.addOrReplaceChild("bone33",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -7.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 0.0F, -7.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -7.0F));
		PartDefinition back = body1.addOrReplaceChild("back",
				CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -0.5F, -0.5F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.5F, 4.5F));
		PartDefinition bone34 = back.addOrReplaceChild("bone34",
				CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -0.5F, -0.5F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition bone35 = bone34.addOrReplaceChild("bone35",
				CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -0.03F, -0.5F, 6.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(3.0F, -0.03F, -0.5F, 6.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		HITBOX.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
