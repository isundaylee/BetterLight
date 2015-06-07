package betterlight.common;

import net.minecraft.block.Block;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class BetterlightCommonProxy {    
    public static Block lampBlock; 
    
    public void preinit(FMLPreInitializationEvent event) {
    	lampBlock = new LampBlock(); 
    	
    	GameRegistry.registerBlock(lampBlock, "lampBlock"); 
    }
    
    public void init(FMLInitializationEvent event) {
    	
    }
    
    public void postinit(FMLPostInitializationEvent event) {
    	
    }
}
