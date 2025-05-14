package hippofatale.rercustommod.entity;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.entity.custom.JackCatEntity;
import hippofatale.rercustommod.entity.custom.LeeonWolfEntity;
import hippofatale.rercustommod.entity.custom.RyuGullEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, ReRCustomMod.MOD_ID);

    public static final Supplier<EntityType<JackCatEntity>> JACK_CAT =
            ENTITY_TYPES.register("jack_cat", () -> EntityType.Builder.of(JackCatEntity::new, MobCategory.CREATURE)
                    .sized(0.6F, 0.7F)
                    .eyeHeight(0.35F)
                    .passengerAttachments(0.5125F)
                    .clientTrackingRange(8)
                    .build("jack_cat"));

    public static final Supplier<EntityType<LeeonWolfEntity>> LEEON_WOLF =
            ENTITY_TYPES.register("leeon_wolf", () -> EntityType.Builder.of(LeeonWolfEntity::new, MobCategory.CREATURE)
                    .sized(0.6F, 0.85F)
                    .eyeHeight(0.68F)
                    .passengerAttachments(new Vec3(0.0, 0.81875, -0.0625))
                    .clientTrackingRange(10)
                    .build("leeon_wolf"));

    public static final Supplier<EntityType<RyuGullEntity>> RYU_GULL =
            ENTITY_TYPES.register("ryu_gull", () -> EntityType.Builder.of(RyuGullEntity::new, MobCategory.CREATURE)
                    .sized(0.5F, 0.9F)
                    .eyeHeight(0.54F)
                    .passengerAttachments(0.4625F)
                    .clientTrackingRange(8)
                    .build("ryu_gull"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
