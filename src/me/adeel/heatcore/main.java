package me.adeel.heatcore;


import me.adeel.heatcore.events.join;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    public void onEnable() {
        getServer().getConsoleSender().sendMessage("[HeatCore] Enabled");
        getServer().getPluginManager().registerEvents(new join(), this);
    }

    public void onDisable() {
    }

}
