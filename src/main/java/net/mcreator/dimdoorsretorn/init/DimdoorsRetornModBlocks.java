
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimdoorsretorn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dimdoorsretorn.block.FabricOfRealityBlock;
import net.mcreator.dimdoorsretorn.DimdoorsRetornMod;

public class DimdoorsRetornModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DimdoorsRetornMod.MODID);
	public static final RegistryObject<Block> FABRIC_OF_REALITY = REGISTRY.register("fabric_of_reality", () -> new FabricOfRealityBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
