package com.jogl.moremeat.item;

import com.jogl.moremeat.MoreMeat;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreMeat.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MORE_MEAT_TAB = CREATIVE_MODE_TABS.register("more_meat_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOAT.get()))
                    .title(Component.translatable("creativetab.more_meat_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //items to add to more meat creative mode tab
                        pOutput.accept(ModItems.GOAT.get());
                        pOutput.accept(ModItems.COOKED_GOAT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
