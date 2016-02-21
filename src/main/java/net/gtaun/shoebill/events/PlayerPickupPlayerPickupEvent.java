package net.gtaun.shoebill.events;

import net.gtaun.shoebill.event.player.PlayerEvent;
import net.gtaun.shoebill.object.Player;

/**
 * Created by marvin on 21.02.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class PlayerPickupPlayerPickupEvent extends PlayerEvent {

    private int playerPickupId;

    public PlayerPickupPlayerPickupEvent(Player player, int playerPickupId) {
        super(player);
        this.playerPickupId = playerPickupId;
    }

    public int getPlayerPickupId() {
        return playerPickupId;
    }
}
