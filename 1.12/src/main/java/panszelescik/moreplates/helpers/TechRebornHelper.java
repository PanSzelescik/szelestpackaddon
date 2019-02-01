package panszelescik.moreplates.helpers;

import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.Config;
import reborncore.api.recipe.RecipeHandler;
import techreborn.api.recipe.machines.CompressorRecipe;

import static panszelescik.moreplates.helpers.ItemInfo.Type.*;

public class TechRebornHelper extends PluginHelper {

    public static int CompressorRecipes = 0;

    public static void add(String output, String input, boolean plate) {
        if (oreNameExists(input) && plate && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Compressor recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(input));
            RecipeHandler.addRecipe(new CompressorRecipe(input, get(PLATE + output), timeCompressor(), energyCompressor()));

            CompressorRecipes += 1;
        }
    }

    public static void add(String output, String input) {
        if (oreNameExists(input) && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Compressor recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(input));
            RecipeHandler.addRecipe(new CompressorRecipe(input, get(PLATE + output), timeCompressor(), energyCompressor()));

            CompressorRecipes += 1;
        }
    }

    public static void add(String output, String input, String id, int meta) {
        if (notNull(id, input, meta)) {
            MorePlates.logger.debug("Adding Compressor recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(id, input, 1, meta));
            RecipeHandler.addRecipe(new CompressorRecipe(get(id, input, 1, meta), get(PLATE + output), timeCompressor(), energyCompressor()));

            CompressorRecipes += 1;
        }
    }

    public static void addBlock(String name, int amount, boolean plate) {
        if (oreNameExists(BLOCK + name) && plate && oreNameExists(PLATE + name)) {
            MorePlates.logger.debug("Adding Compressor recipe for: " + getItemName(PLATE + name) + " x" + amount + " from: " + getItemName(BLOCK + name));
            RecipeHandler.addRecipe(new CompressorRecipe(BLOCK + name, get(PLATE + name, amount), timeCompressor(), energyCompressor()));

            CompressorRecipes += 1;
        }
    }

    public static void addBlock(String name, int amount) {
        if (oreNameExists(BLOCK + name) && oreNameExists(PLATE + name)) {
            MorePlates.logger.debug("Adding Compressor recipe for: " + getItemName(PLATE + name) + " x" + amount + " from: " + getItemName(BLOCK + name));
            RecipeHandler.addRecipe(new CompressorRecipe(BLOCK + name, get(PLATE + name, amount), timeCompressor(), energyCompressor()));

            CompressorRecipes += 1;
        }
    }

    public static void addBlock(String output, String input, int amount, String id) {
        if (notNull(id, input) && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Compressor recipe for: " + getItemName(PLATE + output) + " x" + amount + " from: " + getItemName(id, input));
            RecipeHandler.addRecipe(new CompressorRecipe(get(id, input), get(PLATE + output, amount), timeCompressor(), energyCompressor()));

            CompressorRecipes += 1;
        }
    }

    public static void addBlock(String output, String input, int amount, String id, int meta) {
        if (notNull(id, input, meta) && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Compressor recipe for: " + getItemName(PLATE + output) + " x" + amount + " from: " + getItemName(id, input, 1, meta));
            RecipeHandler.addRecipe(new CompressorRecipe(get(id, input, 1, meta), get(PLATE + output, amount), timeCompressor(), energyCompressor()));

            CompressorRecipes += 1;
        }
    }

    private static int energyCompressor() {
        return MorePlates.config.getInt("Energy in Compressor", Config.CATEGORY_TECHREBORN, 4, "Energy used to make some Plates in Compressor (in EU/t)");
    }

    private static int timeCompressor() {
        return MorePlates.config.getInt("Time in Compressor", Config.CATEGORY_TECHREBORN, 300, "Time in ticks to craft some Plates in Compressor");
    }
}