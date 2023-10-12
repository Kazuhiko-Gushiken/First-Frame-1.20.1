package net.inno.firstframe;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.inno.firstframe.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class FirstFrameClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_CRYSTAL_BLOCK, RenderLayer.getTranslucent());

    }
}
