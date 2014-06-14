package com.minegusta.gearup.tasks;

import com.minegusta.gearup.Main;
import com.minegusta.gearup.data.TempData;
import com.minegusta.gearup.powerlisteners.NatureBoost;
import com.minegusta.gearup.powerlisteners.ShadowBoost;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.entity.Player;

import java.util.UUID;

public class BoostTask {

    public static int boostTask = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.PLUGIN, new Runnable() {
        @Override
        public void run()
        {
            for(UUID uuid : TempData.armourMap.keySet())
            {
                if(Bukkit.getOfflinePlayer(uuid) != null && Bukkit.getOfflinePlayer(uuid).isOnline())
                {
                    Player p = Bukkit.getPlayer(uuid);

                    if(TempData.armourMap.get(uuid).equalsIgnoreCase("Shadow"))
                    {
                        playEffect(p, Effect.SMALL_SMOKE);
                        ShadowBoost boost = new ShadowBoost(p);
                        if(boost.isDark())
                        {
                            boost.boost();
                        }
                    }
                    else if(TempData.armourMap.get(uuid).equalsIgnoreCase("Nature"))
                    {
                        playEffect(p, Effect.MAGIC_CRIT);
                        NatureBoost boost = new NatureBoost(p);
                        if(boost.isDirt())
                        {
                            boost.grassify();
                        }
                    }
                    else if(TempData.armourMap.get(uuid).equalsIgnoreCase("Molten"))
                    {
                        playEffect(p, Effect.LAVADRIP);

                    }
                    else if(TempData.armourMap.get(uuid).equalsIgnoreCase("Rainbow"))
                    {
                        playEffect(p, Effect.COLOURED_DUST);
                    }
                }
            }
        }
    }, 0, 20);


    private static void playEffect(Player p, Effect effect)
    {
        p.getWorld().spigot().playEffect(p.getLocation(), effect, 1, 1, 1, 1, 1, 1, 6, 10);
    }
}
