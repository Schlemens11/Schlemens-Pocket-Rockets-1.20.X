package net.schlemens.schlemenspocketrockets;

import net.fabricmc.api.ModInitializer;

import net.schlemens.schlemenspocketrockets.block.ModBlocks;
import net.schlemens.schlemenspocketrockets.item.ModItemGroups;
import net.schlemens.schlemenspocketrockets.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SchlemensPocketRockets implements ModInitializer {
    public static final String MOD_ID = "schlemenspocketrockets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}