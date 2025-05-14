package hippofatale.rercustommod.entity.client;

import hippofatale.rercustommod.ReRCustomMod;
import net.minecraft.client.renderer.entity.CatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Cat;

public class JackCatRenderer extends CatRenderer {
    public JackCatRenderer(EntityRendererProvider.Context p_173943_) {
        super(p_173943_);
    }

    @Override
    public ResourceLocation getTextureLocation(Cat entity) {
        return ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, "textures/entity/jack_cat.png");
    }
}
