package pastellexists.clapboards;

import io.wispforest.condensed_creative.CondensedCreative;
import net.minecraft.item.ItemGroups;
import io.wispforest.condensed_creative.registry.CondensedCreativeInitializer;
import io.wispforest.condensed_creative.registry.CondensedEntryRegistry;

import java.util.List;

public class CondensedCreativeHandler implements CondensedCreativeInitializer {
    @Override
    public void onInitializeCondensedEntries(boolean refreshed) {
        CondensedEntryRegistry.fromItems(
                CondensedCreative.createID("clapboards"),
                ClapboardsMod.PAINTED_CLAPBOARD,
                List.of(ClapboardsMod.PAINTED_CLAPBOARD, ClapboardsMod.OAK_CLAPBOARD,ClapboardsMod.SPRUCE_CLAPBOARD,ClapboardsMod.BIRCH_CLAPBOARD,ClapboardsMod.JUNGLE_CLAPBOARD,ClapboardsMod.ACACIA_CLAPBOARD,ClapboardsMod.DARK_OAK_CLAPBOARD,ClapboardsMod.MANGROVE_CLAPBOARD,ClapboardsMod.CRIMSON_CLAPBOARD,ClapboardsMod.WARPED_CLAPBOARD,ClapboardsMod.CHERRY_CLAPBOARD,ClapboardsMod.BAMBOO_CLAPBOARD)
        ).addToItemGroups(ItemGroups.BUILDING_BLOCKS);
    }
}