package com.minegusta.gearup.armourlistening;

import com.minegusta.gearup.data.TempData;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ArmourEquip
{
    private Player p;
    private ItemStack i;
    private String armourName;
    private ClickType clickType;

    public ArmourEquip(PlayerInteractEvent e)
    {
        this.p = e.getPlayer();
        this.i = e.getItem();
    }

    public ArmourEquip(InventoryClickEvent e)
    {
        this.p = (Player) e.getWhoClicked();
        this.i = e.getCurrentItem();
        this.clickType = e.getClick();
    }



    public boolean isShiftClick()
    {
        return clickType.equals(ClickType.SHIFT_LEFT);
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

    public String getArmourType()
    {
        return ArmourTypes.valueOf(i.getItemMeta().getLore().get(1).toUpperCase()).get();
    }


    public Boolean addToMap()
    {
        TempData.
    }
}
