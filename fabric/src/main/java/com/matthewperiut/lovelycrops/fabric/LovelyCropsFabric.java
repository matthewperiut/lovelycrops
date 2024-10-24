package com.matthewperiut.lovelycrops.fabric;

import com.matthewperiut.lovelycrops.LovelyCrops;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LovelyCropsFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		LovelyCrops.initialize();
	}
}