package cn.ncw.bluearchive.datagen;

import cn.ncw.bluearchive.base.CommonVariable;
import cn.ncw.bluearchive.item.ModItems;
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
        }

    }
}
