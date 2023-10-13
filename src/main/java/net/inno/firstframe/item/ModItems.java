package net.inno.firstframe.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.inno.firstframe.FirstFrame;
import net.inno.firstframe.item.custom.MetalDetectorItem;
import net.inno.firstframe.item.custom.RuinProspectorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SWIRLING_BOTTLE = regiterItem("swirling_bottle", new Item(new FabricItemSettings()));
    public static final Item PAINT_EMPTY = regiterItem("paint_empty", new Item(new FabricItemSettings()));
    public static final Item PAINT_RED = regiterItem("paint_red", new Item(new FabricItemSettings()));
    public static final Item PAINT_ORANGE = regiterItem("paint_orange", new Item(new FabricItemSettings()));
    public static final Item PAINT_YELLOW = regiterItem("paint_yellow", new Item(new FabricItemSettings()));
    public static final Item PAINT_GREEN = regiterItem("paint_green", new Item(new FabricItemSettings()));
    public static final Item PAINT_BLUE = regiterItem("paint_blue", new Item(new FabricItemSettings()));
    public static final Item PAINT_PURPLE = regiterItem("paint_purple", new Item(new FabricItemSettings()));
    public static final Item PAINT_WHITE = regiterItem("paint_white", new Item(new FabricItemSettings()));
    public static final Item PAINT_SILVER = regiterItem("paint_silver", new Item(new FabricItemSettings()));
    public static final Item PAINT_PINK = regiterItem("paint_pink", new Item(new FabricItemSettings()));
    public static final Item PAINT_MAGENTA = regiterItem("paint_magenta", new Item(new FabricItemSettings()));
    public static final Item PAINT_LIME = regiterItem("paint_lime", new Item(new FabricItemSettings()));
    public static final Item PAINT_LIGHTBLUE = regiterItem("paint_lightblue", new Item(new FabricItemSettings()));
    public static final Item PAINT_LACQUER = regiterItem("paint_lacquer", new Item(new FabricItemSettings()));
    public static final Item PAINT_GRAY = regiterItem("paint_gray", new Item(new FabricItemSettings()));
    public static final Item PAINT_CYAN = regiterItem("paint_cyan", new Item(new FabricItemSettings()));
    public static final Item PAINT_BROWN = regiterItem("paint_brown", new Item(new FabricItemSettings()));
    public static final Item PAINT_BLACK = regiterItem("paint_black", new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = regiterItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item TOMATO = regiterItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item LAVA_SOLID = regiterItem("lava_solid", new Item(new FabricItemSettings()));
    public static final Item RUIN_PROSPECTOR = regiterItem("ruin_prospector", new RuinProspectorItem(new FabricItemSettings().maxDamage(20)));



    private static void addItemsToIngredientsTab(FabricItemGroupEntries entries) {

    }

    private static Item regiterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FirstFrame.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstFrame.LOGGER.info("Registering Mod Items for " + FirstFrame.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTab);
    }
}
