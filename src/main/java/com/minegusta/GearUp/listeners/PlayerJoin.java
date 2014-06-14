package com.minegusta.gearup.listeners;

import com.minegusta.gearup.armourlistening.ArmourEquip;
import com.minegusta.gearup.armourlistening.HasSet;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin
{

    public PlayerJoin(PlayerJoinEvent e)
    {
        ArmourEquip arm = new ArmourEquip(e);
        arm.setArmourName();

        HasSet isSet = new HasSet(arm.getEventPlayer(), arm.getArmourName());
        if(isSet.hasSetEquiped())
        {
            arm.addToMap();
        }
    }
}
