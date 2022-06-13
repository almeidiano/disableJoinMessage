package me.almeidiano;

import me.almeidiano.events.PlayerJoin;
import me.almeidiano.events.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;

public final class disableJoinMessage extends JavaPlugin {
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);

    }

}



