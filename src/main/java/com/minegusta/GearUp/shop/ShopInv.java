package com.minegusta.gearup.shop;

import com.minegusta.mgcredits.files.Config;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;

public class ShopInv {


    private String name;
    private LivingEntity villager;
    private PlayerInteractEntityEvent e;

    public ShopInv(PlayerInteractEntityEvent e) {
        this.e = e;

    }

    //Public

    public boolean isLivingEntity() {
        if (e.getRightClicked() instanceof LivingEntity && e.getRightClicked() instanceof Villager) {
            villager = (LivingEntity) e.getRightClicked();
            name = villager.getCustomName();
            return true;
        }
        return false;
    }

    public void openShop()
    {
        if (name != null)
        {
            Player p = e.getPlayer();

            if (name.contains("Donor Trader"))
            {
                if (!e.getPlayer().getItemInHand().getType().equals(Material.AIR))
                {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(ChatColor.RED + "You can only trade with an empty hand!");
                }
                else
                {
                    Config config = new Config();
                    int credits = config.getCredits(p.getUniqueId());
                    p.sendMessage(ChatColor.AQUA + "[Trader]" + ChatColor.GRAY + " You begin trading with the ShopKeeper.");
                    p.sendMessage(ChatColor.AQUA + "[Trader]" + ChatColor.GRAY + " You have " + ChatColor.LIGHT_PURPLE + credits + ChatColor.GRAY + " credits.");
                    e.setCancelled(true);
                    openInventoryOfTrader(e.getPlayer());


                }
            }
        }
    }

    //Private

    private void openInventoryOfTrader(Player user) {
        String title = "ShopKeeper's Inventory";
        Inventory inv = Bukkit.getServer().createInventory(null, 27, title);
        user.openInventory(inv);

        int count = 0;
        for (ShopEnum shopItem : ShopEnum.values()) {
            inv.setItem(count, shopItem.shopItem());
            count++;
        }
    }
}
