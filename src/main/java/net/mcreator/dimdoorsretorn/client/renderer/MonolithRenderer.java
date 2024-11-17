
package net.mcreator.dimdoorsretorn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.dimdoorsretorn.entity.MonolithEntity;
import net.mcreator.dimdoorsretorn.client.model.ModelMonolith;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MonolithRenderer extends MobRenderer<MonolithEntity, ModelMonolith<MonolithEntity>> {
	public MonolithRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMonolith(context.bakeLayer(ModelMonolith.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<MonolithEntity, ModelMonolith<MonolithEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("dimdoors_retorn:textures/entities/monolith.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MonolithEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MonolithEntity entity) {
		return new ResourceLocation("dimdoors_retorn:textures/entities/monolith.png");
	}
}
