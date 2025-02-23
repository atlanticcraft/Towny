package com.palmergames.bukkit.towny.multiblocks;

import com.palmergames.bukkit.towny.TownyTech;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Studies extends MultiBlockMachine {
    public Studies(Category category, SlimefunItemStack item) {
        super(category, item, new ItemStack[] {
				null, null, null,
				new ItemStack(Material.BOOKSHELF), null, new ItemStack(Material.BOOKSHELF),
                new ItemStack(Material.BOOKSHELF), new ItemStack(Material.LECTERN), new ItemStack(Material.BOOKSHELF)
        }, BlockFace.UP);
    }

    @Override
    public void onInteract(Player player, Block block) {
        player.sendMessage("Studies!");
    }
}