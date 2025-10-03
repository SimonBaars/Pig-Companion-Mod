package com.simonbaars.pigcompanion;

import com.simonbaars.pigcompanion.entity.ModEntities;
import com.simonbaars.pigcompanion.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PigCompanionMod implements ModInitializer {
	public static final String MOD_ID = "pigcompanion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Pig Companion Mod");
		
		ModItems.register();
		ModEntities.register();
	}
}
