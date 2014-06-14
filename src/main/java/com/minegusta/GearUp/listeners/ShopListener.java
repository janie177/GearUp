package com.minegusta.gearup.listeners;

import com.minegusta.gearup.armourlistening.ArmourEquip;
import com.minegusta.gearup.powerlisteners.MoltenBoost;
import com.minegusta.gearup.powerlisteners.NatureBoost;
import com.minegusta.gearup.powerlisteners.RainbowBoost;
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
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
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

        MoltenBoost molten = new MoltenBoost(e);
        if(molten.isPlayer() && molten.isInMap() && molten.isLavaOrFire())
        {
            molten.cancel();
        }

        FallDamage fall = new FallDamage(e);
        if(fall.isInMap())
        {
            fall.cancel();
        }
    }

    @EventHandler
    public void buyItem(InventoryClickEvent e)
    {
        ItemShop shop = new ItemShop(e);
        if(shop.isShop())shop.apply();

        ArmourEquip armour = new ArmourEquip(e);
        if(armour.isSpecialArmour() && armour.isArmourEquip() && armour.hasSet())
        {
            armour.addToMap();
        }
    }

    @EventHandler
    public void armourInteract(PlayerInteractEvent e)
    {
        ArmourEquip armour = new ArmourEquip(e);
        if(armour.isSpecialArmour() && armour.hasSet())
        {
            armour.addToMap();
        }
    }

    @EventHandler
    public void onEating(PlayerItemConsumeEvent e)
    {
        NatureBoost boost = new NatureBoost(e);
        if(boost.isEaten() && boost.isInMap())
        {
            boost.setFood();
        }
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e)
    {
        RainbowBoost boost = new RainbowBoost(e);
        if(boost.isInMap() && boost.isCrouchJump() && boost.cooledDown())
        {
            boost.bOOM();
        }
    }
}
