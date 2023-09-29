package com.jogl.moremeat.item;

import com.jogl.moremeat.MoreMeat;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//holds all mod items
//NOTE - to files from minecraft like recipes go to External Libraries/net.minecraft:client:extra:1.20.1
public class ModItems {
    //a deferred register is a long list of items for when forge loads items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreMeat.MOD_ID);

    //raw goat meat item
    public static final RegistryObject<Item> GOAT = ITEMS.register("goat",
            () -> new Item(new Item.Properties().food(ModFoods.GOAT)));
    //raw goat meat item
    public static final RegistryObject<Item> COOKED_GOAT = ITEMS.register("cooked_goat",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_GOAT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
