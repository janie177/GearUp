package com.minegusta.gearup.armourlistening;

import com.minegusta.gearup.Main;
import com.minegusta.gearup.data.TempData;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

public class ArmourUnEquip
{

    private static void unequipCheck(ConcurrentMap<UUID, String> map)
    {
        for(UUID uuid : map.keySet())
        {
            if(Bukkit.getOfflinePlayer(uuid) != null && Bukkit.getOfflinePlayer(uuid).isOnline())
            {
                Player p = Bukkit.getPlayer(uuid);

                ItemStack[] armour = p.getInventory().getArmorContents();

                for(ItemStack is : armour)
                {
                    if(is.getType().equals(Material.AIR) || !is.getItemMeta().hasLore() || is.getItemMeta().getLore().size() <=1 || !(is.getItemMeta().getLore().get(1).equalsIgnoreCase(map.get(uuid))))
                    {
                        map.remove(uuid);
                    }
                }
            }
        }

    }

    //Task

    public static int armourUnquipCheck = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.PLUGIN, new Runnable() {
        @Override
        public void run()
        {
            unequipCheck(TempData.armourMap);
        }
    }, 0, 20 * 6);

}
