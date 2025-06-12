package hippofatale.rercustommod.event;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.entity.custom.JackCatEntity;
import hippofatale.rercustommod.entity.custom.LeeonWolfEntity;
import hippofatale.rercustommod.entity.custom.RyuGullEntity;
import hippofatale.rercustommod.item.ModItems;
import hippofatale.rercustommod.item.custom.ReRPetFoodItem;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.animal.Wolf;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber(modid = ReRCustomMod.MOD_ID)
public class ModItemEvents {
    @SubscribeEvent
    public static void entityInteract(PlayerInteractEvent.EntityInteract event) {
        if (!event.getSide().isClient()) {
            if (event.getTarget() instanceof Cat && !(event.getTarget() instanceof JackCatEntity) && event.getItemStack().is(ModItems.STEALTH_UNIT_CAT_FOOD.get())) {
                ReRPetFoodItem.replaceWithReREntity((ServerLevel) event.getLevel(), event.getPos(), event.getEntity(), (LivingEntity) event.getTarget(), event.getEntity().getType(), event.getItemStack());
            } else if (event.getTarget() instanceof Wolf && !(event.getTarget() instanceof LeeonWolfEntity) && event.getItemStack().is(ModItems.ENFORCEMENT_UNIT_WOLF_FOOD.get())) {
                ReRPetFoodItem.replaceWithReREntity((ServerLevel) event.getLevel(), event.getPos(), event.getEntity(), (LivingEntity) event.getTarget(), event.getEntity().getType(), event.getItemStack());
            } else if (event.getTarget() instanceof Parrot && !(event.getTarget() instanceof RyuGullEntity) && event.getItemStack().is(ModItems.VANGUARD_UNIT_BIRD_FOOD.get())) {
                ReRPetFoodItem.replaceWithReREntity((ServerLevel) event.getLevel(), event.getPos(), event.getEntity(), (LivingEntity) event.getTarget(), event.getEntity().getType(), event.getItemStack());
            }
        }
    }
}