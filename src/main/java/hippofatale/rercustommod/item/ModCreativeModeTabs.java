package hippofatale.rercustommod.item;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReRCustomMod.MOD_ID);

    public static final Supplier<CreativeModeTab> REREVOLUTION_CUSTOM_ITEMS_TAB = CREATIVE_MODE_TAB.register("rerevolution_custom_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.REREVOLUTION_EMBLEM.get()))
                    .title(Component.translatable("creativetab.rercustommod.rerevolution_custom_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.REREVOLUTION_EMBLEM);
                        output.accept(ModItems.STEALTH_UNIT_EMBLEM);
                        output.accept(ModItems.ARTILLERY_UNIT_EMBLEM);
                        output.accept(ModItems.VANGUARD_UNIT_EMBLEM);
                        output.accept(ModItems.INTELLIGENCE_UNIT_EMBLEM);
                        output.accept(ModItems.ENFORCEMENT_UNIT_EMBLEM);

                        output.accept(ModItems.STEALTH_UNIT_CAT_FOOD);
                        output.accept(ModItems.ENFORCEMENT_UNIT_WOLF_FOOD);
                        output.accept(ModItems.VANGUARD_UNIT_BIRD_FOOD);

                        output.accept(ModItems.STEALTH_UNIT_MRE);
                        output.accept(ModBlocks.STEALTH_UNIT_MRE_BOX);

                        output.accept(ModItems.JACK_CAT_SPAWN_EGG);
                        output.accept(ModItems.LEEON_WOLF_SPAWN_EGG);
                        output.accept(ModItems.RYU_GULL_SPAWN_EGG);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> REREVOLUTION_CUSTOM_ARMOR_TAB = CREATIVE_MODE_TAB.register("rerevolution_custom_armor_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.STEALTH_UNIT_IRON_HELMET.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, "rerevolution_custom_items_tab"))
                    .title(Component.translatable("creativetab.rercustommod.rerevolution_custom_armor"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //iron
                        output.accept(ModItems.STEALTH_UNIT_IRON_HELMET);
                        output.accept(ModItems.STEALTH_UNIT_IRON_CHESTPLATE);
                        output.accept(ModItems.STEALTH_UNIT_IRON_LEGGINGS);
                        output.accept(ModItems.STEALTH_UNIT_IRON_BOOTS);

                        output.accept(ModItems.ARTILLERY_UNIT_IRON_HELMET);
                        output.accept(ModItems.ARTILLERY_UNIT_IRON_CHESTPLATE);
                        output.accept(ModItems.ARTILLERY_UNIT_IRON_LEGGINGS);
                        output.accept(ModItems.ARTILLERY_UNIT_IRON_BOOTS);

                        output.accept(ModItems.VANGUARD_UNIT_IRON_HELMET);
                        output.accept(ModItems.VANGUARD_UNIT_IRON_CHESTPLATE);
                        output.accept(ModItems.VANGUARD_UNIT_IRON_LEGGINGS);
                        output.accept(ModItems.VANGUARD_UNIT_IRON_BOOTS);

                        output.accept(ModItems.INTELLIGENCE_UNIT_IRON_HELMET);
                        output.accept(ModItems.INTELLIGENCE_UNIT_IRON_CHESTPLATE);
                        output.accept(ModItems.INTELLIGENCE_UNIT_IRON_LEGGINGS);
                        output.accept(ModItems.INTELLIGENCE_UNIT_IRON_BOOTS);

                        output.accept(ModItems.ENFORCEMENT_UNIT_IRON_HELMET);
                        output.accept(ModItems.ENFORCEMENT_UNIT_IRON_CHESTPLATE);
                        output.accept(ModItems.ENFORCEMENT_UNIT_IRON_LEGGINGS);
                        output.accept(ModItems.ENFORCEMENT_UNIT_IRON_BOOTS);

                        //carbon fiber
                        output.accept(ModItems.STEALTH_UNIT_CARBON_FIBER_HELMET);
                        output.accept(ModItems.STEALTH_UNIT_CARBON_FIBER_CHESTPLATE);
                        output.accept(ModItems.STEALTH_UNIT_CARBON_FIBER_LEGGINGS);
                        output.accept(ModItems.STEALTH_UNIT_CARBON_FIBER_BOOTS);

                        output.accept(ModItems.ARTILLERY_UNIT_CARBON_FIBER_HELMET);
                        output.accept(ModItems.ARTILLERY_UNIT_CARBON_FIBER_CHESTPLATE);
                        output.accept(ModItems.ARTILLERY_UNIT_CARBON_FIBER_LEGGINGS);
                        output.accept(ModItems.ARTILLERY_UNIT_CARBON_FIBER_BOOTS);

                        output.accept(ModItems.VANGUARD_UNIT_CARBON_FIBER_HELMET);
                        output.accept(ModItems.VANGUARD_UNIT_CARBON_FIBER_CHESTPLATE);
                        output.accept(ModItems.VANGUARD_UNIT_CARBON_FIBER_LEGGINGS);
                        output.accept(ModItems.VANGUARD_UNIT_CARBON_FIBER_BOOTS);

                        output.accept(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_HELMET);
                        output.accept(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_CHESTPLATE);
                        output.accept(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_LEGGINGS);
                        output.accept(ModItems.INTELLIGENCE_UNIT_CARBON_FIBER_BOOTS);

                        output.accept(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_HELMET);
                        output.accept(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_CHESTPLATE);
                        output.accept(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_LEGGINGS);
                        output.accept(ModItems.ENFORCEMENT_UNIT_CARBON_FIBER_BOOTS);

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
