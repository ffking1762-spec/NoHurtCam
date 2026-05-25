package com.example.nohurtcam;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "nohurtcam", name = "No Hurt Cam", version = "1.0")
public class NoHurtCam {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        MinecraftForge.EVENT_BUS.register(new NoHurtCamHandler());
    }
}