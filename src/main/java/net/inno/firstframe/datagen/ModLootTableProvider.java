package net.inno.firstframe.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.inno.firstframe.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.HEPATIZON_BLOCK);
        addDrop(ModBlocks.HEPATIZON_ORE);
        addDrop(ModBlocks.SOUND_BLOCK);

        addDrop(ModBlocks.GLASS_CRYSTAL_BLOCK, dropsWithSilkTouch(ModBlocks.GLASS_CRYSTAL_BLOCK));
    }
}
