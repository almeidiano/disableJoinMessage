package me.almeidiano.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {
    @EventHandler
    void onPlayerJoin(PlayerQuitEvent e){
        Player player = e.getPlayer();

        e.setQuitMessage("");
    }

}
