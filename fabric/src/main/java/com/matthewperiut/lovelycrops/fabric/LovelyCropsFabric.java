package com.matthewperiut.lovelycrops.fabric;

import com.matthewperiut.lovelycrops.LovelyCrops;
import net.fabricmc.api.ModInitializer;

public class LovelyCropsFabric implements ModInitializer {
	//private static final Optional<RegistryKey<LootTable>> SHORT_GRASS_LOOT_TABLE_ID = Blocks.SHORT_GRASS.getLootTableKey();

	@Override
	public void onInitialize() {
		LovelyCrops.initialize();
        /*
		LootTableEvents.MODIFY.register(new LootTableEvents.Modify() {
            @Override
            public void modifyLootTable(RegistryKey<LootTable> key, LootTable.Builder tableBuilder, LootTableSource source, RegistryWrapper.WrapperLookup registries) {
                // Let's only modify built-in loot tables and leave data pack loot tables untouched by checking the source.
                // We also check that the loot table ID is equal to the ID we want.

                if (source.isBuiltin() && SHORT_GRASS_LOOT_TABLE_ID.isPresent() && SHORT_GRASS_LOOT_TABLE_ID.get().equals(key)) {
                    // We make the pool and add an item
                    LootPool.Builder poolBuilder = LootPool.builder().with(ItemEntry.builder(ModItems.CORN_SEEDS.get()));
                    tableBuilder.pool(poolBuilder);
                }
            }
        });*/
	}
}