package com.matthewperiut.lovelycrops.fabric;

import com.matthewperiut.lovelycrops.LovelyCrops;
import net.fabricmc.api.ModInitializer;

public class LovelyCropsFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		LovelyCrops.initialize();
		LovelyCrops.post();
	}
}