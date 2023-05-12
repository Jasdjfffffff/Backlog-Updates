
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftbacklogupdatesfix.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecraftbacklogupdatesfix.item.RawOsterichItem;
import net.mcreator.minecraftbacklogupdatesfix.item.CookedOstrichItem;
import net.mcreator.minecraftbacklogupdatesfix.MinecraftBacklogUpdatesFixMod;

public class MinecraftBacklogUpdatesFixModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftBacklogUpdatesFixMod.MODID);
	public static final RegistryObject<Item> OSTRICH_SPAWN_EGG = REGISTRY.register("ostrich_spawn_egg", () -> new ForgeSpawnEggItem(MinecraftBacklogUpdatesFixModEntities.OSTRICH, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BAOBAB_FLOWER = block(MinecraftBacklogUpdatesFixModBlocks.BAOBAB_FLOWER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RAW_OSTERICH = REGISTRY.register("raw_osterich", () -> new RawOsterichItem());
	public static final RegistryObject<Item> COOKED_OSTRICH = REGISTRY.register("cooked_ostrich", () -> new CookedOstrichItem());
	public static final RegistryObject<Item> BAOBAB_TRUNK = block(MinecraftBacklogUpdatesFixModBlocks.BAOBAB_TRUNK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
