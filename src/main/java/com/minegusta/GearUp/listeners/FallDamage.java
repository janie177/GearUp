package com.minegusta.gearup.listeners;

import com.minegusta.gearup.data.TempData;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent;

public class FallDamage
{
    private Entity entity;
    private EntityDamageEvent.DamageCause cause;
    private EntityDamageEvent e;

    public FallDamage(EntityDamageEvent e)
    {
        entity = e.getEntity();
        cause = e.getCause();
        this.e = e;
    }

    public boolean isInMap()
    {
        return TempData.fallMap.contains(entity.getUniqueId());
    }

    public boolean isFallDamage()
    {
        return cause.equals(EntityDamageEvent.DamageCause.FALL);
    }

    public void cancel()
    {
        TempData.fallMap.remove(entity.getUniqueId());
        e.setCancelled(true);
    }
}
