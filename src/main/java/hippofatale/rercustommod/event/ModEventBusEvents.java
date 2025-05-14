package hippofatale.rercustommod.event;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.entity.ModEntities;
import hippofatale.rercustommod.entity.custom.JackCatEntity;
import hippofatale.rercustommod.entity.custom.LeeonWolfEntity;
import hippofatale.rercustommod.entity.custom.RyuGullEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = ReRCustomMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
//    @SubscribeEvent
//    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
//        event.registerLayerDefinition();
//    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.JACK_CAT.get(), JackCatEntity.createAttributes().build());
        event.put(ModEntities.LEEON_WOLF.get(), LeeonWolfEntity.createAttributes().build());
        event.put(ModEntities.RYU_GULL.get(), RyuGullEntity.createAttributes().build());
    }
}
