package cn.ncw.blue_archive_music.datagen;

import cn.ncw.blue_archive_music.item.ModItemGroups;
import cn.ncw.blue_archive_music.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import static cn.ncw.blue_archive_music.base.CommonVariable.*;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //英文语言文件生成

        translationBuilder.add(ModItemGroups.NCW_BA_MUSIC_GROUP, "Blue Archive Music");

        for (String id : BlueArchiveMusicIds) {
            translationBuilder.add(ModItems.BlueArchiveMusicDiscItems.get(id), "Music Disc");
            translationBuilder.add(ModItems.BlueArchiveMusicDiscItems.get(id).getTranslationKey() + ".desc", get_desc(id));
            translationBuilder.add("sound.music.blue_archive_music." + id, "Music: Play");
        }
    }
}
