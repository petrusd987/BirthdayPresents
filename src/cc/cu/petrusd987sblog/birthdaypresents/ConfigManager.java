package cc.cu.petrusd987sblog.birthdaypresents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petrusd987
 */
public class ConfigManager {
    BirthdayPresents bp = null;
    
    public ConfigManager(BirthdayPresents bp) {
        this.bp = bp;
    }
    
    
    public boolean init(){
       this.createConfig();
       
        return true;
    }
    
    private void createConfig(){
        bp.saveDefaultConfig();
    }
}