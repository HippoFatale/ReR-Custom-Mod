package hippofatale.rercustommod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties STEALTH_UNIT_MRE = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.6f)
            .build();
}
