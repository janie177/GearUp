package com.minegusta.gearup.powerlisteners;

import com.minegusta.gearup.data.TempData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class MoltenBoost
{
    private Entity entity;
    private EntityDamageEvent.DamageCause cause;
    private EntityDamageEvent e;

    public MoltenBoost(EntityDamageEvent e)
    {
        this.entity = e.getEntity();
        this.cause = e.getCause();
        this.e = e;
    }

    //Methods

    public boolean isPlayer()
    {
        return entity instanceof Player;
    }

    public boolean isLavaOrFire()
    {
        return cause.equals(EntityDamageEvent.DamageCause.LAVA) || cause.equals(EntityDamageEvent.DamageCause.FIRE) || cause.equals(EntityDamageEvent.DamageCause.FIRE_TICK);
    }

    public boolean isInMap()
    {
        return TempData.armourMap.containsKey(entity.getUniqueId()) && TempData.armourMap.get(entity.getUniqueId()).equalsIgnoreCase("Molten");
    }

    public void cancel()
    {
        e.setCancelled(true);
    }
}
