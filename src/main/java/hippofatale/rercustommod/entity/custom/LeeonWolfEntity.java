package hippofatale.rercustommod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.level.Level;

public class LeeonWolfEntity extends Wolf {
    public LeeonWolfEntity(EntityType<? extends Wolf> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public boolean canMate(Animal otherAnimal) {
        return false;
    }
}
