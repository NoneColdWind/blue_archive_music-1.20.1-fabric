package cn.ncw.bluearchive.item;

import cn.ncw.bluearchive.BlueArchiveMusicMod;
import cn.ncw.bluearchive.sound.ModSoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.Dictionary;
import java.util.Hashtable;

import static cn.ncw.bluearchive.base.CommonVariable.BlueArchiveMusicLength;
import static cn.ncw.bluearchive.base.CommonVariable.BlueArchiveMusicNames;

public class ModItems {

    public static Dictionary<String, Item> BlueArchiveMusicDiscItems = new Hashtable<>();

    static {
        for (String music_name : BlueArchiveMusicNames) {
            BlueArchiveMusicDiscItems.put(music_name, register(music_name, new MusicDiscItem(15, ModSoundEvents.BlueArchiveMusicSoundEvents.get(music_name), new Item.Settings().maxCount(1).rarity(Rarity.RARE), BlueArchiveMusicLength.get(music_name))));
        }
    }

    private static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(BlueArchiveMusicMod.MOD_ID, id)), item);
    }

    public static void registerItems() {

    }

}
