package betterlight.common;

import betterlight.utils.Color;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class LampTileEntity extends TileEntity {
	
	private static final String NBT_TAG_LAMP_COLOR = "lampColor";
	
	private static final Color DEFAULT_COLOR = Color.white; // Use white as the default color
	
	public Color color; 
	
	public LampTileEntity() {
		super();
		this.color = LampTileEntity.DEFAULT_COLOR; 
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTagCompound) {
		this.color = new Color(nbtTagCompound.getInteger(NBT_TAG_LAMP_COLOR)); 
		super.readFromNBT(nbtTagCompound);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTagCompound) {
		nbtTagCompound.setInteger(NBT_TAG_LAMP_COLOR, this.color.toInteger());
		super.writeToNBT(nbtTagCompound);
	}
	
}
