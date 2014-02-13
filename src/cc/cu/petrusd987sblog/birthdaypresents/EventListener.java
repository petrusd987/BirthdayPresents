package cc.cu.petrusd987sblog.birthdaypresents;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class EventListener implements Listener{
	
	private BirthdayPresents main = null;
	
	public EventListener(BirthdayPresents main) {
		this.main = main;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent joinEvent){
		Calendar cal = Calendar.getInstance();
		String currentDate = new SimpleDateFormat("M-dd-yyyy").format(cal.getTime());
		String playerBirthday = main.dsm.returnBirthday(joinEvent.getPlayer().getName());
		
		main.getLogger().info(joinEvent.getPlayer().getName());
		
		if(playerBirthday.equals(currentDate)){
			Player eventPlayer = joinEvent.getPlayer();
			Inventory playerInventory = eventPlayer.getInventory();
			
			// Give gift to player
			playerInventory.addItem(new ItemStack(Material.DIAMOND_SWORD));
			
			// Let everyone know
			Bukkit.broadcastMessage(ChatColor.YELLOW + "Happy birthday to " + eventPlayer.getName() + "!");
		}
	}
}
