package cn.ncw.blue_archive_music.datagen;

import cn.ncw.blue_archive_music.BAMusic;
import cn.ncw.blue_archive_music.base.CommonVariable;
import cn.ncw.blue_archive_music.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BlueArchiveMusicDiscItems.get(CommonVariable.BlueArchiveMusicIds.get(0)))
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .input('A', Items.BLUE_DYE)
                .input('B', Items.LIGHT_BLUE_DYE)
                .input('C', Items.AMETHYST_SHARD)
                .criterion("has_amethyst_shard", conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(consumer, new Identifier(BAMusic.MOD_ID, "theme_01_recipe"));

        for (int i = 0; i < CommonVariable.BlueArchiveMusicIds.size(); i++) {
            int var;
            if (i == CommonVariable.BlueArchiveMusicIds.size() - 1) {
                var = 0;
            } else {
                var = i + 1;
            }
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BlueArchiveMusicDiscItems.get(CommonVariable.BlueArchiveMusicIds.get(var)))
                    .input(ModItems.BlueArchiveMusicDiscItems.get(CommonVariable.BlueArchiveMusicIds.get(i)))
                    .criterion("has_" + CommonVariable.BlueArchiveMusicIds.get(i), conditionsFromItem(ModItems.BlueArchiveMusicDiscItems.get(CommonVariable.BlueArchiveMusicIds.get(i))))
                    .offerTo(consumer, CommonVariable.BlueArchiveMusicIds.get(i) + "_to_" + CommonVariable.BlueArchiveMusicIds.get(var) + "_recipe");
        }
    }
}
