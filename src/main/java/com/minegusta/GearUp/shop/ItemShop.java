package com.minegusta.gearup.shop;


import com.minegusta.gearup.files.Config;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ItemShop {

    private String invName;
    private InventoryClickEvent e;
    private Player entityPlayer;



    public ItemShop(InventoryClickEvent e)
    {
        invName = e.getInventory().getTitle();
        this.e = e;
        entityPlayer = (Player) e.getWhoClicked();
    }

    public boolean isShop()
    {
        if (invName != null && invName.equals("ShopKeeper's Inventory")) {
            if (!e.getCursor().getType().equals(Material.AIR))
            {
                e.setCancelled(true);
                entityPlayer.updateInventory();
                return false;
            }
            if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)
            {
                e.setCancelled(true);
                return false;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName() == null)
            {
                e.setCancelled(true);
                return false;
            }
            return true;
        }
        return false;
    }

    public void apply()
    {
        e.setCancelled(true);
        HumanEntity player = e.getWhoClicked();

        ItemStack theItemToAdd = null;
        int cost = 0;
        for (ShopEnum item : ShopEnum.values()) {
            if (!(item.shopItem().equals(e.getCurrentItem()))) continue;
            cost = item.getPoints();
            theItemToAdd = item.boughtItem();
            break;
        }

        if (theItemToAdd == null) return;

        Config config = new Config();

        int pointsPresent = config.getCredits(entityPlayer.getUniqueId());

        if (cost > pointsPresent) {
            entityPlayer.sendMessage(ChatColor.RED + "You do not have enough points to buy that item.");
            player.closeInventory();
            return;
        }

        if (player.getInventory().firstEmpty() == -1) {
            entityPlayer.sendMessage(ChatColor.RED + "You do not have enough space in your inventory.");
            player.closeInventory();
            return;
        }
        if(config.removeCredits(entityPlayer.getUniqueId(), cost)) {
            player.getInventory().addItem(theItemToAdd);
            entityPlayer.sendMessage(ChatColor.AQUA + "You have successfully bought an item!");
            player.closeInventory();
        }
    }
}
