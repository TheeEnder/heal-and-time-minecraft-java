package com.yehia.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TimeCommand implements CommandExecutor{
    
	@Override
	public boolean onCommand(CommandSender sender , Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		long playertime ;
		playertime = player.getPlayerTime();
		player.sendMessage("Hmmmm it says the time is " + playertime);
		
		
		return false;
		
	}
	

}
