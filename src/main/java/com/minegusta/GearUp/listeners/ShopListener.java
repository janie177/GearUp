package com.minegusta.gearup.listeners;

import com.minegusta.gearup.shop.ItemShop;
import com.minegusta.gearup.shop.ShopInv;
import com.minegusta.gearup.shop.ShopOwnerDamageEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ShopListener implements Listener {

    @EventHandler
    public void onShopInteract(PlayerInteractEntityEvent e)
    {
        ShopInv inv = new ShopInv(e);
        if(inv.isLivingEntity())
        {
            inv.openShop();
        }

    }

    @EventHandler
    public void ShopOwnerDamageEvent(EntityDamageByEntityEvent e)
    {
        ShopOwnerDamageEvent shopOwnerDamageEvent = new ShopOwnerDamageEvent(e);
        if(shopOwnerDamageEvent.isVillager() && shopOwnerDamageEvent.isShopOwner())
        {
            shopOwnerDamageEvent.cancel();
        }

    }

    @EventHandler
    public void ShopOwnerDamageEvent(EntityDamageByBlockEvent e)
    {
        ShopOwnerDamageEvent shopOwnerDamageEvent = new ShopOwnerDamageEvent(e);
        if(shopOwnerDamageEvent.isVillager() && shopOwnerDamageEvent.isShopOwner())
        {
            shopOwnerDamageEvent.cancel();
        }
    }

    @EventHandler
    public void ShopOwnerDamageEvent(EntityDamageEvent e)
    {
        ShopOwnerDamageEvent shopOwnerDamageEvent = new ShopOwnerDamageEvent(e);
        if(shopOwnerDamageEvent.isVillager() && shopOwnerDamageEvent.isShopOwner())
        {
            shopOwnerDamageEvent.cancel();
        }
    }

    @EventHandler
    public void buyItem(InventoryClickEvent e)
    {
        ItemShop shop = new ItemShop(e);
        if(shop.isShop())shop.apply();
    }
}
