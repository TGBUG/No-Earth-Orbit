package TGBUG.no_Earth_Orbit;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class No_Earth_Orbit extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // 注册事件监听器
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerChangedWorld(PlayerChangedWorldEvent event) {
        Player player = event.getPlayer();
        World currentWorld = player.getWorld();
        World targetWorld = Bukkit.getWorld("world");

        if (currentWorld.getName().equals("world_galactifun_earth_orbit")) {
            // 设置目标位置
            Location targetLocation = new Location(targetWorld, 100, 60, 100);
            player.teleport(targetLocation);
        }
    }
}
