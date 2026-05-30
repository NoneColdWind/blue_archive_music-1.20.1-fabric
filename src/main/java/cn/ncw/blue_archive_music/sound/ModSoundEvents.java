package cn.ncw.blue_archive_music.sound;

import cn.ncw.blue_archive_music.BlueArchiveMusicMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import static cn.ncw.blue_archive_music.base.CommonVariable.BlueArchiveMusicNames;


public class ModSoundEvents {

    public static Dictionary<String, SoundEvent> BlueArchiveMusicSoundEvents = new Hashtable<>();

    public static List<SoundEvent> BlueArchiveMusicSoundEventList = new ArrayList<>();

    static {
        for (String music_name : BlueArchiveMusicNames) {
            SoundEvent soundEvent = register(music_name);
            BlueArchiveMusicSoundEvents.put(music_name, soundEvent);
            BlueArchiveMusicSoundEventList.add(soundEvent);
        }
    }

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(BlueArchiveMusicMod.MOD_ID, "cn.ncw.bluearchive.music." + name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
