package betterlight.common;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LampBlock extends Block {

	private static String unlocalizedName = "lampBlock"; 
	
	public static int renderID; 
	
	protected LampBlock() {
		super(Material.rock); 
		
		setBlockName(BetterLight.MODID + "_" + unlocalizedName);
		setCreativeTab(CreativeTabs.tabBlock); 
		setBlockTextureName(BetterLight.MODID + ":" + unlocalizedName); 
	}
	
	public int getLightValue() {
		return 15; 
	}
	
	public int getRenderType() {
		return LampBlock.renderID; 
	}

}
