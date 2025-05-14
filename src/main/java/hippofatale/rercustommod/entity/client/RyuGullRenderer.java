package hippofatale.rercustommod.entity.client;

import hippofatale.rercustommod.ReRCustomMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ParrotRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Parrot;

public class RyuGullRenderer extends ParrotRenderer {
    public RyuGullRenderer(EntityRendererProvider.Context p_174336_) {
        super(p_174336_);
    }

    @Override
    public ResourceLocation getTextureLocation(Parrot entity) {
        return ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, "textures/entity/ryu_gull.png");
    }
}
