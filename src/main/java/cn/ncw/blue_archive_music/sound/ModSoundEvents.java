package cn.ncw.blue_archive_music.sound;

import cn.ncw.blue_archive_music.BAMusic;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;

import static cn.ncw.blue_archive_music.base.CommonVariable.BlueArchiveMusicIds;


public class ModSoundEvents {

    public static Dictionary<String, SoundEvent> BlueArchiveMusicSoundEvents = new Hashtable<>();

    static {
        for (String id : BlueArchiveMusicIds) {
            SoundEvent soundEvent = register("music." + id);
            BlueArchiveMusicSoundEvents.put(id, soundEvent);
        }
    }

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(BAMusic.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
