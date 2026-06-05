package cn.ncw.blue_archive_music.item;

import cn.ncw.blue_archive_music.BAMusic;
import cn.ncw.blue_archive_music.sound.ModSoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.Dictionary;
import java.util.Hashtable;

import static cn.ncw.blue_archive_music.base.CommonVariable.BlueArchiveMusicLength;
import static cn.ncw.blue_archive_music.base.CommonVariable.BlueArchiveMusicIds;

public class ModItems {

    public static Dictionary<String, Item> BlueArchiveMusicDiscItems = new Hashtable<>();

    static {
        for (String id : BlueArchiveMusicIds) {
            BlueArchiveMusicDiscItems.put(id, register(id, new MusicDiscItem(15, ModSoundEvents.BlueArchiveMusicSoundEvents.get(id), new Item.Settings().maxCount(1).rarity(Rarity.RARE), BlueArchiveMusicLength.get(id))));
        }
    }

    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(BAMusic.MOD_ID, id)), item);
    }

    public static void registerItems() {

    }

}
