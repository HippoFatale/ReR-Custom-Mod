package hippofatale.rercustommod.util;

import hippofatale.rercustommod.ReRCustomMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> RER_EMBLEMS = createTag("rer_emblems");
        public static final TagKey<Item> RER_PET_FOOD = createTag("rer_pet_food");

        public static final TagKey<Item> RER_IRON_HELMET = createTag("rer_iron_helmet");
        public static final TagKey<Item> RER_IRON_CHESTPLATE = createTag("rer_iron_chestplate");
        public static final TagKey<Item> RER_IRON_LEGGINGS = createTag("rer_iron_leggings");
        public static final TagKey<Item> RER_IRON_BOOTS = createTag("rer_iron_boots");

        public static final TagKey<Item> RER_CARBON_FIBER_HELMET = createTag("rer_carbon_fiber_helmet");
        public static final TagKey<Item> RER_CARBON_FIBER_CHESTPLATE = createTag("rer_carbon_fiber_chestplate");
        public static final TagKey<Item> RER_CARBON_FIBER_LEGGINGS = createTag("rer_carbon_fiber_leggings");
        public static final TagKey<Item> RER_CARBON_FIBER_BOOTS = createTag("rer_carbon_fiber_boots");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, name));
        }
    }
}
