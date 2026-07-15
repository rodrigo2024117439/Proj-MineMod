package pt.cravoo.firstmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import pt.cravoo.firstmod.Dianthus;
import pt.cravoo.firstmod.core.init.BlockInit;


public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, Dianthus.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){

        simpleBlockWithItem(BlockInit.ACOLITE_ORE_BLOCK.get(), cubeAll(BlockInit.ACOLITE_ORE_BLOCK.get()));
    }
}
