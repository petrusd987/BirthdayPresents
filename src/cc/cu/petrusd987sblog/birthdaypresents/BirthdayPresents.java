package cc.cu.petrusd987sblog.birthdaypresents;

import org.bukkit.plugin.java.JavaPlugin;

public final class BirthdayPresents extends JavaPlugin {
	
	DataStorageManager dsm;
	
	public void onEnable(){
		getLogger().info("Now starting Birthday Presents!");
		
		dsm = new DataStorageManager();
		getServer().getPluginManager().registerEvents(new EventListener(this), this);
	}
	
	public void onDisable(){
		getLogger().info("Birthday Presents now disabled!");
	}
}
