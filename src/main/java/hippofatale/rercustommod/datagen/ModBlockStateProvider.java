package hippofatale.rercustommod.datagen;

import hippofatale.rercustommod.ReRCustomMod;
import hippofatale.rercustommod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ReRCustomMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModelFile stealthUnitMREBoxModel = models().orientableWithBottom("stealth_unit_mre_box",
                modLoc("block/stealth_unit_mre_box_side"),
                modLoc("block/stealth_unit_mre_box_back"),
                modLoc("block/stealth_unit_mre_box_bottom"),
                modLoc("block/stealth_unit_mre_box_side")
        );
        horizontalBlock(ModBlocks.STEALTH_UNIT_MRE_BOX.get(), stealthUnitMREBoxModel);
        simpleBlockItem(ModBlocks.STEALTH_UNIT_MRE_BOX.get(), stealthUnitMREBoxModel);

    }
}
