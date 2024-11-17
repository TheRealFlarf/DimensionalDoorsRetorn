
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimdoorsretorn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dimdoorsretorn.client.renderer.MonolithRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DimdoorsRetornModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DimdoorsRetornModEntities.MONOLITH.get(), MonolithRenderer::new);
	}
}
