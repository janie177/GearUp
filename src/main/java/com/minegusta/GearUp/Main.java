package com.minegusta.gearup;

import com.minegusta.gearup.armourlistening.ArmourUnEquip;
import com.minegusta.mgcredits.commands.CreditCommand;
import com.minegusta.gearup.listeners.ShopListener;
import com.minegusta.gearup.tasks.BoostTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public static Plugin PLUGIN;
    private int boostTask, armourCheck;

	@Override
	public void onEnable()
    {
        //Plugin
        PLUGIN = this;


        //BoostTask
        boostTask = BoostTask.boostTask;

        //Armour Check
        armourCheck = ArmourUnEquip.armourUnquipCheck;

        //Events
        Bukkit.getPluginManager().registerEvents(new ShopListener(), this);

        //Commands
        getCommand("credits").setExecutor(new CreditCommand());
        getCommand("addcredits").setExecutor(new CreditCommand());
	}

	@Override
	public void onDisable()
	{
        //stop savetask
        Bukkit.getServer().getScheduler().cancelTask(boostTask);
        Bukkit.getServer().getScheduler().cancelTask(armourCheck);
	}
}
