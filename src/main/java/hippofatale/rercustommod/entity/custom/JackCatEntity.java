package hippofatale.rercustommod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.level.Level;

public class JackCatEntity extends Cat {
    public JackCatEntity(EntityType<? extends Cat> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public boolean canMate(Animal otherAnimal) {
        return false;
    }
}
