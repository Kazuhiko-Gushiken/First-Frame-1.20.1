package net.inno.firstframe.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.inno.firstframe.block.ModBlocks;
import net.inno.firstframe.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static List<ItemConvertible> HEPATIZON_SMELTABLES = List.of(ModBlocks.HEPATIZON_ORE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, HEPATIZON_SMELTABLES, RecipeCategory.MISC, ModBlocks.HEPATIZON_BLOCK,
                0.7f, 200, "hepatizon");
        offerBlasting(exporter, HEPATIZON_SMELTABLES, RecipeCategory.MISC, ModBlocks.HEPATIZON_BLOCK,
                0.7f, 100, "hepatizon");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SOUND_BLOCK, 1)
                .pattern("SSS")
                .pattern("SFS")
                .pattern("SSS")
                .input('S', Items.NETHERITE_BLOCK)
                .input('F', Items.CLOCK)
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SOUND_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SWIRLING_BOTTLE, 1)
                .input(Items.POTION)
                .input(Items.SUGAR);

    }
}
