package hippofatale.rercustommod.datagen;

import hippofatale.rercustommod.block.ModBlocks;
import hippofatale.rercustommod.item.ModItems;
import hippofatale.rercustommod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //green dye
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GREEN_DYE, 2)
                .requires(Items.YELLOW_DYE)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .save(recipeOutput);


        //emblems
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REREVOLUTION_EMBLEM.get())
                .pattern(" B ")
                .pattern("ORG")
                .pattern(" P ")
                .define('B', Items.BLUE_DYE)
                .define('O', Items.ORANGE_DYE)
                .define('R', Items.RED_DYE)
                .define('G', Items.GREEN_DYE)
                .define('P', Items.PURPLE_DYE)
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEALTH_UNIT_EMBLEM.get())
                .requires(ModItems.REREVOLUTION_EMBLEM)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_rerevolution_emblem", has(ModItems.REREVOLUTION_EMBLEM))
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARTILLERY_UNIT_EMBLEM.get())
                .requires(ModItems.REREVOLUTION_EMBLEM)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_rerevolution_emblem", has(ModItems.REREVOLUTION_EMBLEM))
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANGUARD_UNIT_EMBLEM.get())
                .requires(ModItems.REREVOLUTION_EMBLEM)
                .requires(Items.RED_DYE)
                .unlockedBy("has_rerevolution_emblem", has(ModItems.REREVOLUTION_EMBLEM))
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INTELLIGENCE_UNIT_EMBLEM.get())
                .requires(ModItems.REREVOLUTION_EMBLEM)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_rerevolution_emblem", has(ModItems.REREVOLUTION_EMBLEM))
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENFORCEMENT_UNIT_EMBLEM.get())
                .requires(ModItems.REREVOLUTION_EMBLEM)
                .requires(Items.PURPLE_DYE)
                .unlockedBy("has_rerevolution_emblem", has(ModItems.REREVOLUTION_EMBLEM))
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .save(recipeOutput);


        //pet food
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEALTH_UNIT_CAT_FOOD.get())
                .requires(ModItems.STEALTH_UNIT_EMBLEM)
                .requires(Items.SALMON)
                .unlockedBy("has_stealth_unit_emblem", has(ModItems.STEALTH_UNIT_EMBLEM))
                .unlockedBy("has_salmon", has(Items.SALMON))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENFORCEMENT_UNIT_WOLF_FOOD.get())
                .requires(ModItems.ENFORCEMENT_UNIT_EMBLEM)
                .requires(Items.COOKED_MUTTON)
                .unlockedBy("has_enforcement_unit_emblem", has(ModItems.ENFORCEMENT_UNIT_EMBLEM))
                .unlockedBy("has_cooked_mutton", has(Items.COOKED_MUTTON))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANGUARD_UNIT_BIRD_FOOD.get())
                .requires(ModItems.VANGUARD_UNIT_EMBLEM)
                .requires(ItemTags.PARROT_FOOD)
                .unlockedBy("has_vanguard_unit_emblem", has(ModItems.VANGUARD_UNIT_EMBLEM))
                .unlockedBy("has_parrot_food", has(ItemTags.PARROT_FOOD))
                .save(recipeOutput);


        //etc
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.STEALTH_UNIT_MRE.get(), 2)
                .pattern("CCC")
                .pattern("CBC")
                .pattern("CCC")
                .define('B', Items.BREAD)
                .define('C', Items.COCOA_BEANS)
                .unlockedBy("has_bread", has(Items.BREAD))
                .unlockedBy("has_cocoa_beans", has(Items.COCOA_BEANS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.STEALTH_UNIT_MRE.get(), 9)
                .requires(ModBlocks.STEALTH_UNIT_MRE_BOX)
                .unlockedBy("has_stealth_unit_mre_box", has(ModBlocks.STEALTH_UNIT_MRE_BOX))
                .save(recipeOutput, "rercustommod:stealth_unit_mre_from_box");
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModBlocks.STEALTH_UNIT_MRE_BOX.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.STEALTH_UNIT_MRE)
                .unlockedBy("has_stealth_unit_mre", has(ModItems.STEALTH_UNIT_MRE))
                .save(recipeOutput);


        //iron armor
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEALTH_UNIT_IRON_HELMET.get())
                .requires(ModItems.STEALTH_UNIT_EMBLEM)
                .requires(Items.IRON_HELMET)
                .unlockedBy("has_stealth_unit_emblem", has(ModItems.STEALTH_UNIT_EMBLEM))
                .unlockedBy("has_iron_helmet", has(Items.IRON_HELMET))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEALTH_UNIT_IRON_CHESTPLATE.get())
                .requires(ModItems.STEALTH_UNIT_EMBLEM)
                .requires(Items.IRON_CHESTPLATE)
                .unlockedBy("has_stealth_unit_emblem", has(ModItems.STEALTH_UNIT_EMBLEM))
                .unlockedBy("has_iron_chestplate", has(Items.IRON_CHESTPLATE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEALTH_UNIT_IRON_LEGGINGS.get())
                .requires(ModItems.STEALTH_UNIT_EMBLEM)
                .requires(Items.IRON_LEGGINGS)
                .unlockedBy("has_stealth_unit_emblem", has(ModItems.STEALTH_UNIT_EMBLEM))
                .unlockedBy("has_iron_leggings", has(Items.IRON_LEGGINGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEALTH_UNIT_IRON_BOOTS.get())
                .requires(ModItems.STEALTH_UNIT_EMBLEM)
                .requires(Items.IRON_BOOTS)
                .unlockedBy("has_stealth_unit_emblem", has(ModItems.STEALTH_UNIT_EMBLEM))
                .unlockedBy("has_iron_boots", has(Items.IRON_BOOTS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARTILLERY_UNIT_IRON_HELMET.get())
                .requires(ModItems.ARTILLERY_UNIT_EMBLEM)
                .requires(Items.IRON_HELMET)
                .unlockedBy("has_artillery_unit_emblem", has(ModItems.ARTILLERY_UNIT_EMBLEM))
                .unlockedBy("has_iron_helmet", has(Items.IRON_HELMET))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARTILLERY_UNIT_IRON_CHESTPLATE.get())
                .requires(ModItems.ARTILLERY_UNIT_EMBLEM)
                .requires(Items.IRON_CHESTPLATE)
                .unlockedBy("has_artillery_unit_emblem", has(ModItems.ARTILLERY_UNIT_EMBLEM))
                .unlockedBy("has_iron_chestplate", has(Items.IRON_CHESTPLATE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARTILLERY_UNIT_IRON_LEGGINGS.get())
                .requires(ModItems.ARTILLERY_UNIT_EMBLEM)
                .requires(Items.IRON_LEGGINGS)
                .unlockedBy("has_artillery_unit_emblem", has(ModItems.ARTILLERY_UNIT_EMBLEM))
                .unlockedBy("has_iron_leggings", has(Items.IRON_LEGGINGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARTILLERY_UNIT_IRON_BOOTS.get())
                .requires(ModItems.ARTILLERY_UNIT_EMBLEM)
                .requires(Items.IRON_BOOTS)
                .unlockedBy("has_artillery_unit_emblem", has(ModItems.ARTILLERY_UNIT_EMBLEM))
                .unlockedBy("has_iron_boots", has(Items.IRON_BOOTS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANGUARD_UNIT_IRON_HELMET.get())
                .requires(ModItems.VANGUARD_UNIT_EMBLEM)
                .requires(Items.IRON_HELMET)
                .unlockedBy("has_vanguard_unit_emblem", has(ModItems.VANGUARD_UNIT_EMBLEM))
                .unlockedBy("has_iron_helmet", has(Items.IRON_HELMET))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANGUARD_UNIT_IRON_CHESTPLATE.get())
                .requires(ModItems.VANGUARD_UNIT_EMBLEM)
                .requires(Items.IRON_CHESTPLATE)
                .unlockedBy("has_vanguard_unit_emblem", has(ModItems.VANGUARD_UNIT_EMBLEM))
                .unlockedBy("has_iron_chestplate", has(Items.IRON_CHESTPLATE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANGUARD_UNIT_IRON_LEGGINGS.get())
                .requires(ModItems.VANGUARD_UNIT_EMBLEM)
                .requires(Items.IRON_LEGGINGS)
                .unlockedBy("has_vanguard_unit_emblem", has(ModItems.VANGUARD_UNIT_EMBLEM))
                .unlockedBy("has_iron_leggings", has(Items.IRON_LEGGINGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANGUARD_UNIT_IRON_BOOTS.get())
                .requires(ModItems.VANGUARD_UNIT_EMBLEM)
                .requires(Items.IRON_BOOTS)
                .unlockedBy("has_vanguard_unit_emblem", has(ModItems.VANGUARD_UNIT_EMBLEM))
                .unlockedBy("has_iron_boots", has(Items.IRON_BOOTS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INTELLIGENCE_UNIT_IRON_HELMET.get())
                .requires(ModItems.INTELLIGENCE_UNIT_EMBLEM)
                .requires(Items.IRON_HELMET)
                .unlockedBy("has_intelligence_unit_emblem", has(ModItems.INTELLIGENCE_UNIT_EMBLEM))
                .unlockedBy("has_iron_helmet", has(Items.IRON_HELMET))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INTELLIGENCE_UNIT_IRON_CHESTPLATE.get())
                .requires(ModItems.INTELLIGENCE_UNIT_EMBLEM)
                .requires(Items.IRON_CHESTPLATE)
                .unlockedBy("has_intelligence_unit_emblem", has(ModItems.INTELLIGENCE_UNIT_EMBLEM))
                .unlockedBy("has_iron_chestplate", has(Items.IRON_CHESTPLATE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INTELLIGENCE_UNIT_IRON_LEGGINGS.get())
                .requires(ModItems.INTELLIGENCE_UNIT_EMBLEM)
                .requires(Items.IRON_LEGGINGS)
                .unlockedBy("has_intelligence_unit_emblem", has(ModItems.INTELLIGENCE_UNIT_EMBLEM))
                .unlockedBy("has_iron_leggings", has(Items.IRON_LEGGINGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INTELLIGENCE_UNIT_IRON_BOOTS.get())
                .requires(ModItems.INTELLIGENCE_UNIT_EMBLEM)
                .requires(Items.IRON_BOOTS)
                .unlockedBy("has_intelligence_unit_emblem", has(ModItems.INTELLIGENCE_UNIT_EMBLEM))
                .unlockedBy("has_iron_boots", has(Items.IRON_BOOTS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENFORCEMENT_UNIT_IRON_HELMET.get())
                .requires(ModItems.ENFORCEMENT_UNIT_EMBLEM)
                .requires(Items.IRON_HELMET)
                .unlockedBy("has_enforcement_unit_emblem", has(ModItems.ENFORCEMENT_UNIT_EMBLEM))
                .unlockedBy("has_iron_helmet", has(Items.IRON_HELMET))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENFORCEMENT_UNIT_IRON_CHESTPLATE.get())
                .requires(ModItems.ENFORCEMENT_UNIT_EMBLEM)
                .requires(Items.IRON_CHESTPLATE)
                .unlockedBy("has_enforcement_unit_emblem", has(ModItems.ENFORCEMENT_UNIT_EMBLEM))
                .unlockedBy("has_iron_chestplate", has(Items.IRON_CHESTPLATE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENFORCEMENT_UNIT_IRON_LEGGINGS.get())
                .requires(ModItems.ENFORCEMENT_UNIT_EMBLEM)
                .requires(Items.IRON_LEGGINGS)
                .unlockedBy("has_enforcement_unit_emblem", has(ModItems.ENFORCEMENT_UNIT_EMBLEM))
                .unlockedBy("has_iron_leggings", has(Items.IRON_LEGGINGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENFORCEMENT_UNIT_IRON_BOOTS.get())
                .requires(ModItems.ENFORCEMENT_UNIT_EMBLEM)
                .requires(Items.IRON_BOOTS)
                .unlockedBy("has_enforcement_unit_emblem", has(ModItems.ENFORCEMENT_UNIT_EMBLEM))
                .unlockedBy("has_iron_boots", has(Items.IRON_BOOTS))
                .save(recipeOutput);

        //carbon fiber armor
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEALTH_UNIT_CARBON_FIBER_HELMET.get())
                .requires(ModItems.STEALTH_UNIT_EMBLEM)
                .requires(Items.DIAMOND_HELMET)
                .requires(ItemTags.COALS)
                .unlockedBy("has_stealth_unit_emblem", has(ModItems.STEALTH_UNIT_EMBLEM))
                .unlockedBy("has_diamond_helmet", has(Items.DIAMOND_HELMET))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEALTH_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .requires(ModItems.STEALTH_UNIT_EMBLEM)
                .requires(Items.DIAMOND_CHESTPLATE)
                .requires(ItemTags.COALS)
                .unlockedBy("has_stealth_unit_emblem", has(ModItems.STEALTH_UNIT_EMBLEM))
                .unlockedBy("has_diamond_chestplate", has(Items.DIAMOND_CHESTPLATE))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEALTH_UNIT_CARBON_FIBER_LEGGINGS.get())
                .requires(ModItems.STEALTH_UNIT_EMBLEM)
                .requires(Items.DIAMOND_LEGGINGS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_stealth_unit_emblem", has(ModItems.STEALTH_UNIT_EMBLEM))
                .unlockedBy("has_diamond_leggings", has(Items.DIAMOND_LEGGINGS))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEALTH_UNIT_CARBON_FIBER_BOOTS.get())
                .requires(ModItems.STEALTH_UNIT_EMBLEM)
                .requires(Items.DIAMOND_BOOTS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_stealth_unit_emblem", has(ModItems.STEALTH_UNIT_EMBLEM))
                .unlockedBy("has_diamond_boots", has(Items.DIAMOND_BOOTS))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARTILLERY_UNIT_CARBON_FIBER_HELMET.get())
                .requires(ModItems.ARTILLERY_UNIT_EMBLEM)
                .requires(Items.DIAMOND_HELMET)
                .requires(ItemTags.COALS)
                .unlockedBy("has_artillery_unit_emblem", has(ModItems.ARTILLERY_UNIT_EMBLEM))
                .unlockedBy("has_diamond_helmet", has(Items.DIAMOND_HELMET))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARTILLERY_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .requires(ModItems.ARTILLERY_UNIT_EMBLEM)
                .requires(Items.DIAMOND_CHESTPLATE)
                .requires(ItemTags.COALS)
                .unlockedBy("has_artillery_unit_emblem", has(ModItems.ARTILLERY_UNIT_EMBLEM))
                .unlockedBy("has_diamond_chestplate", has(Items.DIAMOND_CHESTPLATE))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARTILLERY_UNIT_CARBON_FIBER_LEGGINGS.get())
                .requires(ModItems.ARTILLERY_UNIT_EMBLEM)
                .requires(Items.DIAMOND_LEGGINGS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_artillery_unit_emblem", has(ModItems.ARTILLERY_UNIT_EMBLEM))
                .unlockedBy("has_diamond_leggings", has(Items.DIAMOND_LEGGINGS))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARTILLERY_UNIT_CARBON_FIBER_BOOTS.get())
                .requires(ModItems.ARTILLERY_UNIT_EMBLEM)
                .requires(Items.DIAMOND_BOOTS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_artillery_unit_emblem", has(ModItems.ARTILLERY_UNIT_EMBLEM))
                .unlockedBy("has_diamond_boots", has(Items.DIAMOND_BOOTS))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANGUARD_UNIT_CARBON_FIBER_HELMET.get())
                .requires(ModItems.VANGUARD_UNIT_EMBLEM)
                .requires(Items.DIAMOND_HELMET)
                .requires(ItemTags.COALS)
                .unlockedBy("has_vanguard_unit_emblem", has(ModItems.VANGUARD_UNIT_EMBLEM))
                .unlockedBy("has_diamond_helmet", has(Items.DIAMOND_HELMET))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANGUARD_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .requires(ModItems.VANGUARD_UNIT_EMBLEM)
                .requires(Items.DIAMOND_CHESTPLATE)
                .requires(ItemTags.COALS)
                .unlockedBy("has_vanguard_unit_emblem", has(ModItems.VANGUARD_UNIT_EMBLEM))
                .unlockedBy("has_diamond_chestplate", has(Items.DIAMOND_CHESTPLATE))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANGUARD_UNIT_CARBON_FIBER_LEGGINGS.get())
                .requires(ModItems.VANGUARD_UNIT_EMBLEM)
                .requires(Items.DIAMOND_LEGGINGS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_vanguard_unit_emblem", has(ModItems.VANGUARD_UNIT_EMBLEM))
                .unlockedBy("has_diamond_leggings", has(Items.DIAMOND_LEGGINGS))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANGUARD_UNIT_CARBON_FIBER_BOOTS.get())
                .requires(ModItems.VANGUARD_UNIT_EMBLEM)
                .requires(Items.DIAMOND_BOOTS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_vanguard_unit_emblem", has(ModItems.VANGUARD_UNIT_EMBLEM))
                .unlockedBy("has_diamond_boots", has(Items.DIAMOND_BOOTS))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_HELMET.get())
                .requires(ModItems.INTELLIGENCE_UNIT_EMBLEM)
                .requires(Items.DIAMOND_HELMET)
                .requires(ItemTags.COALS)
                .unlockedBy("has_intelligence_unit_emblem", has(ModItems.INTELLIGENCE_UNIT_EMBLEM))
                .unlockedBy("has_diamond_helmet", has(Items.DIAMOND_HELMET))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .requires(ModItems.INTELLIGENCE_UNIT_EMBLEM)
                .requires(Items.DIAMOND_CHESTPLATE)
                .requires(ItemTags.COALS)
                .unlockedBy("has_intelligence_unit_emblem", has(ModItems.INTELLIGENCE_UNIT_EMBLEM))
                .unlockedBy("has_diamond_chestplate", has(Items.DIAMOND_CHESTPLATE))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_LEGGINGS.get())
                .requires(ModItems.INTELLIGENCE_UNIT_EMBLEM)
                .requires(Items.DIAMOND_LEGGINGS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_intelligence_unit_emblem", has(ModItems.INTELLIGENCE_UNIT_EMBLEM))
                .unlockedBy("has_diamond_leggings", has(Items.DIAMOND_LEGGINGS))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_BOOTS.get())
                .requires(ModItems.INTELLIGENCE_UNIT_EMBLEM)
                .requires(Items.DIAMOND_BOOTS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_intelligence_unit_emblem", has(ModItems.INTELLIGENCE_UNIT_EMBLEM))
                .unlockedBy("has_diamond_boots", has(Items.DIAMOND_BOOTS))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_HELMET.get())
                .requires(ModItems.ENFORCEMENT_UNIT_EMBLEM)
                .requires(Items.DIAMOND_HELMET)
                .requires(ItemTags.COALS)
                .unlockedBy("has_enforcement_unit_emblem", has(ModItems.ENFORCEMENT_UNIT_EMBLEM))
                .unlockedBy("has_diamond_helmet", has(Items.DIAMOND_HELMET))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_CHESTPLATE.get())
                .requires(ModItems.ENFORCEMENT_UNIT_EMBLEM)
                .requires(Items.DIAMOND_CHESTPLATE)
                .requires(ItemTags.COALS)
                .unlockedBy("has_enforcement_unit_emblem", has(ModItems.ENFORCEMENT_UNIT_EMBLEM))
                .unlockedBy("has_diamond_chestplate", has(Items.DIAMOND_CHESTPLATE))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_LEGGINGS.get())
                .requires(ModItems.ENFORCEMENT_UNIT_EMBLEM)
                .requires(Items.DIAMOND_LEGGINGS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_enforcement_unit_emblem", has(ModItems.ENFORCEMENT_UNIT_EMBLEM))
                .unlockedBy("has_diamond_leggings", has(Items.DIAMOND_LEGGINGS))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_BOOTS.get())
                .requires(ModItems.ENFORCEMENT_UNIT_EMBLEM)
                .requires(Items.DIAMOND_BOOTS)
                .requires(ItemTags.COALS)
                .unlockedBy("has_enforcement_unit_emblem", has(ModItems.ENFORCEMENT_UNIT_EMBLEM))
                .unlockedBy("has_diamond_boots", has(Items.DIAMOND_BOOTS))
                .unlockedBy("has_coals", has(ItemTags.COALS))
                .save(recipeOutput);

        //rer iron armor to iron armor
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.IRON_HELMET)
                .requires(ModTags.Items.RER_IRON_HELMET)
                .unlockedBy("has_rer_iron_helmet", has(ModTags.Items.RER_IRON_HELMET))
                .save(recipeOutput, "rercustommod:iron_helmet_from_rer_iron_helmet");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.IRON_CHESTPLATE)
                .requires(ModTags.Items.RER_IRON_CHESTPLATE)
                .unlockedBy("has_rer_iron_chestplate", has(ModTags.Items.RER_IRON_CHESTPLATE))
                .save(recipeOutput, "rercustommod:iron_chestplate_from_rer_iron_chestplate");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.IRON_LEGGINGS)
                .requires(ModTags.Items.RER_IRON_LEGGINGS)
                .unlockedBy("has_rer_iron_leggings", has(ModTags.Items.RER_IRON_LEGGINGS))
                .save(recipeOutput, "rercustommod:iron_leggings_from_rer_iron_leggings");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.IRON_BOOTS)
                .requires(ModTags.Items.RER_IRON_BOOTS)
                .unlockedBy("has_rer_iron_helmet", has(ModTags.Items.RER_IRON_BOOTS))
                .save(recipeOutput, "rercustommod:iron_boots_from_rer_iron_boots");

        //rer carbon fiber armor to diamond armor
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND_HELMET)
                .requires(ModTags.Items.RER_CARBON_FIBER_HELMET)
                .unlockedBy("has_rer_carbon_fiber_helmet", has(ModTags.Items.RER_CARBON_FIBER_HELMET))
                .save(recipeOutput, "rercustommod:diamond_helmet_from_rer_carbon_fiber_helmet");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND_CHESTPLATE)
                .requires(ModTags.Items.RER_CARBON_FIBER_CHESTPLATE)
                .unlockedBy("has_rer_carbon_fiber_chestplate", has(ModTags.Items.RER_CARBON_FIBER_CHESTPLATE))
                .save(recipeOutput, "rercustommod:diamond_chestplate_from_rer_carbon_fiber_chestplate");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND_LEGGINGS)
                .requires(ModTags.Items.RER_CARBON_FIBER_LEGGINGS)
                .unlockedBy("has_rer_carbon_fiber_leggings", has(ModTags.Items.RER_CARBON_FIBER_LEGGINGS))
                .save(recipeOutput, "rercustommod:diamond_leggings_from_rer_carbon_fiber_leggings");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND_BOOTS)
                .requires(ModTags.Items.RER_CARBON_FIBER_BOOTS)
                .unlockedBy("has_rer_carbon_fiber_helmet", has(ModTags.Items.RER_CARBON_FIBER_BOOTS))
                .save(recipeOutput, "rercustommod:diamond_boots_from_rer_carbon_fiber_boots");


    }
}
