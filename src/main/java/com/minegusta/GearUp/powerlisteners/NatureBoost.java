package com.minegusta.gearup.powerlisteners;

import com.minegusta.gearup.data.TempData;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class NatureBoost
{
    private Player p;
    private Block b;
    private boolean isCancelled;

    public  NatureBoost(Player p)
    {
        this.p = p;
        this.b = p.getLocation().getBlock().getRelative(BlockFace.DOWN);
    }

    public NatureBoost(PlayerItemConsumeEvent e)
    {
        this.p = e.getPlayer();
        this.isCancelled = e.isCancelled();
    }

    //Methods

    public boolean isInMap()
    {
        return TempData.armourMap.containsKey(p.getUniqueId()) && TempData.armourMap.get(p.getUniqueId()).equalsIgnoreCase("Nature");
    }

    public boolean isDirt()
    {
        return b.getType().equals(Material.DIRT);
    }

    public void grassify()
    {
        b.setType(Material.GRASS);
        b.getWorld().spigot().playEffect(b.getLocation(), Effect.HAPPY_VILLAGER, 1, 1, 1, 0, 1, 1, 7, 10);
    }

    public boolean isEaten()
    {
        return !isCancelled;
    }

    public void setFood()
    {
        p.setFoodLevel(20);
    }

}
