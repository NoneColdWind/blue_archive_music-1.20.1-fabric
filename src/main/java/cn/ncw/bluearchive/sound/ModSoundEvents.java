package cn.ncw.bluearchive.sound;

import cn.ncw.bluearchive.BlueArchiveMusicMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;

import static cn.ncw.bluearchive.base.CommonVariable.BlueArchiveMusicNames;


public class ModSoundEvents {

    public static Dictionary<String, SoundEvent> BlueArchiveMusicSoundEvents = new Hashtable<>();

    static {
        for (String music_name : BlueArchiveMusicNames) {
            BlueArchiveMusicSoundEvents.put(music_name, register(music_name));
        }
    }

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(BlueArchiveMusicMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
