package net.inno.firstframe.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.inno.firstframe.block.ModBlocks;
import net.inno.firstframe.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.world.gen.feature.BlockColumnFeatureConfig;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLASS_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEPATIZON_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEPATIZON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LAVA_SOLID, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_EMPTY, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_BLACK, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_BLUE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_BROWN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_CYAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_GRAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_GREEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_LACQUER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_LIGHTBLUE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_LIME, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_MAGENTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_PINK, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_RED, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_WHITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_YELLOW, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAINT_PURPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWIRLING_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUIN_PROSPECTOR, Models.GENERATED);
    }
}
