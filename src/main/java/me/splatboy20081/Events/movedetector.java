package me.splatboy20081.Eventsplugin.Events;

import org.bukkit.events.Listener;
import org.bukkit.entity.Player;
import org.bukkit.events.PlayerMoveEvent;

public class movedetector{ //I know this isn't the correct syntax.
  public void onPlayerMove(PlayerMoveEvent e){
    Player plr = e.getPlayer();
    if(!plr.hasPermission("eventsplugin.move"))
      e.setCancelled(true); //again, a bit evil...
   }
  }
}
