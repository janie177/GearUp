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
    Shadow1(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "300", ChatColor.BLACK + "Helmet of Shadow", Lists.newArrayList(ChatColor.GRAY + "Shadow boost when wearing a full set", "Shadow")),
    Shadow2(new ItemStack(Material.DIAMOND_CHESTPLATE)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.BLACK + "ChestPlate of Shadow", Lists.newArrayList(ChatColor.GRAY + "Shadow boost when wearing a full set", "Shadow")),
    Shadow3(new ItemStack(Material.DIAMOND_LEGGINGS)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "380", ChatColor.BLACK + "Leggings of Shadow", Lists.newArrayList(ChatColor.GRAY + "Shadow boost when wearing a full set", "Shadow")),
    Shadow4(new ItemStack(Material.DIAMOND_BOOTS)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "280", ChatColor.BLACK + "Boots of Shadow", Lists.newArrayList(ChatColor.GRAY + "Shadow boost when wearing a full set", "Shadow")),
    Rainbow1(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "300", ChatColor.LIGHT_PURPLE + "Helmet of Rainbow", Lists.newArrayList(ChatColor.GRAY + "Rainbow boost when wearing a full set", "Rainbow")),
    Rainbow2(new ItemStack(Material.DIAMOND_CHESTPLATE)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.LIGHT_PURPLE + "ChestPlate of Rainbow", Lists.newArrayList(ChatColor.GRAY + "Rainbow boost when wearing a full set", "Rainbow")),
    Rainbow3(new ItemStack(Material.DIAMOND_LEGGINGS)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "380", ChatColor.LIGHT_PURPLE + "Leggings of Rainbow", Lists.newArrayList(ChatColor.GRAY + "Rainbow boost when wearing a full set", "Rainbow")),
    Rainbow4(new ItemStack(Material.DIAMOND_BOOTS)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "280", ChatColor.LIGHT_PURPLE + "Boots of Rainbow", Lists.newArrayList(ChatColor.GRAY + "Rainbow boost when wearing a full set", "Rainbow")),
    Nature1(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "300", ChatColor.GREEN + "Helmet of Nature", Lists.newArrayList(ChatColor.GRAY + "Nature boost when wearing a full set", "Nature")),
    Nature2(new ItemStack(Material.DIAMOND_CHESTPLATE)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.GREEN + "ChestPlate of Nature", Lists.newArrayList(ChatColor.GRAY + "Nature boost when wearing a full set", "Nature")),
    Nature3(new ItemStack(Material.DIAMOND_LEGGINGS)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "380", ChatColor.GREEN + "Leggings of Nature", Lists.newArrayList(ChatColor.GRAY + "Nature boost when wearing a full set", "Nature")),
    Nature4(new ItemStack(Material.DIAMOND_BOOTS)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "280", ChatColor.GREEN + "Boots of Nature", Lists.newArrayList(ChatColor.GRAY + "Nature boost when wearing a full set", "Nature")),
    Molten1(new ItemStack(Material.DIAMOND_HELMET)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "300", ChatColor.RED + "Helmet of Molten", Lists.newArrayList(ChatColor.GRAY + "Molten boost when wearing a full set", "Molten")),
    Molten2(new ItemStack(Material.DIAMOND_CHESTPLATE)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "400", ChatColor.RED + "ChestPlate of Molten", Lists.newArrayList(ChatColor.GRAY + "Molten boost when wearing a full set", "Molten")),
    Molten3(new ItemStack(Material.DIAMOND_LEGGINGS)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "380", ChatColor.RED + "Leggings of Molten", Lists.newArrayList(ChatColor.GRAY + "Molten boost when wearing a full set", "Molten")),
    Molten4(new ItemStack(Material.DIAMOND_BOOTS)
    {
        {
            addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        }
    }, "280", ChatColor.RED + "Boots of Molten", Lists.newArrayList(ChatColor.GRAY + "Molten boost when wearing a full set", "Molten"));

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
        List<String> lore = Lists.newArrayList(desc);
        ItemMeta meta = i.getItemMeta();
        if(lore.size() < 3)lore.add(ChatColor.GOLD + "Cost: " + ChatColor.AQUA + cost + ChatColor.GOLD + ".");
        if(lore.size() > 2)lore.set(2, ChatColor.GOLD + "Cost: " + ChatColor.AQUA + cost + ChatColor.GOLD + ".");
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