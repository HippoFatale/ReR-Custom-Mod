package hippofatale.rercustommod.item.client;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.item.custom.ReRIronArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ReRIronArmorModel extends GeoModel<ReRIronArmorItem> {
    int texturePathIndex;
    String[] texturePath = {
            "textures/armor/rer_iron_armor_texture.png",
            "textures/armor/stealth_unit_iron_armor_texture.png",
            "textures/armor/artillery_unit_iron_armor_texture.png",
            "textures/armor/vanguard_unit_iron_armor_texture.png",
            "textures/armor/intelligence_unit_iron_armor_texture.png",
            "textures/armor/enforcement_unit_iron_armor_texture.png"
    };

    public ReRIronArmorModel(int unitIndex) {
        texturePathIndex = unitIndex;
    }

    @Override
    public ResourceLocation getModelResource(ReRIronArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, "geo/rer_iron_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ReRIronArmorItem animatable) {

        return ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, texturePath[texturePathIndex]);
    }

    @Override
    public ResourceLocation getAnimationResource(ReRIronArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, "animations/rer_iron_armor.animation.json");
    }
}
