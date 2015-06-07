package betterlight.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class LampBlockRenderer implements ISimpleBlockRenderingHandler {

	private static int quads[][][] = {
		{
			{0, 1, 1}, 	
			{1, 1, 1}, 	
			{1, 1, 0},  	
			{0, 1, 0}
		},
		{ 		
			{0, 0, 0},
			{1, 0, 0},  
			{1, 0, 1}, 	
			{0, 0, 1}
		},
		{
			{0, 0, 1},
			{1, 0, 1},  
			{1, 1, 1}, 	
			{0, 1, 1}
		},
		{
			{0, 1, 0}, 	
			{1, 1, 0}, 	
			{1, 0, 0},  	
			{0, 0, 0}
		},
		{
			{0, 1, 1}, 	
			{0, 1, 0}, 	
			{0, 0, 0},  	
			{0, 0, 1}
		},
		{
			{1, 0, 1},
			{1, 0, 0},  
			{1, 1, 0}, 	
			{1, 1, 1}
		}
	}; 
	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		Tessellator tessellator = Tessellator.instance;
		IIcon c = block.getIcon(0, 0); 
		
		float u = c.getMinU(); 
		float v = c.getMinV(); 
		float U = c.getMaxU(); 
		float V = c.getMaxV(); 
		
		tessellator.addTranslation(x, y, z);
		
		tessellator.setColorOpaque_F(0, 0, 0.5f);
		
		for (int i=0; i<quads.length; i++) {
			tessellator.addVertexWithUV(quads[i][0][0], quads[i][0][1], quads[i][0][2], u, V);
			tessellator.addVertexWithUV(quads[i][1][0], quads[i][1][1], quads[i][1][2], U, V);
			tessellator.addVertexWithUV(quads[i][2][0], quads[i][2][1], quads[i][2][2], U, v);
			tessellator.addVertexWithUV(quads[i][3][0], quads[i][3][1], quads[i][3][2], u, v);
		}
		
		tessellator.addTranslation(-x, -y, -z);
		
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRenderId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
