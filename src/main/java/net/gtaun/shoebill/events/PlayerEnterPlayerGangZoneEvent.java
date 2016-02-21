package net.gtaun.shoebill.events;

import net.gtaun.shoebill.object.Player;

/**
 * Created by marvin on 21.02.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class PlayerEnterPlayerGangZoneEvent extends PlayerEnterGangZoneEvent {
    public PlayerEnterPlayerGangZoneEvent(Player player, int zone) {
        super(player, zone);
    }
}
