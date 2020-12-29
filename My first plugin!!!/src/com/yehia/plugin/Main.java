package com.yehia.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandExecutor;

public class Main extends JavaPlugin  {
	
	@Override
	public void onEnable() {
		System.out.println("plugin enabled :) ");
		getCommand("heal").setExecutor(new HealCommand () );
		getCommand("time").setExecutor(new TimeCommand () );
		
	}

		}
	 
	
	
	
	

    
	
				
				
		
			
			
			
		
		
		

	
 
	
	


		
	


