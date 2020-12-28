package xyz.tehbrian.nobedexplosions.listeners;

import org.bukkit.Tag;
import org.bukkit.block.Block;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import xyz.tehbrian.nobedexplosions.NoBedExplosions;

import java.util.Locale;
import java.util.Objects;
import java.util.logging.Logger;

public class BedListener implements Listener {

    private final NoBedExplosions main;

    public BedListener(NoBedExplosions main) {
        this.main = main;
    }

    @EventHandler
    public void onBedEnter(PlayerBedEnterEvent event) {
				Block bed = event.getBed();
				Player player = event.getPlayer();

				// Allow sleeping in the nether above the bedrock ceiling

				if (player.getWorld().getName().endsWith("_nether") && bed.getY() > 127) {
					event.setUseBed(Event.Result.ALLOW);
				}
			}
}
