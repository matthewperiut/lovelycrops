package com.matthewperiut.lovelycrops.block;

import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static com.matthewperiut.lovelycrops.LovelyCrops.MANAGER;
import static com.matthewperiut.lovelycrops.LovelyCrops.MOD_ID;

public class ModBlocks {
    public static final Registrar<Block> BLOCKS = MANAGER.get().get(Registries.BLOCK);
    public static final RegistrySupplier<Block> GRAPEVINE = BLOCKS.register(Identifier.of(MOD_ID, "grapevine"),
            GrapesCrop::new);
    public static final RegistrySupplier<Block> MAIZE = BLOCKS.register(Identifier.of(MOD_ID, "maize"),
            CornCrop::new);

    public static void initialize() {

    }
}
