package panszelescik.moreplates.items.calculator;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemTanzanitePlate extends Item {

	public ItemTanzanitePlate(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
	}
}