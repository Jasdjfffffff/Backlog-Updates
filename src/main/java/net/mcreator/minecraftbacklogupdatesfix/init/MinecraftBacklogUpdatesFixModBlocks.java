
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftbacklogupdatesfix.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecraftbacklogupdatesfix.block.BaobabTrunkBlock;
import net.mcreator.minecraftbacklogupdatesfix.block.BaobabFlowerBlock;
import net.mcreator.minecraftbacklogupdatesfix.MinecraftBacklogUpdatesFixMod;

public class MinecraftBacklogUpdatesFixModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftBacklogUpdatesFixMod.MODID);
	public static final RegistryObject<Block> BAOBAB_FLOWER = REGISTRY.register("baobab_flower", () -> new BaobabFlowerBlock());
	public static final RegistryObject<Block> BAOBAB_TRUNK = REGISTRY.register("baobab_trunk", () -> new BaobabTrunkBlock());
}
