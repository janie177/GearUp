package com.minegusta.gearup.shop;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Villager;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class ShopOwnerDamageEvent {

    private EntityDamageEvent entityDamageEvent;
    private EntityDamageByEntityEvent entityDamageByEntityEvent;
    private EntityDamageByBlockEvent entityDamageByBlockEvent;
    private Entity entity;
    private Villager villager;

    public ShopOwnerDamageEvent(EntityDamageByBlockEvent e)
    {
        this.entityDamageByBlockEvent = e;
        entity = e.getEntity();

    }

    public ShopOwnerDamageEvent(EntityDamageByEntityEvent e)
    {
        this.entityDamageByEntityEvent = e;
        entity = e.getEntity();

    }

    public ShopOwnerDamageEvent(EntityDamageEvent e)
    {
        this.entityDamageEvent = e;
        entity = e.getEntity();

    }

    //public

    public boolean isVillager()
    {
        if(entity instanceof Villager)
        {
            villager = (Villager) entity;
            return true;
        }
        return false;
    }

    public boolean isShopOwner()
    {
        return villager.getCustomName() != null && villager.getCustomName().toLowerCase().contains("donor trader");
    }

    public void cancel()
    {
        if(entityDamageEvent != null) entityDamageEvent.setCancelled(true);
        if(entityDamageByEntityEvent != null) entityDamageByEntityEvent.setCancelled(true);
        if(entityDamageByBlockEvent != null) entityDamageByBlockEvent.setCancelled(true);
    }


}
