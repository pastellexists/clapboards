package pastellexists.clapboards;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ClapboardsBlocks {

    public static final Block OAK_CLAPBOARD = register("oak_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), true);
    public static final Block SPRUCE_CLAPBOARD = register("spruce_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS), true);
    public static final Block BIRCH_CLAPBOARD = register("birch_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS), true);
    public static final Block JUNGLE_CLAPBOARD = register("jungle_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS), true);
    public static final Block ACACIA_CLAPBOARD = register("acacia_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS), true);
    public static final Block DARK_OAK_CLAPBOARD = register("dark_oak_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS), true);
    public static final Block MANGROVE_CLAPBOARD = register("mangrove_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS), true);
    public static final Block CRIMSON_CLAPBOARD = register("crimson_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS), true);
    public static final Block WARPED_CLAPBOARD = register("warped_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS), true);
    public static final Block CHERRY_CLAPBOARD = register("cherry_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS), true);
    public static final Block BAMBOO_CLAPBOARD = register("bamboo_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS), true);
    public static final Block PALE_OAK_CLAPBOARD = register("pale_oak_clapboard", Block::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_PLANKS), true);

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        RegistryKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Clapboards.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Clapboards.MOD_ID, name));
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ClapboardsBlocks.OAK_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.SPRUCE_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.BIRCH_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.JUNGLE_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.ACACIA_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.DARK_OAK_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.MANGROVE_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.CRIMSON_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.WARPED_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.CHERRY_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.BAMBOO_CLAPBOARD.asItem());
            itemGroup.add(ClapboardsBlocks.PALE_OAK_CLAPBOARD.asItem());
        });
    }
}
