package com.matthewperiut.lovelycrops.fabric;

import com.matthewperiut.lovelycrops.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class LovelyCropsFabricClient implements ClientModInitializer {
    public LovelyCropsFabricClient() {
    }

    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.GRAPEVINE.get()});
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.MAIZE.get()});
    }
}
