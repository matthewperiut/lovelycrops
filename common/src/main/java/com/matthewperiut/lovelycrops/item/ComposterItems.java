package com.matthewperiut.lovelycrops.item;

import net.minecraft.block.ComposterBlock;

import static com.matthewperiut.lovelycrops.item.ModItems.*;

public class ComposterItems {
    public static void init() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(CORN_SEEDS.get(), 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(GRAPE_SEEDS.get(), 0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(CORN.get(), 0.65f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(GRAPES.get(), 0.65f);
    }
}
