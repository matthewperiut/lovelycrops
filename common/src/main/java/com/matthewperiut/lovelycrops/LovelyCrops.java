package com.matthewperiut.lovelycrops;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.matthewperiut.lovelycrops.block.ModBlocks;
import com.matthewperiut.lovelycrops.event.ModEvents;
import com.matthewperiut.lovelycrops.item.ModItems;
import dev.architectury.registry.registries.RegistrarManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LovelyCrops {
	public static final String MOD_ID = "lovelycrops";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Supplier<RegistrarManager> MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));

	public static void initialize() {
		ModItems.initialize();
		ModBlocks.initialize();
		ModEvents.initialize();
	}
}