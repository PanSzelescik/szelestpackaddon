package panszelescik.moreplates.items.mysticalagriculture;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemSupremiumPlate extends Item {

	public ItemSupremiumPlate(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
	}
}