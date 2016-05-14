package com.minegusta.gearup;

import com.minegusta.gearup.armourlistening.ArmourUnEquip;
import com.minegusta.gearup.listeners.ShopListener;
import com.minegusta.gearup.tasks.BoostTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public static Plugin PLUGIN;
	@Override
	public void onEnable()
    {
        //Plugin
        PLUGIN = this;


        //BoostTask
        BoostTask.start();

        //Armour Check
        ArmourUnEquip.start();

        //Events
        Bukkit.getPluginManager().registerEvents(new ShopListener(), this);
	}

	@Override
	public void onDisable()
	{
        //stop savetask
        ArmourUnEquip.stop();
        BoostTask.stop();
	}
}
