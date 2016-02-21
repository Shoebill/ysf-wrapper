package net.gtaun.shoebill.events;

import net.gtaun.shoebill.event.player.PlayerEvent;
import net.gtaun.shoebill.object.Player;

/**
 * Created by marvin on 21.02.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class PlayerLeaveGangZoneEvent extends PlayerEvent {

    private int gangzone;

    public PlayerLeaveGangZoneEvent(Player player, int gangzone) {
        super(player);
        this.gangzone = gangzone;
    }

    public int getGangzone() {
        return gangzone;
    }
}
