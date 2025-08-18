package cn.ncw.bluearchive.datagen;

import cn.ncw.bluearchive.BlueArchiveMusicMod;
import cn.ncw.bluearchive.base.CommonVariable;
import cn.ncw.bluearchive.item.ModItems;
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BlueArchiveMusicDiscItems.get(CommonVariable.BlueArchiveMusicNames.get(0)))
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .input('A', Items.BLUE_DYE)
                .input('B', Items.LIGHT_BLUE_DYE)
                .input('C', Items.AMETHYST_SHARD)
                .criterion("has_amethyst_shard", conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(consumer, new Identifier(BlueArchiveMusicMod.MOD_ID, "theme_01_recipe"));

        for (int i = 0; i < CommonVariable.BlueArchiveMusicNames.size(); i++) {
            int var;
            if (i == CommonVariable.BlueArchiveMusicNames.size() - 1) {
                var = 0;
            } else {
                var = i + 1;
            }
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BlueArchiveMusicDiscItems.get(CommonVariable.BlueArchiveMusicNames.get(var)))
                    .input(ModItems.BlueArchiveMusicDiscItems.get(CommonVariable.BlueArchiveMusicNames.get(i)))
                    .criterion("has_" + CommonVariable.BlueArchiveMusicNames.get(i), conditionsFromItem(ModItems.BlueArchiveMusicDiscItems.get(CommonVariable.BlueArchiveMusicNames.get(i))))
                    .offerTo(consumer, CommonVariable.BlueArchiveMusicNames.get(i) + "_to_" + CommonVariable.BlueArchiveMusicNames.get(var) + "_recipe");
        }
    }
}
