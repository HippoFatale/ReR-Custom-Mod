package hippofatale.rercustommod.item;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.entity.ModEntities;
import hippofatale.rercustommod.item.custom.ReRIronArmorItem;
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

    //armor
    //iron
    public static final DeferredItem<ReRIronArmorItem> STEALTH_UNIT_IRON_HELMET = ITEMS.register("stealth_unit_iron_helmet",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15)), 1));
    public static final DeferredItem<ReRIronArmorItem> STEALTH_UNIT_IRON_CHESTPLATE = ITEMS.register("stealth_unit_iron_chestplate",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15)), 1));
    public static final DeferredItem<ReRIronArmorItem> STEALTH_UNIT_IRON_LEGGINGS = ITEMS.register("stealth_unit_iron_leggings",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 1));
    public static final DeferredItem<ReRIronArmorItem> STEALTH_UNIT_IRON_BOOTS = ITEMS.register("stealth_unit_iron_boots",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15)), 1));

    public static final DeferredItem<ReRIronArmorItem> ARTILLERY_UNIT_IRON_HELMET = ITEMS.register("artillery_unit_iron_helmet",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15)), 2));
    public static final DeferredItem<ReRIronArmorItem> ARTILLERY_UNIT_IRON_CHESTPLATE = ITEMS.register("artillery_unit_iron_chestplate",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15)), 2));
    public static final DeferredItem<ReRIronArmorItem> ARTILLERY_UNIT_IRON_LEGGINGS = ITEMS.register("artillery_unit_iron_leggings",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 2));
    public static final DeferredItem<ReRIronArmorItem> ARTILLERY_UNIT_IRON_BOOTS = ITEMS.register("artillery_unit_iron_boots",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15)), 2));

    public static final DeferredItem<ReRIronArmorItem> VANGUARD_UNIT_IRON_HELMET = ITEMS.register("vanguard_unit_iron_helmet",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15)), 3));
    public static final DeferredItem<ReRIronArmorItem> VANGUARD_UNIT_IRON_CHESTPLATE = ITEMS.register("vanguard_unit_iron_chestplate",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15)), 3));
    public static final DeferredItem<ReRIronArmorItem> VANGUARD_UNIT_IRON_LEGGINGS = ITEMS.register("vanguard_unit_iron_leggings",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 3));
    public static final DeferredItem<ReRIronArmorItem> VANGUARD_UNIT_IRON_BOOTS = ITEMS.register("vanguard_unit_iron_boots",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15)), 3));

    public static final DeferredItem<ReRIronArmorItem> INTELLIGENCE_UNIT_IRON_HELMET = ITEMS.register("intelligence_unit_iron_helmet",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15)), 4));
    public static final DeferredItem<ReRIronArmorItem> INTELLIGENCE_UNIT_IRON_CHESTPLATE = ITEMS.register("intelligence_unit_iron_chestplate",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15)), 4));
    public static final DeferredItem<ReRIronArmorItem> INTELLIGENCE_UNIT_IRON_LEGGINGS = ITEMS.register("intelligence_unit_iron_leggings",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 4));
    public static final DeferredItem<ReRIronArmorItem> INTELLIGENCE_UNIT_IRON_BOOTS = ITEMS.register("intelligence_unit_iron_boots",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15)), 4));

    public static final DeferredItem<ReRIronArmorItem> ENFORCEMENT_UNIT_IRON_HELMET = ITEMS.register("enforcement_unit_iron_helmet",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15)), 5));
    public static final DeferredItem<ReRIronArmorItem> ENFORCEMENT_UNIT_IRON_CHESTPLATE = ITEMS.register("enforcement_unit_iron_chestplate",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15)), 5));
    public static final DeferredItem<ReRIronArmorItem> ENFORCEMENT_UNIT_IRON_LEGGINGS = ITEMS.register("enforcement_unit_iron_leggings",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)), 5));
    public static final DeferredItem<ReRIronArmorItem> ENFORCEMENT_UNIT_IRON_BOOTS = ITEMS.register("enforcement_unit_iron_boots",
            () -> new ReRIronArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15)), 5));

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
