package net.gtaun.shoebill.events;

import net.gtaun.util.event.Event;

/**
 * Created by marvin on 21.02.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class RemoteRCONPacketEvent extends Event {
    private String ipaddr;
    private int port;
    private String password;
    private int success;
    private String command;

    public RemoteRCONPacketEvent(String ipaddr, int port, String password, int success, String command) {
        this.ipaddr = ipaddr;
        this.port = port;
        this.password = password;
        this.success = success;
        this.command = command;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public int getPort() {
        return port;
    }

    public String getPassword() {
        return password;
    }

    public int getSuccess() {
        return success;
    }

    public String getCommand() {
        return command;
    }
}
