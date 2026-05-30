package cn.ncw.blue_archive_music.datagen;

import cn.ncw.blue_archive_music.base.CommonVariable;
import cn.ncw.blue_archive_music.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        for (String music_name : CommonVariable.BlueArchiveMusicNames) {
            itemModelGenerator.register(ModItems.BlueArchiveMusicDiscItems.get(music_name), Models.GENERATED);
        }

    }
}
