package testplug.testplug;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info(ChatColor.GREEN + "Enabled " + this.getName());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
