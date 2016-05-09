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
    }, "280", ChatColor.RED + "Boots of Molten", Lists.newArrayList(ChatColor.GRAY + "Molten boost when wearing a full set", "Molten")),
    Misc1(new ItemStack(Material.EXP_BOTTLE, 8), "12", ChatColor.GOLD + "Experience Bottle", Lists.newArrayList(ChatColor.GRAY + "Throw it on the ground!")),
    Misc2(new ItemStack(Material.GLOWSTONE_DUST, 64), "25", ChatColor.GOLD + "Glowstone Dust", Lists.newArrayList(ChatColor.GRAY + "Because potions.")),
    Misc3(new ItemStack(Material.DRAGON_EGG, 1), "300", ChatColor.GOLD + "Dragon Egg", Lists.newArrayList(ChatColor.GRAY + "Dragon fetus not included.")),

    Misc4(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Pig Spawner", Lists.newArrayList(ChatColor.GRAY + "Pig Spawner")),

    Misc5(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Blaze Spawner", Lists.newArrayList(ChatColor.GRAY + "Blaze Spawner")),

    Misc6(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Zombie Spawner", Lists.newArrayList(ChatColor.GRAY + "Zombie Spawner")),

    Misc7(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Skeleton Spawner", Lists.newArrayList(ChatColor.GRAY + "Skeleton Spawner")),
    Misc8(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Spider Spawner", Lists.newArrayList(ChatColor.GRAY + "Spider Spawner")),
    Misc9(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "CaveSpider Spawner", Lists.newArrayList(ChatColor.GRAY + "Cave_Spider Spawner")),
    Misc10(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Creeper Spawner", Lists.newArrayList(ChatColor.GRAY + "Creeper Spawner")),

    Misc11(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Ghast Spawner", Lists.newArrayList(ChatColor.GRAY + "Ghast Spawner")),

    Misc12(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Squid Spawner", Lists.newArrayList(ChatColor.GRAY + "Squid Spawner")),

    Misc13(new ItemStack(Material.GOLD_NUGGET, 1), "70", ChatColor.GOLD + "1 PerkPoint", Lists.newArrayList(ChatColor.GRAY + "Gain 1 point to spend on races")),

    Misc14(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Enderman Spawner", Lists.newArrayList(ChatColor.GRAY + "Enderman Spawner")),

    Misc15(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Giant Spawner", Lists.newArrayList(ChatColor.GRAY + "Giant Spawner")),

    Misc16(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Sheep Spawner", Lists.newArrayList(ChatColor.GRAY + "Sheep Spawner")),

    Misc17(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Snowman Spawner", Lists.newArrayList(ChatColor.GRAY + "Snowman Spawner")),

    Misc18(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "Witch Spawner", Lists.newArrayList(ChatColor.GRAY + "Witch Spawner")),

    Misc19(new ItemStack(Material.MOB_SPAWNER, 1), "300", ChatColor.GOLD + "SilverFish Spawner", Lists.newArrayList(ChatColor.GRAY + "SilverFish Spawner")),
    Misc20(new ItemStack(Material.GOLDEN_APPLE, 1, (short) 1), "250", ChatColor.GOLD + "GOD APPLE", Lists.newArrayList(ChatColor.GRAY + "Food for rich people."));

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
        lore.add(ChatColor.GOLD + "Cost: " + ChatColor.AQUA + cost + ChatColor.GOLD + ".");
        meta.setLore(lore);
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