package betterlight.common;

import betterlight.utils.Color;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class LampBlock extends BlockContainer {

	private static String unlocalizedName = "lampBlock"; 
	
	public static int renderID; 
	
	private LampTileEntity tileEntity; 
	
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
	
	public Color getColor() {
		return this.tileEntity.color; 
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		this.tileEntity = new LampTileEntity();
		return this.tileEntity; 
	}

}
