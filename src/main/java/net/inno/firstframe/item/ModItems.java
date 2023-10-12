package net.inno.firstframe.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.inno.firstframe.FirstFrame;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SWIRLING_BOTTLE = regiterItem("swirling_bottle", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsTab(FabricItemGroupEntries entries) {
        entries.add(SWIRLING_BOTTLE);
    }

    private static Item regiterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FirstFrame.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstFrame.LOGGER.info("Registering Mod Items for " + FirstFrame.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTab);
    }
}
