package hippofatale.rercustommod.event;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.entity.ModEntities;
import hippofatale.rercustommod.entity.client.RyuGullOnShoulderLayer;
import hippofatale.rercustommod.entity.custom.JackCatEntity;
import hippofatale.rercustommod.entity.custom.LeeonWolfEntity;
import hippofatale.rercustommod.entity.custom.RyuGullEntity;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.resources.PlayerSkin;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = ReRCustomMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addPlayerLayers(EntityRenderersEvent.AddLayers event) {
        for (PlayerSkin.Model skin : event.getSkins()) {
            if (event.getSkin(skin) instanceof PlayerRenderer playerRenderer) {
                playerRenderer.addLayer(new RyuGullOnShoulderLayer(playerRenderer, event.getEntityModels()));
            }
        }
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.JACK_CAT.get(), JackCatEntity.createAttributes().build());
        event.put(ModEntities.LEEON_WOLF.get(), LeeonWolfEntity.createAttributes().build());
        event.put(ModEntities.RYU_GULL.get(), RyuGullEntity.createAttributes().build());
    }
}
