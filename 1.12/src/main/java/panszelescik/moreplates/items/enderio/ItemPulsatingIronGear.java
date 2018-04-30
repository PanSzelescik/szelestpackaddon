package panszelescik.moreplates.items.enderio;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemPulsatingIronGear extends Item {

	public ItemPulsatingIronGear(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
	}
}