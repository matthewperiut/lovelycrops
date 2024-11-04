package com.matthewperiut.lovelycrops.block;

import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static com.matthewperiut.lovelycrops.LovelyCrops.MANAGER;
import static com.matthewperiut.lovelycrops.LovelyCrops.MOD_ID;

public class ModBlocks {
    public static final Registrar<Block> BLOCKS = MANAGER.get().get(Registries.BLOCK);

    public static final Identifier GRAPEVINE_ID = Identifier.of(MOD_ID, "grapevine");
    public static final RegistryKey<Block> GRAPEVINE_KEY = RegistryKey.of(RegistryKeys.BLOCK, GRAPEVINE_ID);
    public static final RegistrySupplier<Block> GRAPEVINE = BLOCKS.register(GRAPEVINE_ID,
            () -> new GrapesCrop(AbstractBlock.Settings.create().registryKey(GRAPEVINE_KEY)));

    public static final Identifier MAIZE_ID = Identifier.of(MOD_ID, "maize");
    public static final RegistryKey<Block> MAIZE_KEY = RegistryKey.of(RegistryKeys.BLOCK, MAIZE_ID);
    public static final RegistrySupplier<Block> MAIZE = BLOCKS.register(MAIZE_ID,
            () -> new CornCrop(AbstractBlock.Settings.create().registryKey(MAIZE_KEY)));

    public static void initialize() {

    }
}
