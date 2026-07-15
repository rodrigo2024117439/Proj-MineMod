package pt.cravoo.firstmod.core.init;


import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import pt.cravoo.firstmod.Dianthus;

//classe para criar a tab do cretivo e registar os items nela
public class CreativeTabInit {
    //cria a aba
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Dianthus.MODID);

    //regista os item
    public static final RegistryObject<CreativeModeTab> DIANTHUS_TAB = TABS.register("dianthus",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.dianthus_tab"))
                    .icon(() -> ItemInit.ACOLITE.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ItemInit.ACOLITE.get());
                        output.accept(ItemInit.ACOLITE_ORE.get());
                        output.accept(ItemInit.SILVER_ORE.get());
                        output.accept(ItemInit.RAW_SILVER.get());
                        output.accept(ItemInit.SILVER_INGOT.get());
                    })
                    .build()
    );

}
