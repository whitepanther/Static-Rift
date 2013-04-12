package com.whitepanther.SRift;


import com.whitepanther.SRift.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(
        modid= Reference.MOD_ID,
        name= Reference.MOD_NAME, 
        version= Reference.VERSION_NUMBER)

@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class StaticRift
{

    
    @Init
    public void load(FMLInitializationEvent event)
    {
        
    }
    
}
