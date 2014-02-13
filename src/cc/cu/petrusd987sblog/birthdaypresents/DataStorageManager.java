package cc.cu.petrusd987sblog.birthdaypresents;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.bukkit.entity.Player;

public class DataStorageManager {
	// Storage Types
	public final static byte FLATFILE = 0;
	public final static byte SQLITE = 1;
	public final static byte MYSQL = 2;
	
	// Variables
	public static byte StorageType = FLATFILE;
	
	// TODO: Implement this
	public static void storeBirthday(String username, Date d){
		try{
			switch(StorageType){
			case FLATFILE:
				break;
			case SQLITE:
				throw new Exception("SQLite is not implemented!");
			case MYSQL:
				throw new Exception("MySQL is not implemented!");
			}
		}catch(Exception e){
			
		}
	}
	
	// TODO: Placeholder code
	public static String returnBirthday(String name){
		Calendar cal = Calendar.getInstance();
		
		Date birthdate = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M-dd-yyyy");
		
		return sdf.format(birthdate);
	}
	
	// Write functions
	private void writeEntryToFlatFile(Player ply, String birthday){
		
	}
}