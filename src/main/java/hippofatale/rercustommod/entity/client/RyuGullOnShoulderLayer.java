package hippofatale.rercustommod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.entity.ModEntities;
import net.minecraft.client.model.ParrotModel;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ParrotRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.ParrotOnShoulderLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.resources.PlayerSkin;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@OnlyIn(Dist.CLIENT)
public class RyuGullOnShoulderLayer<T extends Player> extends RenderLayer<T, PlayerModel<T>> {
    private final ParrotModel model;

    public RyuGullOnShoulderLayer(RenderLayerParent<T, PlayerModel<T>> renderer, EntityModelSet modelSet) {
        super(renderer);
        this.model = new ParrotModel(modelSet.bakeLayer(ModelLayers.PARROT));
    }

    public void render(
            PoseStack poseStack,
            MultiBufferSource buffer,
            int packedLight,
            T livingEntity,
            float limbSwing,
            float limbSwingAmount,
            float partialTicks,
            float ageInTicks,
            float netHeadYaw,
            float headPitch
    ) {
        this.render(poseStack, buffer, packedLight, livingEntity, limbSwing, limbSwingAmount, netHeadYaw, headPitch, true);
        this.render(poseStack, buffer, packedLight, livingEntity, limbSwing, limbSwingAmount, netHeadYaw, headPitch, false);
    }

    private void render(
            PoseStack poseStack,
            MultiBufferSource buffer,
            int packedLight,
            T livingEntity,
            float limbSwing,
            float limbSwingAmount,
            float netHeadYaw,
            float headPitch,
            boolean leftShoulder
    ) {
        CompoundTag compoundtag = leftShoulder ? livingEntity.getShoulderEntityLeft() : livingEntity.getShoulderEntityRight();
        EntityType.byString(compoundtag.getString("id"))
                .filter(p_117294_ -> p_117294_ == ModEntities.RYU_GULL.get())
                .ifPresent(
                        p_262538_ -> {
                            poseStack.pushPose();
                            poseStack.translate(leftShoulder ? 0.4F : -0.4F, livingEntity.isCrouching() ? -1.3F : -1.5F, 0.0F);
                            //Parrot.Variant parrot$variant = Parrot.Variant.byId(compoundtag.getInt("Variant"));
                            VertexConsumer vertexconsumer = buffer.getBuffer(this.model.renderType(ResourceLocation.fromNamespaceAndPath(ReRCustomMod.MOD_ID, "textures/entity/ryu_gull.png")));
                            this.model
                                    .renderOnShoulder(
                                            poseStack, vertexconsumer, packedLight, OverlayTexture.NO_OVERLAY, limbSwing, limbSwingAmount, netHeadYaw, headPitch, livingEntity.tickCount
                                    );
                            poseStack.popPose();
                        }
                );
    }
}