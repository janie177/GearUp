package com.minegusta.gearup.files;

import com.minegusta.gearup.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class FileManager {

    private static Plugin plugin = Main.PLUGIN;

    public static FileConfiguration getConfig()
    {
        return plugin.getConfig();

    }

    public static void loadConfig()
    {
        plugin.saveDefaultConfig();
    }

    public static void saveConfig()
    {
        plugin.saveConfig();
    }

}
