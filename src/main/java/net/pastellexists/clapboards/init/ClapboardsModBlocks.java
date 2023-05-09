
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.pastellexists.clapboards.init;

import net.pastellexists.clapboards.block.WarpedClapboardBlock;
import net.pastellexists.clapboards.block.SpruceClapboardBlock;
import net.pastellexists.clapboards.block.PaintedClapboardBlock;
import net.pastellexists.clapboards.block.OakClapboardBlock;
import net.pastellexists.clapboards.block.MangroveClapboardBlock;
import net.pastellexists.clapboards.block.JungleClapboardBlock;
import net.pastellexists.clapboards.block.DarkOakClapboardBlock;
import net.pastellexists.clapboards.block.CrimsonClapboardBlock;
import net.pastellexists.clapboards.block.CherryClapboardBlock;
import net.pastellexists.clapboards.block.BirchClapboardBlock;
import net.pastellexists.clapboards.block.BambooClapboardBlock;
import net.pastellexists.clapboards.block.AcaciaClapboardBlock;
import net.pastellexists.clapboards.ClapboardsMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class ClapboardsModBlocks {
	public static Block SPRUCE_CLAPBOARD;
	public static Block OAK_CLAPBOARD;
	public static Block BIRCH_CLAPBOARD;
	public static Block JUNGLE_CLAPBOARD;
	public static Block DARK_OAK_CLAPBOARD;
	public static Block ACACIA_CLAPBOARD;
	public static Block MANGROVE_CLAPBOARD;
	public static Block PAINTED_CLAPBOARD;
	public static Block WARPED_CLAPBOARD;
	public static Block CRIMSON_CLAPBOARD;
	public static Block CHERRY_CLAPBOARD;
	public static Block BAMBOO_CLAPBOARD;

	public static void load() {
		SPRUCE_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "spruce_clapboard"), new SpruceClapboardBlock());
		OAK_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "oak_clapboard"), new OakClapboardBlock());
		BIRCH_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "birch_clapboard"), new BirchClapboardBlock());
		JUNGLE_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "jungle_clapboard"), new JungleClapboardBlock());
		DARK_OAK_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "dark_oak_clapboard"), new DarkOakClapboardBlock());
		ACACIA_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "acacia_clapboard"), new AcaciaClapboardBlock());
		MANGROVE_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "mangrove_clapboard"), new MangroveClapboardBlock());
		PAINTED_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "painted_clapboard"), new PaintedClapboardBlock());
		WARPED_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "warped_clapboard"), new WarpedClapboardBlock());
		CRIMSON_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "crimson_clapboard"), new CrimsonClapboardBlock());
		CHERRY_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "cherry_clapboard"), new CherryClapboardBlock());
		BAMBOO_CLAPBOARD = Registry.register(Registry.BLOCK, new ResourceLocation(ClapboardsMod.MODID, "bamboo_clapboard"), new BambooClapboardBlock());
	}

	public static void clientLoad() {
		SpruceClapboardBlock.clientInit();
		OakClapboardBlock.clientInit();
		BirchClapboardBlock.clientInit();
		JungleClapboardBlock.clientInit();
		DarkOakClapboardBlock.clientInit();
		AcaciaClapboardBlock.clientInit();
		MangroveClapboardBlock.clientInit();
		PaintedClapboardBlock.clientInit();
		WarpedClapboardBlock.clientInit();
		CrimsonClapboardBlock.clientInit();
		CherryClapboardBlock.clientInit();
		BambooClapboardBlock.clientInit();
	}
}
