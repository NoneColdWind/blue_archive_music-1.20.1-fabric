package cn.ncw.bluearchive;

import cn.ncw.bluearchive.item.ModItemGroups;
import cn.ncw.bluearchive.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueArchiveMusicMod implements ModInitializer {
	public static final String MOD_ID = "blue_archive_music_mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerItems();
		ModItemGroups.registerGroups();

	}
}