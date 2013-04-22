package whitepanther.SRift;

import whitepanther.SRift.core.proxy.CommonProxy;
import whitepanther.SRift.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(
        modid= Reference.MOD_ID,
        name= Reference.MOD_NAME, 
        version= Reference.VERSION_NUMBER)

@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class StaticRift
{
    
    @Instance(Reference.MOD_ID)
    public static StaticRift instance;
    
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy; 
    
    
    @Init
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
    }
    
}
