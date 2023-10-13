package net.inno.firstframe.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.inno.firstframe.FirstFrame;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;

public class ModBlocks {
    public static final Block HEPATIZON_BLOCK = registerBlock("hepatizon_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GLASS_CRYSTAL_BLOCK = registerBlock("glass_crystal_block",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block HEPATIZON_ORE = registerBlock("hepatizon_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2f)));


    private static Block registerBlock(String name, Block block) {
        registerBlockitem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FirstFrame.MOD_ID, name), block);
    }

    private static Item registerBlockitem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FirstFrame.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        FirstFrame.LOGGER.info("Registering ModBlocks for " + FirstFrame.MOD_ID);
    }
}
