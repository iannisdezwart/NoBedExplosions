package xyz.tehbrian.nobedexplosions;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.tehbrian.nobedexplosions.listeners.BedListener;

public final class NoBedExplosions extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new BedListener(this), this);
    }
}
