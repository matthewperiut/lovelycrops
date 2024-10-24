package com.matthewperiut.lovelycrops.block;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.matthewperiut.lovelycrops.LovelyCrops;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.Block;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
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
