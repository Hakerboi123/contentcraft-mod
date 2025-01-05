package xyz.glowstonelabs.contentcraft;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static xyz.glowstonelabs.contentcraft.block.ModBlocks.registerModBlocks;
import static xyz.glowstonelabs.contentcraft.item.ModItemGroups.registerItemGroups;
import static xyz.glowstonelabs.contentcraft.item.ModItems.registerModItems;

public class ContentCraft implements ModInitializer {
	public static final String MOD_ID = "contentcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		registerModItems();
		registerModBlocks();
		registerItemGroups();

	}
}