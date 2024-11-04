package com.matthewperiut.lovelycrops.event;

import com.matthewperiut.lovelycrops.item.ModItems;
import dev.architectury.event.events.common.LootEvent;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootManager;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class ModEvents {
    public static void initialize() {
        LootEvent.MODIFY_LOOT_TABLE.register(ModEvents::modifyLootTable);
    }

    private static void modifyLootTable(@Nullable LootManager lootManager, Identifier identifier, LootEvent.LootTableModificationContext lootTableModificationContext, boolean builtin) {
        if (builtin && Blocks.SHORT_GRASS.getLootTableId().equals(identifier)) {
            LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 100% of the time
                    .with(ItemEntry.builder(ModItems.CORN_SEEDS.get()))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
            lootTableModificationContext.addPool(poolBuilder);
            poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 100% of the time
                    .with(ItemEntry.builder(ModItems.GRAPE_SEEDS.get()))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));
            lootTableModificationContext.addPool(poolBuilder);
        }
    }
}
