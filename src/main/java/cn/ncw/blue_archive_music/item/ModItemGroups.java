package cn.ncw.blue_archive_music.item;

import cn.ncw.blue_archive_music.BAMusic;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static cn.ncw.blue_archive_music.base.CommonVariable.BlueArchiveMusicIds;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> NCW_BA_MUSIC_GROUP = register("ba_music_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(BAMusic.MOD_ID, id));
    }

    public static void registerGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                NCW_BA_MUSIC_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, -1)
                        .displayName(Text.translatable("itemGroup.ba_music_group"))
                        .icon(() -> new ItemStack(Items.MUSIC_DISC_WAIT))
                        .entries((displayContext, entries) -> {
                            for (String id : BlueArchiveMusicIds) {
                                entries.add(ModItems.BlueArchiveMusicDiscItems.get(id));
                            }
                        })
                        .build()

        );
    }
}
