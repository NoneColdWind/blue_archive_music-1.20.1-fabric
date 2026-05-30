package cn.ncw.blue_archive_music.datagen;

import cn.ncw.blue_archive_music.base.CommonVariable;
import cn.ncw.blue_archive_music.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        for (String music_name : CommonVariable.BlueArchiveMusicNames) {
            getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.BlueArchiveMusicDiscItems.get(music_name));
            getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.BlueArchiveMusicDiscItems.get(music_name));
        }

    }
}
