package pt.cravoo.firstmod.core.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;



public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "dianthus");

    public static final RegistryObject<Item> ACOLITE=ITEMS.register("acolite",
            ()->criarMinerio("acolite"));
    public static final RegistryObject<Item> ACOLITE_ORE = ITEMS.register("acolite_ore",
            () -> new BlockItem(BlockInit.ACOLITE_ORE_BLOCK.get(), new Item.Properties().setId(ITEMS.key("acolite_ore")))
    );

    public static final RegistryObject<Item> SILVER_ORE=ITEMS.register("silver_ore",
            ()-> new BlockItem(BlockInit.SILVER_ORE_BLOCK.get(), new Item.Properties().setId(ITEMS.key("silver_ore")))
    );
    public static final RegistryObject<Item>RAW_SILVER=ITEMS.register("raw_silver",
            ()->criarMinerio("raw_silver")
    );

    public static final RegistryObject<Item>SILVER_INGOT= ITEMS.register("silver_ingot",
            ()->criarMinerio("silver_ingot")
    );


    private static Item criarMinerio(String id){
        return new Item(new Item.Properties()
                .setId(ITEMS.key(id))
                .stacksTo(64)
        );
    }

    private static Item criarItemMenosStack(String id){
        return new Item(new Item.Properties()
                .stacksTo(16)
                .setId(ITEMS.key(id))
        );
    }
}
