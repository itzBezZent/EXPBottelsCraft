package org.example.expbottlescraft;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemStack result = new ItemStack(Material.EXPERIENCE_BOTTLE, 8);
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "experience_bottle"), result);

        recipe.shape(" D ", "GCG", "   ");

        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('C', Material.GLASS_BOTTLE);
        recipe.setIngredient('G', Material.GOLD_INGOT);

        getServer().addRecipe(recipe);
    }

    @Override
    public void onDisable() {
        NamespacedKey key = new NamespacedKey(this, "experience_bottle");
        getServer().removeRecipe(key);
    }
}
