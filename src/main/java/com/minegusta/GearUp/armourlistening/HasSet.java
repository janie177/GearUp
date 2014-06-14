package com.minegusta.gearup.armourlistening;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HasSet
{
    private Player p;
    private String armourName;
    private ItemStack item;

    public HasSet(Player p , String armourName, ItemStack item)
    {
        this.p = p;
        this.armourName = armourName;
        this.item = item;
    }

    public HasSet(Player p , String armourName)
    {
        this.p = p;
        this.armourName = armourName;
    }


    public boolean hasSet()
    {
        ItemStack[] armour = p.getInventory().getArmorContents();
        int maxMiss = 0;

        if(item.getType().equals(Material.AIR) || !item.getItemMeta().hasLore() || item.getItemMeta().getLore().size() <=1 || !(item.getItemMeta().getLore().get(1).equalsIgnoreCase(armourName)))
        {
            return false;
        }

        for(ItemStack is : armour)
        {
            if(is.getType().equals(Material.AIR) || !is.getItemMeta().hasLore() || is.getItemMeta().getLore().size() <=1 || !(is.getItemMeta().getLore().get(1).equalsIgnoreCase(armourName)))
            {
                maxMiss++;
                if(maxMiss > 1)return false;
            }
        }
        return true;
    }

    public boolean hasSetEquiped()
    {
        ItemStack[] armour = p.getInventory().getArmorContents();
        for(ItemStack is : armour)
        {
            if(is.getType().equals(Material.AIR) || !is.getItemMeta().hasLore() || is.getItemMeta().getLore().size() <=1 || !(is.getItemMeta().getLore().get(1).equalsIgnoreCase(armourName)))
            {
                return false;
            }
        }
        return true;
    }
}
