package com.matthewperiut.lovelycrops.item;

import com.matthewperiut.lovelycrops.block.ModBlocks;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static com.matthewperiut.lovelycrops.LovelyCrops.MANAGER;
import static com.matthewperiut.lovelycrops.LovelyCrops.MOD_ID;

public class ModItems {
    public static final Registrar<Item> ITEMS = MANAGER.get().get(Registries.ITEM);
    public static final RegistrySupplier<Item> GRAPES = ITEMS.register(Identifier.of(MOD_ID, "grapes"),
            () -> new Item((new Item.Settings()).food(FoodComponents.CARROT).arch$tab(ItemGroups.FOOD_AND_DRINK)));
    public static final RegistrySupplier<Item> GRAPE_SEEDS = ITEMS.register(Identifier.of(MOD_ID, "grape_seeds"),
            () -> new AliasedBlockItem(ModBlocks.GRAPEVINE.get(), new Item.Settings().arch$tab(ItemGroups.NATURAL)));
    public static final RegistrySupplier<Item> GRAPE_JUICE = ITEMS.register(Identifier.of(MOD_ID, "grape_juice"),
            () -> new GrapeJuiceItem(new Item.Settings().arch$tab(ItemGroups.FOOD_AND_DRINK)));
    public static final RegistrySupplier<Item> CORN = ITEMS.register(Identifier.of(MOD_ID, "corn"),
            () -> new Item((new Item.Settings()).food(FoodComponents.BEETROOT).arch$tab(ItemGroups.FOOD_AND_DRINK)));
    public static final RegistrySupplier<Item> CORN_SEEDS = ITEMS.register(Identifier.of(MOD_ID, "corn_seeds"),
            () -> new AliasedBlockItem(ModBlocks.MAIZE.get(), new Item.Settings().arch$tab(ItemGroups.NATURAL)));
    public static final RegistrySupplier<Item> CORN_SOUP = ITEMS.register(Identifier.of(MOD_ID, "corn_soup"),
            () -> new Item((new Item.Settings()).food(FoodComponents.BEETROOT_SOUP).arch$tab(ItemGroups.FOOD_AND_DRINK)));

    public static void initialize() {

    }
}
