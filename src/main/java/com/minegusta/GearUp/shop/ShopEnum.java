package com.minegusta.gearup.shop;

import com.google.common.collect.Lists;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public enum ShopEnum
{
    I1(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I2(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I3(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I4(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I5(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I7(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I8(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I9(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I10(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I11(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I12(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I13(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I14(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I15(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I16(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I17(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.")),
    I18(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "Helmet of", Lists.newArrayList(ChatColor.GRAY + "Bonus when wearing a full set.", "ArmourType"));

    private ItemStack i;
    private String name;
    private List<String> desc;
    private String cost;

    private ShopEnum(ItemStack i, String cost, String name, List<String> desc)
    {
        this.i = i;
        this.name = name;
        this.desc = desc;
        this.cost = cost;
    }

    public ItemStack shopItem()
    {
        ItemMeta meta = i.getItemMeta();
        desc.add(ChatColor.GOLD + "Cost: " + ChatColor.AQUA + cost + ChatColor.GOLD + ".");
        meta.setLore(desc);
        meta.setDisplayName(name);
        i.setItemMeta(meta);

        return i;
    }

    public ItemStack boughtItem()
    {
        ItemMeta meta = i.getItemMeta();
        meta.setLore(desc);
        meta.setDisplayName(name);
        i.setItemMeta(meta);

        return i;
    }

    public int getPoints()
    {
        return Integer.parseInt(cost);
    }
}