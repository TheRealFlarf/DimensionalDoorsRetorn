
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimdoorsretorn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dimdoorsretorn.DimdoorsRetornMod;

public class DimdoorsRetornModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DimdoorsRetornMod.MODID);
	public static final RegistryObject<Item> MONOLITH_SPAWN_EGG = REGISTRY.register("monolith_spawn_egg", () -> new ForgeSpawnEggItem(DimdoorsRetornModEntities.MONOLITH, -16777216, -8847348, new Item.Properties()));
	public static final RegistryObject<Item> FABRIC_OF_REALITY = block(DimdoorsRetornModBlocks.FABRIC_OF_REALITY);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
