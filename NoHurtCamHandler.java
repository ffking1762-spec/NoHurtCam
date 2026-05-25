package com.example.nohurtcam;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class NoHurtCamHandler {

    @SubscribeEvent
    public void onRenderTick(TickEvent.RenderTickEvent event) {

        Minecraft mc = Minecraft.getMinecraft();

        if (mc.thePlayer == null)
            return;

        EntityPlayer player = mc.thePlayer;

        player.hurtTime = 0;
        player.maxHurtTime = 0;
        player.attackedAtYaw = 0.0F;
    }
}