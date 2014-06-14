package com.minegusta.gearup.powerlisteners;

import com.minegusta.gearup.Main;
import com.minegusta.gearup.data.TempData;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import java.util.concurrent.TimeUnit;

public class RainbowBoost
{
    private Player p;
    private boolean jump;
    private boolean crouch;

    public RainbowBoost(PlayerMoveEvent e)
    {
        p = e.getPlayer();
        jump = e.getFrom().getY() < e.getTo().getY();
        crouch = p.isSneaking();
    }

    public boolean isInMap()
    {
        return TempData.armourMap.containsKey(p.getUniqueId()) && TempData.armourMap.get(p.getUniqueId()).equalsIgnoreCase("Rainbow");
    }

    public boolean isCrouchJump()
    {
        return crouch && jump;
    }

    public boolean cooledDown()
    {
        if(TempData.sonicRainBoomMap.containsKey(p.getUniqueId()))
        {
            if(!(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - TempData.sonicRainBoomMap.get(p.getUniqueId())) > 15))
            {
                sendTimeRemaining(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - TempData.sonicRainBoomMap.get(p.getUniqueId())));
                return false;
            }
        }
        return true;
    }

    private void sendTimeRemaining(long time)
    {
        long remaining = 15 - time;
        p.sendMessage(ChatColor.RED + "You have to wait another " + remaining + " seconds before you can use SonicRainBoom!");
    }

    public void bOOM()
    {
        Vector v = p.getVelocity();
        v.setY(2.8);
        p.teleport(p.getLocation().add(0, 0.5, 0));
        p.setVelocity(v);
        p.setFallDistance(0F);
        TempData.sonicRainBoomMap.put(p.getUniqueId(), System.currentTimeMillis());
        p.sendMessage(ChatColor.LIGHT_PURPLE + "SONIC RAINBOOM!");
        TempData.fallMap.add(p.getUniqueId());

        //Particles
        final World world = p.getWorld();

        for (int i = 0; i < 20 * 5; i++)
        {
            Bukkit.getScheduler().scheduleSyncDelayedTask(Main.PLUGIN, new Runnable() {

                @Override
                public void run() {

                    world.spigot().playEffect(p.getLocation(), Effect.COLOURED_DUST, 1,1, 1, 1, 1, 1, 48, 30);
                }

            }, i);
        }
    }
}
