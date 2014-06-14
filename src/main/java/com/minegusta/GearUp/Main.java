package com.minegusta.gearup;

import com.minegusta.gearup.armourlistening.ArmourUnEquip;
import com.minegusta.gearup.commands.CreditCommand;
import com.minegusta.gearup.files.FileManager;
import com.minegusta.gearup.listeners.ShopListener;
import com.minegusta.gearup.tasks.BoostTask;
import com.minegusta.gearup.tasks.SaveTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public static Plugin PLUGIN;
    private int saveTask, boostTask, armourCheck;

	@Override
	public void onEnable()
    {
        //SaveTask
        saveTask = SaveTask.saveTask;

        //BoostTask
        boostTask = BoostTask.boostTask;

        //Armour Check
        armourCheck = ArmourUnEquip.armourUnquipCheck;

        //Plugin
        PLUGIN = this;

        //Config
        FileManager.loadConfig();

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
        Bukkit.getServer().getScheduler().cancelTask(saveTask);
        Bukkit.getServer().getScheduler().cancelTask(boostTask);
        Bukkit.getServer().getScheduler().cancelTask(armourCheck);

        //Save config
        FileManager.saveConfig();

	}
}
