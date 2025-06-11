package hippofatale.rercustommod.item.client;

import hippofatale.rercustommod.item.custom.ReRArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ReRArmorRenderer extends GeoArmorRenderer<ReRArmorItem> {
    public ReRArmorRenderer(int textureIndex) {
        super(new ReRArmorModel(textureIndex));
    }
}
