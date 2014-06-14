package com.minegusta.gearup.armourlistening;

import com.minegusta.gearup.data.TempData;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class ArmourEquip
{
    private Player p;
    private ItemStack i;
    private String armourName;
    private InventoryType.SlotType slot;
    private InventoryClickEvent e;
    private ClickType clickType;

    public ArmourEquip(PlayerInteractEvent e)
    {
        this.p = e.getPlayer();
        this.i = e.getPlayer().getItemInHand();
    }

    public ArmourEquip(InventoryClickEvent e)
    {
        this.e = e;
        this.p = (Player) e.getWhoClicked();
        this.i = e.getCursor();
        this.slot = e.getSlotType();
        this.clickType = e.getClick();
    }

    public ArmourEquip(PlayerJoinEvent e)
    {
        this.p = e.getPlayer();
    }

    public boolean isSpecialArmour()
    {
        if(!(i.getType().equals(Material.AIR)) && i.getItemMeta().hasLore() && i.getItemMeta().getLore().size() > 1)
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

    public void setArmourName()
    {
        ItemStack helmet = p.getInventory().getHelmet();
        if(helmet == null || helmet.getType().equals(Material.AIR) || !helmet.getItemMeta().hasLore() || !(helmet.getItemMeta().getLore().size() > 1))return;

        for(ArmourTypes a : ArmourTypes.values())
        {
            if (a.get().equalsIgnoreCase(p.getInventory().getHelmet().getItemMeta().getLore().get(1)))
            {
                armourName = a.get();
            }
        }
    }

    public boolean isArmourEquip()
    {
        return(slot.equals(InventoryType.SlotType.ARMOR) && !e.getCursor().getType().equals(Material.AIR));
    }

    public boolean isShift()
    {
        if((clickType.equals(ClickType.SHIFT_RIGHT) || clickType.equals(ClickType.SHIFT_LEFT)) && e.getCurrentItem() != null && !e.getCurrentItem().getType().equals(Material.AIR))
        {
            i = e.getCurrentItem();
            return true;
        }
        return false;
    }

    public void addToMap()
    {
        TempData.armourMap.put(p.getUniqueId(), armourName);
    }


    public Player getEventPlayer()
    {
        return p;
    }

    public String getArmourName()
    {
        return armourName;
    }

    public ItemStack getItemStack()
    {
        return this.i;
    }
}
