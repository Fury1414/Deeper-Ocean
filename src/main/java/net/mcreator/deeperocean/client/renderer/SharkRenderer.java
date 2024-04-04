
package net.mcreator.deeperocean.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.deeperocean.entity.SharkEntity;
import net.mcreator.deeperocean.client.model.Modelshark;

import com.mojang.blaze3d.vertex.PoseStack;

public class SharkRenderer extends MobRenderer<SharkEntity, Modelshark<SharkEntity>> {
	public SharkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshark(context.bakeLayer(Modelshark.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(SharkEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SharkEntity entity) {
		return new ResourceLocation("deeper_ocean:textures/entities/texture.png");
	}
}
