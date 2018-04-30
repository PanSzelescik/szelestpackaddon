package panszelescik.moreplates.items.calculator;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemRedstonePlate extends Item {

	public ItemRedstonePlate(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
	}
}