package betterlight.common;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = BetterLight.MODID, version = BetterLight.VERSION)
public class BetterLight {
    public static final String MODID = "betterlight";
    public static final String VERSION = "0.1";
    
    @SidedProxy(clientSide = "betterlight.client.BetterlightClientProxy", serverSide = "betterlight.common.BetterlightCommonProxy")
    public static BetterlightCommonProxy proxy; 
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	this.proxy.preinit(event); 
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	this.proxy.init(event); 
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
    	this.proxy.postinit(event);
    }
}
