package com.minegusta.gearup.armourlistening;

import com.minegusta.gearup.data.TempData;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ArmourEquip
{
    private Player p;
    private ItemStack i;
    private String armourName;
    InventoryType.SlotType slot;

    public ArmourEquip(PlayerInteractEvent e)
    {
        this.p = e.getPlayer();
        this.i = e.getItem();
    }

    public ArmourEquip(InventoryClickEvent e)
    {
        this.p = (Player) e.getWhoClicked();
        this.i = e.getCurrentItem();
        this.slot = e.getSlotType();
    }



    public boolean isSpecialArmour()
    {
        if(i.getItemMeta().hasLore() && i.getItemMeta().getLore().size() > 1)
        {
            for(ArmourTypes a : ArmourTypes.values())
            {
                if(a.get().equalsIgnoreCase(i.getItemMeta().getLore().get(1)))
                {
                    armourName = a.get();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasSet()
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

    public boolean isArmourEquip()
    {
        return slot.equals(InventoryType.SlotType.ARMOR);
    }


    public void addToMap()
    {
        TempData.armourMap.put(p.getUniqueId(), armourName);
    }
}
