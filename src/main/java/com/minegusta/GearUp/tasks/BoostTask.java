package com.minegusta.gearup.tasks;

import com.minegusta.gearup.Main;
import org.bukkit.Bukkit;

public class BoostTask {

    public static int boostTask = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.PLUGIN, new Runnable() {
        @Override
        public void run() {

        }
    }, 0, 20);
}
