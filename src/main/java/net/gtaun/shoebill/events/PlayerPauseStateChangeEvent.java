package net.gtaun.shoebill.events;

import net.gtaun.shoebill.event.player.PlayerEvent;
import net.gtaun.shoebill.object.Player;

/**
 * Created by marvin on 21.02.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class PlayerPauseStateChangeEvent extends PlayerEvent {

    private int pauseState;

    public PlayerPauseStateChangeEvent(Player player, int pauseState) {
        super(player);
        this.pauseState = pauseState;
    }

    public int getPauseState() {
        return pauseState;
    }
}
