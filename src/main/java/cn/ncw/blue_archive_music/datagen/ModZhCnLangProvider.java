package cn.ncw.blue_archive_music.datagen;

import cn.ncw.blue_archive_music.item.ModItemGroups;
import cn.ncw.blue_archive_music.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import static cn.ncw.blue_archive_music.base.CommonVariable.*;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //中文语言文件生成

        translationBuilder.add(ModItemGroups.NCW_BA_MUSIC_GROUP, "蔚蓝档案音乐");

        for (String id : BlueArchiveMusicIds) {
            translationBuilder.add(ModItems.BlueArchiveMusicDiscItems.get(id), "音乐唱片");
            translationBuilder.add(ModItems.BlueArchiveMusicDiscItems.get(id).getTranslationKey() + ".desc", get_desc(id));
            translationBuilder.add("sound.music.blue_archive_music." + id, "音乐: 播放");
        }
    }
}
