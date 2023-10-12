package net.inno.firstframe;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstFrame implements ModInitializer {
	public static final String MOD_ID = "firstframe";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric Player! Welcome to a world like no other.");
	}
}