package hippofatale.rercustommod.item.client;

import hippofatale.rercustommod.item.custom.ReRIronArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RerIronArmorRenderer extends GeoArmorRenderer<ReRIronArmorItem> {
    public RerIronArmorRenderer(int unitIndex) {
        super(new ReRIronArmorModel(unitIndex));
    }
}
