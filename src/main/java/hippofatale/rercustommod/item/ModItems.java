package hippofatale.rercustommod.item;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.entity.ModEntities;
import hippofatale.rercustommod.item.custom.ReRArmorItem;
import hippofatale.rercustommod.item.custom.ReRPetFoodItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ReRCustomMod.MOD_ID);

    //emblems
    public static final DeferredItem<Item> REREVOLUTION_EMBLEM = ITEMS.register("rerevolution_emblem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEALTH_UNIT_EMBLEM = ITEMS.register("stealth_unit_emblem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARTILLERY_UNIT_EMBLEM = ITEMS.register("artillery_unit_emblem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VANGUARD_UNIT_EMBLEM = ITEMS.register("vanguard_unit_emblem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INTELLIGENCE_UNIT_EMBLEM = ITEMS.register("intelligence_unit_emblem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENFORCEMENT_UNIT_EMBLEM = ITEMS.register("enforcement_unit_emblem",
            () -> new Item(new Item.Properties()));

    //pet food
    public static final DeferredItem<Item> STEALTH_UNIT_CAT_FOOD = ITEMS.register("stealth_unit_cat_food",
            () -> new ReRPetFoodItem(new Item.Properties()));
    public static final DeferredItem<Item> ENFORCEMENT_UNIT_WOLF_FOOD = ITEMS.register("enforcement_unit_wolf_food",
            () -> new ReRPetFoodItem(new Item.Properties()));
    public static final DeferredItem<Item> VANGUARD_UNIT_BIRD_FOOD = ITEMS.register("vanguard_unit_bird_food",
            () -> new ReRPetFoodItem(new Item.Properties()));

    //etc
    public static final DeferredItem<Item> STEALTH_UNIT_MRE = ITEMS.register("stealth_unit_mre",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STEALTH_UNIT_MRE)));

    //armor
    //iron
    public static final DeferredItem<ReRArmorItem> STEALTH_UNIT_IRON_HELMET = ITEMS.register("stealth_unit_iron_helmet",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)), 0));
    public static final DeferredItem<ReRArmorItem> STEALTH_UNIT_IRON_CHESTPLATE = ITEMS.register("stealth_unit_iron_chestplate",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16)), 0));
    public static final DeferredItem<ReRArmorItem> STEALTH_UNIT_IRON_LEGGINGS = ITEMS.register("stealth_unit_iron_leggings",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 0));
    public static final DeferredItem<ReRArmorItem> STEALTH_UNIT_IRON_BOOTS = ITEMS.register("stealth_unit_iron_boots",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13)), 0));

    public static final DeferredItem<ReRArmorItem> ARTILLERY_UNIT_IRON_HELMET = ITEMS.register("artillery_unit_iron_helmet",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)), 1));
    public static final DeferredItem<ReRArmorItem> ARTILLERY_UNIT_IRON_CHESTPLATE = ITEMS.register("artillery_unit_iron_chestplate",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16)), 1));
    public static final DeferredItem<ReRArmorItem> ARTILLERY_UNIT_IRON_LEGGINGS = ITEMS.register("artillery_unit_iron_leggings",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 1));
    public static final DeferredItem<ReRArmorItem> ARTILLERY_UNIT_IRON_BOOTS = ITEMS.register("artillery_unit_iron_boots",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13)), 1));

    public static final DeferredItem<ReRArmorItem> VANGUARD_UNIT_IRON_HELMET = ITEMS.register("vanguard_unit_iron_helmet",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)), 2));
    public static final DeferredItem<ReRArmorItem> VANGUARD_UNIT_IRON_CHESTPLATE = ITEMS.register("vanguard_unit_iron_chestplate",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16)), 2));
    public static final DeferredItem<ReRArmorItem> VANGUARD_UNIT_IRON_LEGGINGS = ITEMS.register("vanguard_unit_iron_leggings",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 2));
    public static final DeferredItem<ReRArmorItem> VANGUARD_UNIT_IRON_BOOTS = ITEMS.register("vanguard_unit_iron_boots",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13)), 2));

    public static final DeferredItem<ReRArmorItem> INTELLIGENCE_UNIT_IRON_HELMET = ITEMS.register("intelligence_unit_iron_helmet",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)), 3));
    public static final DeferredItem<ReRArmorItem> INTELLIGENCE_UNIT_IRON_CHESTPLATE = ITEMS.register("intelligence_unit_iron_chestplate",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16)), 3));
    public static final DeferredItem<ReRArmorItem> INTELLIGENCE_UNIT_IRON_LEGGINGS = ITEMS.register("intelligence_unit_iron_leggings",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 3));
    public static final DeferredItem<ReRArmorItem> INTELLIGENCE_UNIT_IRON_BOOTS = ITEMS.register("intelligence_unit_iron_boots",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13)), 3));

    public static final DeferredItem<ReRArmorItem> ENFORCEMENT_UNIT_IRON_HELMET = ITEMS.register("enforcement_unit_iron_helmet",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)), 4));
    public static final DeferredItem<ReRArmorItem> ENFORCEMENT_UNIT_IRON_CHESTPLATE = ITEMS.register("enforcement_unit_iron_chestplate",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15)), 4));
    public static final DeferredItem<ReRArmorItem> ENFORCEMENT_UNIT_IRON_LEGGINGS = ITEMS.register("enforcement_unit_iron_leggings",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(16)), 4));
    public static final DeferredItem<ReRArmorItem> ENFORCEMENT_UNIT_IRON_BOOTS = ITEMS.register("enforcement_unit_iron_boots",
            () -> new ReRArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13)), 4));

    //carbon fiber(diamond)
    public static final DeferredItem<ReRArmorItem> STEALTH_UNIT_CARBON_FIBER_HELMET = ITEMS.register("stealth_unit_carbon_fiber_helmet",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)), 5));
    public static final DeferredItem<ReRArmorItem> STEALTH_UNIT_CARBON_FIBER_CHESTPLATE = ITEMS.register("stealth_unit_carbon_fiber_chestplate",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16)), 5));
    public static final DeferredItem<ReRArmorItem> STEALTH_UNIT_CARBON_FIBER_LEGGINGS = ITEMS.register("stealth_unit_carbon_fiber_leggings",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 5));
    public static final DeferredItem<ReRArmorItem> STEALTH_UNIT_CARBON_FIBER_BOOTS = ITEMS.register("stealth_unit_carbon_fiber_boots",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13)), 5));

    public static final DeferredItem<ReRArmorItem> ARTILLERY_UNIT_CARBON_FIBER_HELMET = ITEMS.register("artillery_unit_carbon_fiber_helmet",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)), 6));
    public static final DeferredItem<ReRArmorItem> ARTILLERY_UNIT_CARBON_FIBER_CHESTPLATE = ITEMS.register("artillery_unit_carbon_fiber_chestplate",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16)), 6));
    public static final DeferredItem<ReRArmorItem> ARTILLERY_UNIT_CARBON_FIBER_LEGGINGS = ITEMS.register("artillery_unit_carbon_fiber_leggings",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 6));
    public static final DeferredItem<ReRArmorItem> ARTILLERY_UNIT_CARBON_FIBER_BOOTS = ITEMS.register("artillery_unit_carbon_fiber_boots",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13)), 6));

    public static final DeferredItem<ReRArmorItem> VANGUARD_UNIT_CARBON_FIBER_HELMET = ITEMS.register("vanguard_unit_carbon_fiber_helmet",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)), 7));
    public static final DeferredItem<ReRArmorItem> VANGUARD_UNIT_CARBON_FIBER_CHESTPLATE = ITEMS.register("vanguard_unit_carbon_fiber_chestplate",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16)), 7));
    public static final DeferredItem<ReRArmorItem> VANGUARD_UNIT_CARBON_FIBER_LEGGINGS = ITEMS.register("vanguard_unit_carbon_fiber_leggings",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 7));
    public static final DeferredItem<ReRArmorItem> VANGUARD_UNIT_CARBON_FIBER_BOOTS = ITEMS.register("vanguard_unit_carbon_fiber_boots",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13)), 7));

    public static final DeferredItem<ReRArmorItem> INTELLIGENCE_UNIT_CARBON_FIBER_HELMET = ITEMS.register("intelligence_unit_carbon_fiber_helmet",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)), 8));
    public static final DeferredItem<ReRArmorItem> INTELLIGENCE_UNIT_CARBON_FIBER_CHESTPLATE = ITEMS.register("intelligence_unit_carbon_fiber_chestplate",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16)), 8));
    public static final DeferredItem<ReRArmorItem> INTELLIGENCE_UNIT_CARBON_FIBER_LEGGINGS = ITEMS.register("intelligence_unit_carbon_fiber_leggings",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 8));
    public static final DeferredItem<ReRArmorItem> INTELLIGENCE_UNIT_CARBON_FIBER_BOOTS = ITEMS.register("intelligence_unit_carbon_fiber_boots",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13)), 8));

    public static final DeferredItem<ReRArmorItem> ENFORCEMENT_UNIT_CARBON_FIBER_HELMET = ITEMS.register("enforcement_unit_carbon_fiber_helmet",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(11)), 9));
    public static final DeferredItem<ReRArmorItem> ENFORCEMENT_UNIT_CARBON_FIBER_CHESTPLATE = ITEMS.register("enforcement_unit_carbon_fiber_chestplate",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15)), 9));
    public static final DeferredItem<ReRArmorItem> ENFORCEMENT_UNIT_CARBON_FIBER_LEGGINGS = ITEMS.register("enforcement_unit_carbon_fiber_leggings",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(16)), 9));
    public static final DeferredItem<ReRArmorItem> ENFORCEMENT_UNIT_CARBON_FIBER_BOOTS = ITEMS.register("enforcement_unit_carbon_fiber_boots",
            () -> new ReRArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13)), 9));

    //spawn egg
    public static final DeferredItem<Item> JACK_CAT_SPAWN_EGG = ITEMS.register("jack_cat_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.JACK_CAT, 0x000000, 0x0000ff,
                    new Item.Properties()));
    public static final DeferredItem<Item> LEEON_WOLF_SPAWN_EGG = ITEMS.register("leeon_wolf_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.LEEON_WOLF, 0x000000, 0x672db6,
                    new Item.Properties()));
    public static final DeferredItem<Item> RYU_GULL_SPAWN_EGG = ITEMS.register("ryu_gull_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.RYU_GULL, 0x000000, 0xe50010,
                    new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
