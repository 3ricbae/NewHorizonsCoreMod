package com.dreammaster.loginhandler;

import com.dreammaster.config.CoreModConfig;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class LoginHandler
{
    @SuppressWarnings("unused")
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
    {
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "=================================================" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD + "Welcome to Gregtech: New Horizons " + EnumChatFormatting.GREEN + CoreModConfig.ModPackVersion));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE  + "The Quest Book has a shortcut key," ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE  + "check your keybindings to remove confilcts." ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Please report bugs here:" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "https://github.com/GTNewHorizons/GT-New-Horizons-Modpack/" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "Please bring comments to https://discord.gg/EXshrPV" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "==================================================" ));
    }
}
