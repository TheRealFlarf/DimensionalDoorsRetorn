
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimdoorsretorn.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.dimdoorsretorn.DimdoorsRetornMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DimdoorsRetornModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DimdoorsRetornMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(DimdoorsRetornModItems.MONOLITH_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {

			tabData.accept(DimdoorsRetornModBlocks.FABRIC_OF_REALITY.get().asItem());

		}
	}
}
