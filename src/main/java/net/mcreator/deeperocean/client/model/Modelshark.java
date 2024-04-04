package net.mcreator.deeperocean.client.model;

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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelshark<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("deeper_ocean", "modelshark"), "main");
	public final ModelPart bone;
	public final ModelPart queuefin;
	public final ModelPart lienqueuefin;
	public final ModelPart corpsarrire;
	public final ModelPart ailerongauche;
	public final ModelPart ailerondroit;
	public final ModelPart aileronhaut;
	public final ModelPart bouche;

	public Modelshark(ModelPart root) {
		this.bone = root.getChild("bone");
		this.queuefin = root.getChild("queuefin");
		this.lienqueuefin = root.getChild("lienqueuefin");
		this.corpsarrire = root.getChild("corpsarrire");
		this.ailerongauche = root.getChild("ailerongauche");
		this.ailerondroit = root.getChild("ailerondroit");
		this.aileronhaut = root.getChild("aileronhaut");
		this.bouche = root.getChild("bouche");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.5F, -6.5F, -8.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -7.0F, -4.0F, 6.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition queuefin = partdefinition.addOrReplaceChild("queuefin", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -7.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 24.0F, 14.0F));
		PartDefinition lienqueuefin = partdefinition.addOrReplaceChild("lienqueuefin", CubeListBuilder.create().texOffs(18, 25).addBox(-0.5F, -5.5F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition corpsarrire = partdefinition.addOrReplaceChild("corpsarrire", CubeListBuilder.create().texOffs(14, 18).addBox(-2.0F, -6.0F, 7.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition aileronarriere = corpsarrire.addOrReplaceChild("aileronarriere", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = aileronarriere.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(6, 3).addBox(-0.5F, -1.5F, 11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(-0.5F, 0.5F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 25)
						.addBox(1.0F, -0.5F, 6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 6).addBox(-2.0F, -0.5F, 6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition ailerongauche = partdefinition.addOrReplaceChild("ailerongauche", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition aileronghauche_r1 = ailerongauche.addOrReplaceChild("aileronghauche_r1", CubeListBuilder.create().texOffs(23, 3).addBox(1.0F, -4.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition ailerondroit = partdefinition.addOrReplaceChild("ailerondroit", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition ailerondroit_r1 = ailerondroit.addOrReplaceChild("ailerondroit_r1", CubeListBuilder.create().texOffs(23, 0).addBox(-4.0F, -4.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition aileronhaut = partdefinition.addOrReplaceChild("aileronhaut", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition aileronthaut_r1 = aileronhaut.addOrReplaceChild("aileronthaut_r1", CubeListBuilder.create().texOffs(0, 7).addBox(-10.0F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 1.5708F));
		PartDefinition bouche = partdefinition.addOrReplaceChild("bouche", CubeListBuilder.create().texOffs(0, 22).addBox(-2.0F, -4.0F, -7.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		queuefin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lienqueuefin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		corpsarrire.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ailerongauche.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ailerondroit.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		aileronhaut.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bouche.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
