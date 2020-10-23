package com.makerzip.push;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        initEvents();
    }

    public  void initEvents(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new ClickEvent(this), this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(cmd.getName().equalsIgnoreCase("push")){
                if(args.length == 0) {
                    sender.sendMessage(ChatColor.RED + "type command to execute");
                }
                else if(args[0].equalsIgnoreCase("info")) {
                    sender.sendMessage(ChatColor.GREEN + "Push Commands by MakerZip");
                }
                else if(isDouble(args[0])) {
                    if(args.length == 1) {
                        double tmp = Double.parseDouble(args[0]);
                        Vector unitVector = new Vector(player.getLocation().getDirection().getX(),player.getLocation().getDirection().getY(),player.getLocation().getDirection().getZ());
                        unitVector = unitVector.normalize();
                        player.setVelocity(unitVector.multiply(tmp));
                        sender.sendMessage(ChatColor.YELLOW + "Push Succes");
                    }
                }
            }
        }
        return  true;
    }
    boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
