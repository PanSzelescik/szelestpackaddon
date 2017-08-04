package panszelescik.moreplates;

import net.minecraftforge.fml.common.Loader;

public class ModChecker {

	public static boolean isBotaniaLoaded;
	public static boolean isDraconicEvolutionLoaded;
	public static boolean isEnderIOLoaded;
	public static boolean isImmersiveEngineeringLoaded;
	public static boolean isMekanismLoaded;
	public static boolean isMysticalAgradditionsLoaded;
	public static boolean isMysticalAgricultureLoaded;
	public static boolean isProjectRedLoaded;
	public static boolean isRefinedStorageLoaded;
	public static boolean isTinkersConstructLoaded;
	
	public ModChecker() {
		this.isBotaniaLoaded = Loader.isModLoaded("botania");
		this.isDraconicEvolutionLoaded = Loader.isModLoaded("draconicevolution");
		this.isEnderIOLoaded = Loader.isModLoaded("enderio");
		this.isImmersiveEngineeringLoaded = Loader.isModLoaded("immersiveengineering");
		this.isMekanismLoaded = Loader.isModLoaded("mekanism");
		this.isMysticalAgradditionsLoaded = Loader.isModLoaded("mysticalagradditions");
		this.isMysticalAgricultureLoaded = Loader.isModLoaded("mysticalagriculture");
		this.isProjectRedLoaded = Loader.isModLoaded("projectred-core");
		this.isRefinedStorageLoaded = Loader.isModLoaded("refinedstorage");
		this.isTinkersConstructLoaded = Loader.isModLoaded("tconstruct");
	}
	
	public static void printSuccessMessage() {
		if(isBotaniaLoaded) {
			MorePlates.logger.info("Botania has been detected. Loading integration...");
		}
		if(isDraconicEvolutionLoaded) {
			MorePlates.logger.info("Draconic Evolution has been detected. Loading integration...");
		}
		if(isEnderIOLoaded) {
			MorePlates.logger.info("Ender IO has been detected. Loading integration...");
		}
		if(isImmersiveEngineeringLoaded) {
			MorePlates.logger.info("Immersive Engineering has been detected. Loading integration...");
		}
		if(isMekanismLoaded) {
			MorePlates.logger.info("Mekanism has been detected. Loading integration...");
		}
		if(isMysticalAgradditionsLoaded) {
			MorePlates.logger.info("Mystical Agradditions has been detected. Loading integration...");
		}
		if(isMysticalAgricultureLoaded) {
			MorePlates.logger.info("Mystical Agriculture has been detected. Loading integration...");
		}
		if(isProjectRedLoaded) {
			MorePlates.logger.info("Project Red has been detected. Loading integration...");
		}
		if(isRefinedStorageLoaded) {
			MorePlates.logger.info("Refined Storage has been detected. Loading integration...");
		}
		if(isTinkersConstructLoaded) {
			MorePlates.logger.info("Tinkers' Construct has been detected. Loading integration...");
		}
	}
}
