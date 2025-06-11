package hippofatale.rercustommod.item.client;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.item.custom.ReRArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ReRArmorModel extends GeoModel<ReRArmorItem> {
    int texturePathIndex;
    String[] texturePath = {
            "textures/armor/stealth_unit_iron_armor_texture.png",
            "textures/armor/artillery_unit_iron_armor_texture.png",
            "textures/armor/vanguard_unit_iron_armor_texture.png",
            "textures/armor/intelligence_unit_iron_armor_texture.png",
            "textures/armor/enforcement_unit_iron_armor_texture.png",
            "textures/armor/stealth_unit_carbon_fiber_armor_texture.png",
            "textures/armor/artillery_unit_carbon_fiber_armor_texture.png",
            "textures/armor/vanguard_unit_carbon_fiber_armor_texture.png",
            "textures/armor/intelligence_unit_carbon_fiber_armor_texture.png",
            "textures/armor/enforcement_unit_carbon_fiber_armor_texture.png"
    };

    public ReRArmorModel(int textureIndex) {
        texturePathIndex = textureIndex;
    }

    @Override
    public ResourceLocation getModelResource(ReRArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, "geo/rer_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ReRArmorItem animatable) {

        return ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, texturePath[texturePathIndex]);
    }

    @Override
    public ResourceLocation getAnimationResource(ReRArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, "animations/rer_armor.animation.json");
    }
}
