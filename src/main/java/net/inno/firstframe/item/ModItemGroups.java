package net.inno.firstframe.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.inno.firstframe.FirstFrame;
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
                        entries.add(ModItems.SWIRLING_BOTTLE);
                        entries.add(ModItems.PAINT_EMPTY);

                    }).build());

    public static void registerItemsGroups() {
        FirstFrame.LOGGER.info("Registering Item Groups for " + FirstFrame.MOD_ID);
    }
}
