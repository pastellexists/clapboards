
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pastellexists.clapboards.init;

import net.pastellexists.clapboards.ClapboardsMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class ClapboardsModItems {
	public static Item SPRUCE_CLAPBOARD;
	public static Item OAK_CLAPBOARD;
	public static Item BIRCH_CLAPBOARD;
	public static Item JUNGLE_CLAPBOARD;
	public static Item DARK_OAK_CLAPBOARD;
	public static Item ACACIA_CLAPBOARD;
	public static Item MANGROVE_CLAPBOARD;
	public static Item PAINTED_CLAPBOARD;
	public static Item WARPED_CLAPBOARD;
	public static Item CRIMSON_CLAPBOARD;
	public static Item CHERRY_CLAPBOARD;
	public static Item BAMBOO_CLAPBOARD;

	public static void load() {
		SPRUCE_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "spruce_clapboard"), new BlockItem(ClapboardsModBlocks.SPRUCE_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		OAK_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "oak_clapboard"), new BlockItem(ClapboardsModBlocks.OAK_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		BIRCH_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "birch_clapboard"), new BlockItem(ClapboardsModBlocks.BIRCH_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		JUNGLE_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "jungle_clapboard"), new BlockItem(ClapboardsModBlocks.JUNGLE_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		DARK_OAK_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "dark_oak_clapboard"), new BlockItem(ClapboardsModBlocks.DARK_OAK_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		ACACIA_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "acacia_clapboard"), new BlockItem(ClapboardsModBlocks.ACACIA_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		MANGROVE_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "mangrove_clapboard"), new BlockItem(ClapboardsModBlocks.MANGROVE_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		PAINTED_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "painted_clapboard"), new BlockItem(ClapboardsModBlocks.PAINTED_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		WARPED_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "warped_clapboard"), new BlockItem(ClapboardsModBlocks.WARPED_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		CRIMSON_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "crimson_clapboard"), new BlockItem(ClapboardsModBlocks.CRIMSON_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		CHERRY_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "cherry_clapboard"), new BlockItem(ClapboardsModBlocks.CHERRY_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
		BAMBOO_CLAPBOARD = Registry.register(Registry.ITEM, new ResourceLocation(ClapboardsMod.MODID, "bamboo_clapboard"), new BlockItem(ClapboardsModBlocks.BAMBOO_CLAPBOARD, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	}
}
