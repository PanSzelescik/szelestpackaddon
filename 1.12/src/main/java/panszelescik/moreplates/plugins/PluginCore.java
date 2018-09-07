package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.helpers.IInit;
import panszelescik.moreplates.items.*;

public abstract class PluginCore extends Helper implements IInit {
	
	protected final String modid;
	protected final String modname;
	protected boolean enable;
	protected boolean error;
	
	public PluginCore(String modid, String modname) {
		this.modid = modid;
		this.modname = modname;
	}
	
	@Override
	public abstract boolean preInitPlugin();

	@Override
	public abstract boolean initPlugin();
	
	protected Item gear(String name) {
		return new ItemGear(name);
	}
	
	protected Item plate(String name) {
		return new ItemPlate(name);
	}
	
	protected Item stick(String name) {
		return new ItemStick(name);
	}
}