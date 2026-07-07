package pt.cravoo.firstmod.core.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "dianthus");

    public static final RegistryObject<Block> ACOLITE_ORE_BLOCK = BLOCKS.register("acolite_ore",
            () -> oreBlocksEqualIron("acolite_ore")

    );

    public static Block oreBlocksEqualIron(String id) {
        return new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .strength(3.0f, 3.0f)
                .setId(BLOCKS.key(id)));
    }
}