package panszelescik.moreplates.plugins;

import cofh.thermalexpansion.util.managers.machine.CompactorManager;
import cofh.thermalexpansion.util.managers.machine.CompactorManager.Mode;
import panszelescik.moreplates.MorePlates;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginThermalExpansion {
	
	private static int energy = energyCompactor;

	public static void postInit() {
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2) {
			String id = AE2_MODID;	
			add(CERTUS_QUARTZ, CRYSTAL + CERTUS_QUARTZ);
			add(CERTUS_QUARTZ, PURE_CERTUS_QUARTZ_NAME, id, PURE_CERTUS_QUARTZ_META);
			add(FLUIX, CRYSTAL + FLUIX);
			add(FLUIX, CRYSTAL + PURE_FLUIX);
		}
		if (isBotaniaLoaded & loadBotania) {
			addGaia(GAIA_SPIRIT, GAIA_SPIRIT + "Ingot");
		}
		if (isCalculatorLoaded & loadCalculator) {
			String id = CALCULATOR_MODID;
			add(REDSTONE, REDSTONE_NAME, id);
			add(REINFORCED_IRON, REINFORCED_IRON_NAME, id);
		}
		if (isExtraUtilitiesLoaded & loadExtraUtilities) {
			String id = EXTRA_UTILITIES_MODID;
			add(DEMON, EXU2_NAME, id, DEMON_META);
			add(ENCHANTED, EXU2_NAME, id, ENCHANTED_META);
			add(EVIL_INFUSED_IRON, EXU2_NAME, id, EVIL_INFUSED_IRON_META);
		}
		if (isProjectELoaded & loadProjectE) {
			String id = PROJECTE_MODID;
			add(DARK_MATTER, DARK_MATTER_NAME, id, DARK_MATTER_META);
			add(RED_MATTER, RED_MATTER_NAME, id, RED_MATTER_META);
		}
		if (isRefinedStorageLoaded & loadRefinedStorage) {
			String id = REFINED_STORAGE_MODID;
			add(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_NAME, id);
		}
		if (isThaumcraftLoaded & loadThaumcraft) {
			String id = THAUMCRAFT_MODID;
			add(QUICKSILVER, "quicksilver");
		}
		if (oreNameExists(ITEM + SILICON)) {
			add(SILICON, ITEM + SILICON);
		}
	}
	private static void add(String output, String input) {
		CompactorManager.addRecipe(energy, getOre(input, 4), getOre(GEAR + output), Mode.GEAR);
		MorePlates.logger.debug(INFO_TE + getItemName(getOre(GEAR + output)) + INFO_3 + getItemName(getOre(input)) + " x4");
		CompactorManager.addRecipe(energy, getOre(input), getOre(PLATE + output), Mode.PLATE);
		MorePlates.logger.debug(INFO_TE + getItemName(getOre(PLATE + output)) + INFO_3 + getItemName(getOre(input)));
	}
	private static void add(String output, String input, String id) {
		CompactorManager.addRecipe(energy, getItemStack(id, input, 4), getOre(GEAR + output), Mode.GEAR);
		MorePlates.logger.debug(INFO_TE + getItemName(getOre(GEAR + output)) + INFO_3 + getItemName(getItemStack(id, input)) + " x4");
		CompactorManager.addRecipe(energy, getItemStack(id, input), getOre(PLATE + output), Mode.PLATE);
		MorePlates.logger.debug(INFO_TE + getItemName(getOre(PLATE + output)) + INFO_3 + getItemName(getItemStack(id, input)));
	}
	private static void add(String output, String input, String id, int meta) {
		CompactorManager.addRecipe(energy, getItemStack(id, input, 4, meta), getOre(GEAR + output), Mode.GEAR);
		MorePlates.logger.debug(INFO_TE + getItemName(getOre(GEAR + output)) + INFO_3 + getItemName(getItemStack(id, input, 1, meta)) + " x4");
		CompactorManager.addRecipe(energy, getItemStack(id, input, 1, meta), getOre(PLATE + output), Mode.PLATE);
		MorePlates.logger.debug(INFO_TE + getItemName(getOre(PLATE + output)) + INFO_3 + getItemName(getItemStack(id, input, 1, meta)));
	}
	//Special for Gaia Spirit Gear and Plate
	private static void addGaia(String output, String input) {
		CompactorManager.addRecipe(energy, getOre(input, 4), getOre(output + "Gear"), Mode.GEAR);
		MorePlates.logger.debug(INFO_TE + getItemName(getOre(output + "Gear")) + INFO_3 + getItemName(getOre(input)) + " x4");
		CompactorManager.addRecipe(energy, getOre(input), getOre(output + "Plate"), Mode.PLATE);
		MorePlates.logger.debug(INFO_TE + getItemName(getOre(output + "Plate")) + INFO_3 + getItemName(getOre(input)));
	}
}