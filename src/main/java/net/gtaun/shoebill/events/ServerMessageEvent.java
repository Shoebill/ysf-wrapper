package net.gtaun.shoebill.events;

import net.gtaun.util.event.Event;

/**
 * Created by marvin on 21.02.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class ServerMessageEvent extends Event {

    private String message;

    public ServerMessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
