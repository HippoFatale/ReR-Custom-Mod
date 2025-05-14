package hippofatale.rercustommod.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.level.Level;

public class RyuGullEntity extends Parrot {
    public RyuGullEntity(EntityType<? extends Parrot> entityType, Level level) {
        super(entityType, level);
    }

    public boolean setEntityOnShoulder(ServerPlayer player) {
        CompoundTag compoundtag = new CompoundTag();
        compoundtag.putString("id", this.getEncodeId());
        this.saveWithoutId(compoundtag);
        if (player.setEntityOnShoulder(compoundtag)) {
            this.discard();
            return true;
        } else {
            return false;
        }
    }}
