package pastellexists.clapboards;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.block.Blocks.OAK_PLANKS;
import static net.minecraft.block.Blocks.SPRUCE_PLANKS;
import static net.minecraft.block.Blocks.BIRCH_PLANKS;
import static net.minecraft.block.Blocks.JUNGLE_PLANKS;
import static net.minecraft.block.Blocks.ACACIA_PLANKS;
import static net.minecraft.block.Blocks.DARK_OAK_PLANKS;
import static net.minecraft.block.Blocks.MANGROVE_PLANKS;
import static net.minecraft.block.Blocks.CRIMSON_PLANKS;
import static net.minecraft.block.Blocks.WARPED_PLANKS;
import static net.minecraft.block.Blocks.CHERRY_PLANKS;
import static net.minecraft.block.Blocks.BAMBOO_PLANKS;


public class ClapboardsMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("clapboards");
    public static final String MODID = "clapboards";

    public static final Block PAINTED_CLAPBOARD = new Block(FabricBlockSettings.of(Material.WOOD, MapColor.WHITE_GRAY).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD));

    public static final Block OAK_CLAPBOARD = new Block(FabricBlockSettings.copyOf(OAK_PLANKS));
    public static final Block SPRUCE_CLAPBOARD = new Block(FabricBlockSettings.copyOf(SPRUCE_PLANKS));
    public static final Block BIRCH_CLAPBOARD = new Block(FabricBlockSettings.copyOf(BIRCH_PLANKS));
    public static final Block JUNGLE_CLAPBOARD = new Block(FabricBlockSettings.copyOf(JUNGLE_PLANKS));
    public static final Block ACACIA_CLAPBOARD = new Block(FabricBlockSettings.copyOf(ACACIA_PLANKS));
    public static final Block DARK_OAK_CLAPBOARD = new Block(FabricBlockSettings.copyOf(DARK_OAK_PLANKS));
    public static final Block MANGROVE_CLAPBOARD = new Block(FabricBlockSettings.copyOf(MANGROVE_PLANKS));
    public static final Block CRIMSON_CLAPBOARD = new Block(FabricBlockSettings.copyOf(CRIMSON_PLANKS));
    public static final Block WARPED_CLAPBOARD = new Block(FabricBlockSettings.copyOf(WARPED_PLANKS));
    // The following two should not be available unless the 1.20 content experiment is enabled.
    public static final Block CHERRY_CLAPBOARD = new Block(FabricBlockSettings.copyOf(CHERRY_PLANKS));
    public static final Block BAMBOO_CLAPBOARD = new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS));


    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        LOGGER.info("Initializing Clapboards");
        // Register blocks
        Registry.register(Registries.BLOCK, new Identifier(MODID, "painted_clapboard"),  PAINTED_CLAPBOARD);

        Registry.register(Registries.BLOCK, new Identifier(MODID, "oak_clapboard"),      OAK_CLAPBOARD);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "spruce_clapboard"),   SPRUCE_CLAPBOARD);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "birch_clapboard"),    BIRCH_CLAPBOARD);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "jungle_clapboard"),   JUNGLE_CLAPBOARD);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "acacia_clapboard"),   ACACIA_CLAPBOARD);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "dark_oak_clapboard"), DARK_OAK_CLAPBOARD);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "mangrove_clapboard"), MANGROVE_CLAPBOARD);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "crimson_clapboard"),  CRIMSON_CLAPBOARD);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "warped_clapboard"),   WARPED_CLAPBOARD);

        Registry.register(Registries.BLOCK, new Identifier(MODID, "cherry_clapboard"),   CHERRY_CLAPBOARD);
        Registry.register(Registries.BLOCK, new Identifier(MODID, "bamboo_clapboard"),   BAMBOO_CLAPBOARD);

        //Register block items
        Registry.register(Registries.ITEM, new Identifier(MODID, "painted_clapboard"),  new BlockItem(PAINTED_CLAPBOARD, new FabricItemSettings()));

        Registry.register(Registries.ITEM, new Identifier(MODID, "oak_clapboard"),      new BlockItem(OAK_CLAPBOARD, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "spruce_clapboard"),   new BlockItem(SPRUCE_CLAPBOARD, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "birch_clapboard"),    new BlockItem(BIRCH_CLAPBOARD, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "jungle_clapboard"),   new BlockItem(JUNGLE_CLAPBOARD, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "acacia_clapboard"),   new BlockItem(ACACIA_CLAPBOARD, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "dark_oak_clapboard"), new BlockItem(DARK_OAK_CLAPBOARD, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "mangrove_clapboard"), new BlockItem(MANGROVE_CLAPBOARD, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "crimson_clapboard"),  new BlockItem(CRIMSON_CLAPBOARD, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "warped_clapboard"),   new BlockItem(WARPED_CLAPBOARD, new FabricItemSettings()));

        Registry.register(Registries.ITEM, new Identifier(MODID, "cherry_clapboard"),   new BlockItem(CHERRY_CLAPBOARD, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MODID, "bamboo_clapboard"),   new BlockItem(BAMBOO_CLAPBOARD, new FabricItemSettings()));
    }
}