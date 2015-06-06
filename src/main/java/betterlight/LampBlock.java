package betterlight;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LampBlock extends Block {

	private static String unlocalizedName = "lampBlock"; 
	
	protected LampBlock() {
		super(Material.rock); 
		
		setBlockName(BetterLight.MODID + "_" + unlocalizedName);
		setCreativeTab(CreativeTabs.tabBlock); 
		setBlockTextureName(BetterLight.MODID + ":" + unlocalizedName); 
	}

}
