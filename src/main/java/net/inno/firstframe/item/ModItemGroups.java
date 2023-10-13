package net.inno.firstframe.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.inno.firstframe.FirstFrame;
import net.inno.firstframe.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FINAL_FRAME = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FirstFrame.MOD_ID, "first_frame"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.first_frame"))
                    .icon(() -> new ItemStack(ModItems.PAINT_EMPTY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PAINT_EMPTY);
                        entries.add(ModItems.PAINT_WHITE);
                        entries.add(ModItems.PAINT_ORANGE);
                        entries.add(ModItems.PAINT_MAGENTA);
                        entries.add(ModItems.PAINT_LIGHTBLUE);
                        entries.add(ModItems.PAINT_YELLOW);
                        entries.add(ModItems.PAINT_LIME);
                        entries.add(ModItems.PAINT_PINK);
                        entries.add(ModItems.PAINT_GRAY);
                        entries.add(ModItems.PAINT_SILVER);
                        entries.add(ModItems.PAINT_CYAN);
                        entries.add(ModItems.PAINT_PURPLE);
                        entries.add(ModItems.PAINT_BLUE);
                        entries.add(ModItems.PAINT_BROWN);
                        entries.add(ModItems.PAINT_GREEN);
                        entries.add(ModItems.PAINT_RED);
                        entries.add(ModItems.PAINT_BLACK);
                        entries.add(ModItems.PAINT_LACQUER);
                        entries.add(ModItems.SWIRLING_BOTTLE);
                        entries.add(ModBlocks.HEPATIZON_BLOCK);
                        entries.add(ModBlocks.GLASS_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.HEPATIZON_ORE);
                        entries.add(ModItems.METAL_DETECTOR);

                    }).build());

    public static void registerItemsGroups() {
        FirstFrame.LOGGER.info("Registering Item Groups for " + FirstFrame.MOD_ID);
    }
}
