package hippofatale.rercustommod.item.custom;

import hippofatale.rercustommod.entity.ModEntities;
import hippofatale.rercustommod.entity.custom.JackCatEntity;
import hippofatale.rercustommod.entity.custom.LeeonWolfEntity;
import hippofatale.rercustommod.entity.custom.RyuGullEntity;
import hippofatale.rercustommod.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.Objects;

public class ReRPetFoodItem extends Item {
    public ReRPetFoodItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity interactionTarget, InteractionHand usedHand) {
        BlockPos entityPos = interactionTarget.blockPosition();

        if (player.level().isClientSide()) {
            return InteractionResult.FAIL;
        }
        else {
            ServerLevel entityLevel = (ServerLevel) player.level();

            if (interactionTarget instanceof Cat && !(interactionTarget instanceof JackCatEntity) && stack.is(ModItems.STEALTH_UNIT_CAT_FOOD.get())) {
                return replaceWithReREntity(entityLevel, entityPos, player, interactionTarget, ModEntities.JACK_CAT.get(), stack);
            }
            else if (interactionTarget instanceof Wolf && !(interactionTarget instanceof LeeonWolfEntity) && stack.is(ModItems.ENFORCEMENT_UNIT_WOLF_FOOD.get())) {
                return replaceWithReREntity(entityLevel, entityPos, player, interactionTarget, ModEntities.LEEON_WOLF.get(), stack);
            }
            else if (interactionTarget instanceof Parrot && !(interactionTarget instanceof RyuGullEntity) && stack.is(ModItems.VANGUARD_UNIT_BIRD_FOOD.get())) {
                return replaceWithReREntity(entityLevel, entityPos, player, interactionTarget, ModEntities.RYU_GULL.get(), stack);
            }
            else {
                return InteractionResult.FAIL;
            }

        }
    }

    public static InteractionResult replaceWithReREntity(ServerLevel entityLevel, BlockPos entityPos, Player player, LivingEntity interactionTarget, EntityType rerEntityType, ItemStack stack) {
        if (((TamableAnimal) interactionTarget).isTame()) {
            LivingEntity owner = ((TamableAnimal) interactionTarget).getOwner();
            if (owner == player) {
                interactionTarget.remove(Entity.RemovalReason.KILLED);
                Entity spawnedEntity = rerEntityType.spawn(entityLevel, entityPos, MobSpawnType.EVENT);
                if (spawnedEntity != null) {
                    ((TamableAnimal) spawnedEntity).tame(player);
                }
                stack.shrink(1);
                return InteractionResult.CONSUME;
            }
            else {
                player.displayClientMessage(Component.translatable("message.rerscustommod.rer_pet_food_item.not_your_animal"), true);
                return InteractionResult.FAIL;
            }
        }
        else {
            interactionTarget.remove(Entity.RemovalReason.KILLED);
            rerEntityType.spawn(entityLevel, entityPos, MobSpawnType.EVENT);
            stack.shrink(1);
            return InteractionResult.CONSUME;
        }
    }

}
