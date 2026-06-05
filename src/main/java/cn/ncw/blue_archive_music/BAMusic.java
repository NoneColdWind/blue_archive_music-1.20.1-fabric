package cn.ncw.blue_archive_music;

import cn.ncw.blue_archive_music.item.ModItemGroups;
import cn.ncw.blue_archive_music.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BAMusic implements ModInitializer {
	public static final String MOD_ID = "blue_archive_music";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerItems();
		ModItemGroups.registerGroups();

		LOGGER.info("Mod Initialized successfully.");

	}
}