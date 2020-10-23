package com.makerzip.push;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class ClickEvent implements Listener {
    private final Main plugin;

    public ClickEvent(Main instance) {
        plugin = instance;
    }
    @EventHandler
    public void onPlayerJoinEvent(org.bukkit.event.player.PlayerInteractEvent event){
        Player player = event.getPlayer();
        Action action = event.getAction();

        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            ItemStack is = player.getItemInHand().clone();
            if (player.getItemInHand().getType() == Material.WOODEN_SWORD) {
                Vector unitVector = new Vector(player.getLocation().getDirection().getX(),player.getLocation().getDirection().getY(),player.getLocation().getDirection().getZ());
                unitVector = unitVector.normalize();
                player.setVelocity(unitVector.multiply(1));
            }
            if (player.getItemInHand().getType() == Material.STONE_SWORD) {
                Vector unitVector = new Vector(player.getLocation().getDirection().getX(),player.getLocation().getDirection().getY(),player.getLocation().getDirection().getZ());
                unitVector = unitVector.normalize();
                player.setVelocity(unitVector.multiply(1));
            }
            if (player.getItemInHand().getType() == Material.GOLDEN_SWORD) {
                Vector unitVector = new Vector(player.getLocation().getDirection().getX(),player.getLocation().getDirection().getY(),player.getLocation().getDirection().getZ());
                unitVector = unitVector.normalize();
                player.setVelocity(unitVector.multiply(1));
            }
            if (player.getItemInHand().getType() == Material.IRON_SWORD) {
                Vector unitVector = new Vector(player.getLocation().getDirection().getX(),player.getLocation().getDirection().getY(),player.getLocation().getDirection().getZ());
                unitVector = unitVector.normalize();
                player.setVelocity(unitVector.multiply(1));
            }
            if (player.getItemInHand().getType() == Material.DIAMOND_SWORD) {
                Vector unitVector = new Vector(player.getLocation().getDirection().getX(),player.getLocation().getDirection().getY(),player.getLocation().getDirection().getZ());
                unitVector = unitVector.normalize();
                player.setVelocity(unitVector.multiply(1));
            }
            if (player.getItemInHand().getType() == Material.STICK) {
                Vector unitVector = new Vector(player.getLocation().getDirection().getX(),player.getLocation().getDirection().getY(),player.getLocation().getDirection().getZ());
                unitVector = unitVector.normalize();
                player.setVelocity(unitVector.multiply(1));
            }
        }
    }
}
