package hippofatale.rercustommod.datagen;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.item.ModItems;
import hippofatale.rercustommod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ReRCustomMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.RER_EMBLEMS)
                .add(ModItems.REREVOLUTION_EMBLEM.get())
                .add(ModItems.STEALTH_UNIT_EMBLEM.get())
                .add(ModItems.ARTILLERY_UNIT_EMBLEM.get())
                .add(ModItems.VANGUARD_UNIT_EMBLEM.get())
                .add(ModItems.INTELLIGENCE_UNIT_EMBLEM.get())
                .add(ModItems.ENFORCEMENT_UNIT_EMBLEM.get())
                ;

        tag(ModTags.Items.RER_PET_FOOD)
                .add(ModItems.STEALTH_UNIT_CAT_FOOD.get())
                .add(ModItems.ENFORCEMENT_UNIT_WOLF_FOOD.get())
                .add(ModItems.VANGUARD_UNIT_BIRD_FOOD.get())
                ;

        //iron armor
        tag(ModTags.Items.RER_IRON_HELMET)
                .add(ModItems.STEALTH_UNIT_IRON_HELMET.get())
                .add(ModItems.ARTILLERY_UNIT_IRON_HELMET.get())
                .add(ModItems.VANGUARD_UNIT_IRON_HELMET.get())
                .add(ModItems.INTELLIGENCE_UNIT_IRON_HELMET.get())
                .add(ModItems.ENFORCEMENT_UNIT_IRON_HELMET.get())
                ;
        tag(ModTags.Items.RER_IRON_CHESTPLATE)
                .add(ModItems.STEALTH_UNIT_IRON_CHESTPLATE.get())
                .add(ModItems.ARTILLERY_UNIT_IRON_CHESTPLATE.get())
                .add(ModItems.VANGUARD_UNIT_IRON_CHESTPLATE.get())
                .add(ModItems.INTELLIGENCE_UNIT_IRON_CHESTPLATE.get())
                .add(ModItems.ENFORCEMENT_UNIT_IRON_CHESTPLATE.get())
                ;
        tag(ModTags.Items.RER_IRON_LEGGINGS)
                .add(ModItems.STEALTH_UNIT_IRON_LEGGINGS.get())
                .add(ModItems.ARTILLERY_UNIT_IRON_LEGGINGS.get())
                .add(ModItems.VANGUARD_UNIT_IRON_LEGGINGS.get())
                .add(ModItems.INTELLIGENCE_UNIT_IRON_LEGGINGS.get())
                .add(ModItems.ENFORCEMENT_UNIT_IRON_LEGGINGS.get())
                ;
        tag(ModTags.Items.RER_IRON_BOOTS)
                .add(ModItems.STEALTH_UNIT_IRON_BOOTS.get())
                .add(ModItems.ARTILLERY_UNIT_IRON_BOOTS.get())
                .add(ModItems.VANGUARD_UNIT_IRON_BOOTS.get())
                .add(ModItems.INTELLIGENCE_UNIT_IRON_BOOTS.get())
                .add(ModItems.ENFORCEMENT_UNIT_IRON_BOOTS.get())
                ;

        //carbon fiber armor
        tag(ModTags.Items.RER_CARBON_FIBER_HELMET)
                .add(ModItems.STEALTH_UNIT_CARBON_FIBER_HELMET.get())
                .add(ModItems.ARTILLERY_UNIT_CARBON_FIBER_HELMET.get())
                .add(ModItems.VANGUARD_UNIT_CARBON_FIBER_HELMET.get())
                .add(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_HELMET.get())
                .add(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_HELMET.get())
                ;
        tag(ModTags.Items.RER_CARBON_FIBER_CHESTPLATE)
                .add(ModItems.STEALTH_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .add(ModItems.ARTILLERY_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .add(ModItems.VANGUARD_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .add(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .add(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_CHESTPLATE.get())
                ;
        tag(ModTags.Items.RER_CARBON_FIBER_LEGGINGS)
                .add(ModItems.STEALTH_UNIT_CARBON_FIBER_LEGGINGS.get())
                .add(ModItems.ARTILLERY_UNIT_CARBON_FIBER_LEGGINGS.get())
                .add(ModItems.VANGUARD_UNIT_CARBON_FIBER_LEGGINGS.get())
                .add(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_LEGGINGS.get())
                .add(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_LEGGINGS.get())
                ;
        tag(ModTags.Items.RER_CARBON_FIBER_BOOTS)
                .add(ModItems.STEALTH_UNIT_CARBON_FIBER_BOOTS.get())
                .add(ModItems.ARTILLERY_UNIT_CARBON_FIBER_BOOTS.get())
                .add(ModItems.VANGUARD_UNIT_CARBON_FIBER_BOOTS.get())
                .add(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_BOOTS.get())
                .add(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_BOOTS.get())
                ;

        //vanilla armor tag
        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.STEALTH_UNIT_IRON_HELMET.get())
                .add(ModItems.ARTILLERY_UNIT_IRON_HELMET.get())
                .add(ModItems.VANGUARD_UNIT_IRON_HELMET.get())
                .add(ModItems.INTELLIGENCE_UNIT_IRON_HELMET.get())
                .add(ModItems.ENFORCEMENT_UNIT_IRON_HELMET.get())

                .add(ModItems.STEALTH_UNIT_CARBON_FIBER_HELMET.get())
                .add(ModItems.ARTILLERY_UNIT_CARBON_FIBER_HELMET.get())
                .add(ModItems.VANGUARD_UNIT_CARBON_FIBER_HELMET.get())
                .add(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_HELMET.get())
                .add(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_HELMET.get())
                ;

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.STEALTH_UNIT_IRON_CHESTPLATE.get())
                .add(ModItems.ARTILLERY_UNIT_IRON_CHESTPLATE.get())
                .add(ModItems.VANGUARD_UNIT_IRON_CHESTPLATE.get())
                .add(ModItems.INTELLIGENCE_UNIT_IRON_CHESTPLATE.get())
                .add(ModItems.ENFORCEMENT_UNIT_IRON_CHESTPLATE.get())

                .add(ModItems.STEALTH_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .add(ModItems.ARTILLERY_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .add(ModItems.VANGUARD_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .add(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .add(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_CHESTPLATE.get())
                ;

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.STEALTH_UNIT_IRON_LEGGINGS.get())
                .add(ModItems.ARTILLERY_UNIT_IRON_LEGGINGS.get())
                .add(ModItems.VANGUARD_UNIT_IRON_LEGGINGS.get())
                .add(ModItems.INTELLIGENCE_UNIT_IRON_LEGGINGS.get())
                .add(ModItems.ENFORCEMENT_UNIT_IRON_LEGGINGS.get())

                .add(ModItems.STEALTH_UNIT_CARBON_FIBER_LEGGINGS.get())
                .add(ModItems.ARTILLERY_UNIT_CARBON_FIBER_LEGGINGS.get())
                .add(ModItems.VANGUARD_UNIT_CARBON_FIBER_LEGGINGS.get())
                .add(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_LEGGINGS.get())
                .add(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_LEGGINGS.get())
                ;

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.STEALTH_UNIT_IRON_BOOTS.get())
                .add(ModItems.ARTILLERY_UNIT_IRON_BOOTS.get())
                .add(ModItems.VANGUARD_UNIT_IRON_BOOTS.get())
                .add(ModItems.INTELLIGENCE_UNIT_IRON_BOOTS.get())
                .add(ModItems.ENFORCEMENT_UNIT_IRON_BOOTS.get())

                .add(ModItems.STEALTH_UNIT_CARBON_FIBER_BOOTS.get())
                .add(ModItems.ARTILLERY_UNIT_CARBON_FIBER_BOOTS.get())
                .add(ModItems.VANGUARD_UNIT_CARBON_FIBER_BOOTS.get())
                .add(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_BOOTS.get())
                .add(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_BOOTS.get())
                ;

    }
}
