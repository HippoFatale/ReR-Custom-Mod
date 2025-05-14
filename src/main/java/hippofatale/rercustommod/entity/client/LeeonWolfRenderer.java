package hippofatale.rercustommod.entity.client;

import hippofatale.rercustommod.ReRCustomMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Wolf;

public class LeeonWolfRenderer extends WolfRenderer {
    public LeeonWolfRenderer(EntityRendererProvider.Context p_174452_) {
        super(p_174452_);
    }

    @Override
    public ResourceLocation getTextureLocation(Wolf entity) {
        return ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, "textures/entity/leeon_wolf.png");
    }
}
