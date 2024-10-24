package com.matthewperiut.lovelycrops.item;

import com.matthewperiut.lovelycrops.block.ModBlocks;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static com.matthewperiut.lovelycrops.LovelyCrops.MANAGER;
import static com.matthewperiut.lovelycrops.LovelyCrops.MOD_ID;

public class ModItems {
    public static final Registrar<Item> ITEMS = MANAGER.get().get(Registries.ITEM);

    public static final Identifier GRAPES_ID = Identifier.of(MOD_ID, "grapes");
    public static final RegistryKey<Item> GRAPES_KEY = RegistryKey.of(RegistryKeys.ITEM, GRAPES_ID);
    public static final RegistrySupplier<Item> GRAPES = ITEMS.register(GRAPES_ID,
            () -> new Item((new Item.Settings()).food(FoodComponents.CARROT).registryKey(GRAPES_KEY).arch$tab(ItemGroups.FOOD_AND_DRINK)));

    public static final Identifier GRAPES_SEEDS_ID = Identifier.of(MOD_ID, "grape_seeds");
    public static final RegistryKey<Item> GRAPES_SEEDS_KEY = RegistryKey.of(RegistryKeys.ITEM, GRAPES_SEEDS_ID);
    public static final RegistrySupplier<Item> GRAPE_SEEDS = ITEMS.register(GRAPES_SEEDS_ID,
            () -> new BlockItem(ModBlocks.GRAPEVINE.get(), new Item.Settings().registryKey(GRAPES_SEEDS_KEY).arch$tab(ItemGroups.NATURAL)));

    public static final Identifier GRAPE_JUICE_ID = Identifier.of(MOD_ID, "grape_juice");
    public static final RegistryKey<Item> GRAPE_JUICE_KEY = RegistryKey.of(RegistryKeys.ITEM, GRAPE_JUICE_ID);
    public static final RegistrySupplier<Item> GRAPE_JUICE = ITEMS.register(GRAPE_JUICE_ID,
            () -> new GrapeJuiceItem(new Item.Settings().registryKey(GRAPE_JUICE_KEY).arch$tab(ItemGroups.FOOD_AND_DRINK)));

    public static final Identifier CORN_ID = Identifier.of(MOD_ID, "corn");
    public static final RegistryKey<Item> CORN_KEY = RegistryKey.of(RegistryKeys.ITEM, CORN_ID);
    public static final RegistrySupplier<Item> CORN = ITEMS.register(CORN_ID,
            () -> new Item((new Item.Settings()).food(FoodComponents.BEETROOT).registryKey(CORN_KEY).arch$tab(ItemGroups.FOOD_AND_DRINK)));

    public static final Identifier CORN_SEEDS_ID = Identifier.of(MOD_ID, "corn_seeds");
    public static final RegistryKey<Item> CORN_SEEDS_KEY = RegistryKey.of(RegistryKeys.ITEM, CORN_SEEDS_ID);
    public static final RegistrySupplier<Item> CORN_SEEDS = ITEMS.register(CORN_SEEDS_ID,
            () -> new BlockItem(ModBlocks.MAIZE.get(), new Item.Settings().registryKey(CORN_SEEDS_KEY).arch$tab(ItemGroups.NATURAL)));

    public static final Identifier CORN_SOUP_ID = Identifier.of(MOD_ID, "corn_soup");
    public static final RegistryKey<Item> CORN_SOUP_KEY = RegistryKey.of(RegistryKeys.ITEM, CORN_SEEDS_ID);
    public static final RegistrySupplier<Item> CORN_SOUP = ITEMS.register(CORN_SOUP_ID,
            () -> new Item((new Item.Settings()).food(FoodComponents.BEETROOT_SOUP).registryKey(CORN_SOUP_KEY).arch$tab(ItemGroups.FOOD_AND_DRINK)));

    public static void initialize() {

    }
}
