package cn.ncw.bluearchive.datagen;

import cn.ncw.bluearchive.item.ModItemGroups;
import cn.ncw.bluearchive.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import static cn.ncw.bluearchive.base.CommonVariable.*;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //英文语言文件生成

        translationBuilder.add(ModItemGroups.NCW_BA_MUSIC_GROUP, "Blue Archive Music");

        for (String music_name : BlueArchiveMusicNames) {
            String writer = "";
            translationBuilder.add(ModItems.BlueArchiveMusicDiscItems.get(music_name), "Music Disc");
            if (Mitsukiyo.contains(BlueArchiveMusic.get(music_name))) {
                writer = "Mitsukiyo";
            } else if (Nor.contains(BlueArchiveMusic.get(music_name))) {
                writer = "Nor";
            } else if (KARUT.contains(BlueArchiveMusic.get(music_name))) {
                writer = "KARUT";
            } else {
                writer = "null";
            }
            translationBuilder.add(ModItems.BlueArchiveMusicDiscItems.get(music_name).getTranslationKey() + ".desc", writer + " - " + BlueArchiveMusic.get(music_name));
        }
    }
}
