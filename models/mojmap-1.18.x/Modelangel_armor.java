// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelangel_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "angel_armor"), "main");
	private final ModelPart armorHead;

	public Modelangel_armor(ModelPart root) {
		this.armorHead = root.getChild("armorHead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition armorHead = partdefinition.addOrReplaceChild("armorHead", CubeListBuilder.create()
				.texOffs(56, 26).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F))
				.texOffs(114, 38).addBox(-1.1509F, -0.8247F, -7.1176F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(77, 119).addBox(0.7491F, -2.1247F, -7.3176F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(47, 119).addBox(-1.8491F, -2.1247F, -7.3176F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(34, 122).addBox(-0.5F, -8.5F, 3.9F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 99).addBox(-0.5F, -9.9F, -3.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorHead_r1 = armorHead.addOrReplaceChild("armorHead_r1",
				CubeListBuilder.create().texOffs(96, 94).addBox(-4.4158F, -1.545F, 0.0125F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.2915F, -5.2625F, 0.0F, 0.0F, 0.2094F));

		PartDefinition armorHead_r2 = armorHead.addOrReplaceChild("armorHead_r2",
				CubeListBuilder.create().texOffs(60, 79).addBox(-0.5F, -3.0374F, -2.0875F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.2915F, -5.2625F, 0.2793F, 0.0F, 0.0F));

		PartDefinition armorHead_r3 = armorHead.addOrReplaceChild("armorHead_r3",
				CubeListBuilder.create().texOffs(98, 34).addBox(3.4158F, -1.545F, 0.0125F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.2915F, -5.2625F, 0.0F, 0.0F, -0.2094F));

		PartDefinition armorHead_r4 = armorHead.addOrReplaceChild("armorHead_r4",
				CubeListBuilder.create().texOffs(99, 43)
						.addBox(-0.5F, 1.0F, -4.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(92, 25)
						.addBox(-0.5F, 0.0F, -4.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(82, 0)
						.addBox(-0.5F, -1.0F, -4.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(44, 68)
						.addBox(-0.5F, -2.0F, -4.25F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.372F, -8.9419F, -2.0482F, 0.5773F, -0.6384F, -0.005F));

		PartDefinition armorHead_r5 = armorHead.addOrReplaceChild("armorHead_r5",
				CubeListBuilder.create().texOffs(88, 77).addBox(-0.743F, -4.433F, -1.6518F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.2915F, -5.2625F, 0.4443F, 0.7987F, 0.1634F));

		PartDefinition armorHead_r6 = armorHead.addOrReplaceChild("armorHead_r6",
				CubeListBuilder.create().texOffs(84, 90).addBox(-2.657F, -4.433F, -1.6518F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.2915F, -5.2625F, 0.4443F, -0.7987F, -0.1634F));

		PartDefinition armorHead_r7 = armorHead.addOrReplaceChild("armorHead_r7",
				CubeListBuilder.create().texOffs(98, 51).addBox(0.0F, -0.7F, -3.8F, 1.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -9.2F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition armorHead_r8 = armorHead.addOrReplaceChild("armorHead_r8",
				CubeListBuilder.create().texOffs(74, 87).addBox(-0.5F, -0.6F, -1.9F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.7281F, -3.9734F, 0.8901F, 0.0F, 0.0F));

		PartDefinition armorHead_r9 = armorHead.addOrReplaceChild("armorHead_r9",
				CubeListBuilder.create().texOffs(95, 94).addBox(-1.0F, -0.7F, -3.8F, 1.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -9.2F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition armorHead_r10 = armorHead.addOrReplaceChild("armorHead_r10",
				CubeListBuilder.create().texOffs(60, 15)
						.addBox(-0.5F, -2.0F, -4.25F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(72, 87)
						.addBox(-0.5F, 0.0F, -4.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(77, 77)
						.addBox(-0.5F, -1.0F, -4.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(95, 7)
						.addBox(-0.5F, 1.0F, -4.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.372F, -8.9419F, -2.0482F, 0.5773F, 0.6384F, 0.005F));

		PartDefinition armorHead_r11 = armorHead.addOrReplaceChild("armorHead_r11",
				CubeListBuilder.create().texOffs(40, 85)
						.addBox(-4.55F, 1.65F, -2.8F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 85)
						.addBox(-3.55F, -0.35F, -2.8F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4687F, -7.0143F, 0.2422F, 0.0F, 0.0F, -0.5236F));

		PartDefinition armorHead_r12 = armorHead.addOrReplaceChild("armorHead_r12",
				CubeListBuilder.create().texOffs(84, 61).addBox(-1.0F, 0.0F, -1.1F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -9.2F, 4.5F, -0.6981F, 0.0F, 0.0F));

		PartDefinition armorHead_r13 = armorHead.addOrReplaceChild("armorHead_r13",
				CubeListBuilder.create().texOffs(84, 58)
						.addBox(-1.35F, -0.35F, -2.8F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(84, 50)
						.addBox(-0.35F, 1.65F, -2.8F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4686F, -7.0143F, 0.2422F, 0.0F, 0.0F, 0.5236F));

		PartDefinition armorHead_r14 = armorHead.addOrReplaceChild("armorHead_r14",
				CubeListBuilder.create().texOffs(106, 121).mirror()
						.addBox(-2.7129F, -5.9678F, 1.8116F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(30, 120).mirror()
						.addBox(-2.7129F, -6.9678F, 0.8116F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.2915F, -5.2625F, -1.3737F, -1.0996F, 0.2826F));

		PartDefinition armorHead_r15 = armorHead.addOrReplaceChild("armorHead_r15", CubeListBuilder.create()
				.texOffs(106, 121).addBox(1.7129F, -5.9678F, 1.8116F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 120).addBox(1.7129F, -6.9678F, 0.8116F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.2915F, -5.2625F, -1.3737F, 1.0996F, -0.2826F));

		PartDefinition armorHead_r16 = armorHead.addOrReplaceChild("armorHead_r16",
				CubeListBuilder.create().texOffs(10, 116).addBox(0.4879F, 0.8919F, -0.2908F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.2915F, -5.2625F, 0.1563F, 0.7987F, 0.1634F));

		PartDefinition armorHead_r17 = armorHead.addOrReplaceChild("armorHead_r17",
				CubeListBuilder.create().texOffs(102, 115).addBox(-2.8879F, 0.8919F, -0.2908F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.2915F, -5.2625F, 0.1563F, -0.7987F, -0.1634F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		armorHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}