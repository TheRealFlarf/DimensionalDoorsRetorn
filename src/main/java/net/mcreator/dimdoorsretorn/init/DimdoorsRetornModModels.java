
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimdoorsretorn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dimdoorsretorn.client.model.ModelMonolith;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DimdoorsRetornModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelMonolith.LAYER_LOCATION, ModelMonolith::createBodyLayer);
	}
}
