package cc.cu.petrusd987sblog.birthdaypresents;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class BirthdayPresents extends JavaPlugin {
	
	DataStorageManager dsm;
        ConfigManager confMan;
	
	public void onEnable(){
		dsm = new DataStorageManager();
                confMan = new ConfigManager(this);
                
                confMan.init();
                
		getServer().getPluginManager().registerEvents(new EventListener(this), this);
	}

	public void onDisable(){
	}
}
