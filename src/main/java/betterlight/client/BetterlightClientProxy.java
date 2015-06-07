package betterlight.client;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import betterlight.common.BetterlightCommonProxy;
import betterlight.common.LampBlock;

public class BetterlightClientProxy extends BetterlightCommonProxy {
	
	@Override
    public void postinit(FMLPostInitializationEvent event) {
		LampBlock.renderID = RenderingRegistry.getNextAvailableRenderId(); 
		
		RenderingRegistry.registerBlockHandler(LampBlock.renderID, new LampBlockRenderer());
    }
}
