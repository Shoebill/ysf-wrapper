package net.gtaun.shoebill.events;

import net.gtaun.shoebill.object.Player;

/**
 * Created by marvin on 21.02.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class PlayerLeavePlayerGangZoneEvent extends PlayerLeaveGangZoneEvent {
    public PlayerLeavePlayerGangZoneEvent(Player player, int gangzone) {
        super(player, gangzone);
    }
}
