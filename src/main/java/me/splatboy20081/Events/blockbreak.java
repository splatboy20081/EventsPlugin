package me.splatboy20081.EventsPlugin.Events;

import org.bukkit.events.Listener;
import org.bukkit.events.BlockBreakEvent;
import org.bukkit.entity.Player;


public class blockbreak{
  public void onBlockBreak(BlockBreakEvent e){
    Player plr = e.getPlayer;
    if(plr.hasPermission("eventsplugin.breakblocks"){
      return true;
    }
    else{
      e.setCancelled(true);
      plr.sendMessage("You do not have the permission to break blocks."); //I know, a bit evil, right?
    }
  }
}
