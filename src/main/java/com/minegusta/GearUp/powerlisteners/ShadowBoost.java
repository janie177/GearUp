package com.minegusta.gearup.powerlisteners;


import com.minegusta.gearup.data.TempData;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ShadowBoost
{
    private Player p;

    public ShadowBoost(Player p)
    {
        this.p = p;
    }

    public boolean isDark()
    {
        return p.getLocation().getBlock().getLightLevel() < ((byte) 7);
    }

    public boolean isInMap()
    {
        return TempData.armourMap.containsKey(p.getUniqueId()) && TempData.armourMap.get(p.getUniqueId()).equalsIgnoreCase("Shadow");
    }

    public void boost()
    {
        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 4 ,1));
    }
}
