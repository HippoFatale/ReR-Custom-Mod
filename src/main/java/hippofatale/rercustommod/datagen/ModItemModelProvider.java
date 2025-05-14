package hippofatale.rercustommod.datagen;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ReRCustomMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //emblems
        basicItem(ModItems.REREVOLUTION_EMBLEM.get());
        basicItem(ModItems.STEALTH_UNIT_EMBLEM.get());
        basicItem(ModItems.ARTILLERY_UNIT_EMBLEM.get());
        basicItem(ModItems.VANGUARD_UNIT_EMBLEM.get());
        basicItem(ModItems.INTELLIGENCE_UNIT_EMBLEM.get());
        basicItem(ModItems.ENFORCEMENT_UNIT_EMBLEM.get());

        //pet food
        basicItem(ModItems.STEALTH_UNIT_CAT_FOOD.get());
        basicItem(ModItems.ENFORCEMENT_UNIT_WOLF_FOOD.get());
        basicItem(ModItems.VANGUARD_UNIT_BIRD_FOOD.get());

        //armor
        //iron
        basicItem(ModItems.STEALTH_UNIT_IRON_HELMET.get());
        basicItem(ModItems.STEALTH_UNIT_IRON_CHESTPLATE.get());
        basicItem(ModItems.STEALTH_UNIT_IRON_LEGGINGS.get());
        basicItem(ModItems.STEALTH_UNIT_IRON_BOOTS.get());

        basicItem(ModItems.ARTILLERY_UNIT_IRON_HELMET.get());
        basicItem(ModItems.ARTILLERY_UNIT_IRON_CHESTPLATE.get());
        basicItem(ModItems.ARTILLERY_UNIT_IRON_LEGGINGS.get());
        basicItem(ModItems.ARTILLERY_UNIT_IRON_BOOTS.get());

        basicItem(ModItems.VANGUARD_UNIT_IRON_HELMET.get());
        basicItem(ModItems.VANGUARD_UNIT_IRON_CHESTPLATE.get());
        basicItem(ModItems.VANGUARD_UNIT_IRON_LEGGINGS.get());
        basicItem(ModItems.VANGUARD_UNIT_IRON_BOOTS.get());

        basicItem(ModItems.INTELLIGENCE_UNIT_IRON_HELMET.get());
        basicItem(ModItems.INTELLIGENCE_UNIT_IRON_CHESTPLATE.get());
        basicItem(ModItems.INTELLIGENCE_UNIT_IRON_LEGGINGS.get());
        basicItem(ModItems.INTELLIGENCE_UNIT_IRON_BOOTS.get());

        basicItem(ModItems.ENFORCEMENT_UNIT_IRON_HELMET.get());
        basicItem(ModItems.ENFORCEMENT_UNIT_IRON_CHESTPLATE.get());
        basicItem(ModItems.ENFORCEMENT_UNIT_IRON_LEGGINGS.get());
        basicItem(ModItems.ENFORCEMENT_UNIT_IRON_BOOTS.get());

        //spawn egg
        withExistingParent(ModItems.JACK_CAT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.LEEON_WOLF_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.RYU_GULL_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

    }
}
