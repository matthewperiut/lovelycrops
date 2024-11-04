package com.matthewperiut.lovelycrops.neoforge;

import com.matthewperiut.lovelycrops.LovelyCrops;
import com.matthewperiut.lovelycrops.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(LovelyCrops.MOD_ID)
public class LovelyCropsNeoForge
{
    public LovelyCropsNeoForge(IEventBus modEventBus)
    {
        modEventBus.addListener(this::commonSetup);
        LovelyCrops.initialize();
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LovelyCrops.post();
    }

    @EventBusSubscriber(modid = LovelyCrops.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            RenderLayers.setRenderLayer(ModBlocks.GRAPEVINE.get(), RenderLayer.getTranslucent());
            RenderLayers.setRenderLayer(ModBlocks.MAIZE.get(), RenderLayer.getTranslucent());
        }
    }
}