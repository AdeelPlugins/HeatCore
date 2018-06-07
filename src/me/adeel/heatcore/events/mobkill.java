package me.adeel.heatcore.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;


public class mobkill implements Listener {

    @EventHandler
    public void onKill (EntityDeathEvent e) {
        org.bukkit.entity.Entity killer = e.getEntity().getKiller();
        if (killer instanceof Player){
            resetTimer.mk++;
        }
    }
}
