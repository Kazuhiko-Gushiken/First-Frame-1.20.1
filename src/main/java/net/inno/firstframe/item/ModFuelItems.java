package net.inno.firstframe.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuelItems {
    public static void init() {
        FuelRegistry.INSTANCE.add(ModItems.LAVA_SOLID, 20000);


    }
}
