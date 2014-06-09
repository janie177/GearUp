package com.minegusta.gearup.tasks;


import com.minegusta.gearup.Main;
import com.minegusta.gearup.files.FileManager;
import org.bukkit.Bukkit;

public class SaveTask {

    public static int saveTask = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.PLUGIN, new Runnable() {
        @Override
        public void run() {
            FileManager.saveConfig();
        }
    }, 0, 20 * 120);

}

