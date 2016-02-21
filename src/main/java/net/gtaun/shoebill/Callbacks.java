package net.gtaun.shoebill;

import net.gtaun.shoebill.amx.AmxInstanceManager;
import net.gtaun.shoebill.events.*;
import net.gtaun.shoebill.object.Player;
import net.gtaun.util.event.EventManager;

public class Callbacks {

    public static void registerHandlers(AmxInstanceManager instanceManager, EventManager eventManager) {
        instanceManager.hookCallback("OnPlayerEnterGangZone", amxCallEvent -> {
            Player player = Player.get((int) amxCallEvent.getParameters()[0]);
            int zoneid = (int) amxCallEvent.getParameters()[1];

            PlayerEnterGangZoneEvent enterGangZoneEvent = new PlayerEnterGangZoneEvent(player, zoneid);
            eventManager.dispatchEvent(enterGangZoneEvent, player, zoneid);
        }, "ii");

        instanceManager.hookCallback("OnPlayerLeaveGangZone", amxCallEvent -> {
            Player player = Player.get((int) amxCallEvent.getParameters()[0]);
            int zoneid = (int) amxCallEvent.getParameters()[1];

            PlayerLeaveGangZoneEvent leaveGangZoneEvent = new PlayerLeaveGangZoneEvent(player, zoneid);
            eventManager.dispatchEvent(leaveGangZoneEvent, player, zoneid);
        }, "ii");

        instanceManager.hookCallback("OnPlayerEnterPlayerGangZone", amxCallEvent -> {
            Player player = Player.get((int) amxCallEvent.getParameters()[0]);
            int zoneid = (int) amxCallEvent.getParameters()[1];

            PlayerEnterPlayerGangZoneEvent enterPlayerGangZoneEvent = new PlayerEnterPlayerGangZoneEvent(player, zoneid);
            eventManager.dispatchEvent(enterPlayerGangZoneEvent, player, zoneid);
        }, "ii");

        instanceManager.hookCallback("OnPlayerLeavePlayerGangZone", amxCallEvent -> {
            Player player = Player.get((int) amxCallEvent.getParameters()[0]);
            int zoneid = (int) amxCallEvent.getParameters()[1];

            PlayerLeavePlayerGangZoneEvent leavePlayerGangZoneEvent = new PlayerLeavePlayerGangZoneEvent(player, zoneid);
            eventManager.dispatchEvent(leavePlayerGangZoneEvent, player, zoneid);
        }, "ii");

        instanceManager.hookCallback("OnPlayerPickUpPlayerPickup", amxCallEvent -> {
            Player player = Player.get((int) amxCallEvent.getParameters()[0]);
            int pickupid = (int) amxCallEvent.getParameters()[1];

            PlayerPickupPlayerPickupEvent pickupPlayerPickupEvent = new PlayerPickupPlayerPickupEvent(player, pickupid);
            eventManager.dispatchEvent(pickupPlayerPickupEvent, player, pickupid);
        }, "ii");

        instanceManager.hookCallback("OnPlayerPauseStateChange", amxCallEvent -> {
            Player player = Player.get((int) amxCallEvent.getParameters()[0]);
            int pausestate = (int) amxCallEvent.getParameters()[1];

            PlayerPauseStateChangeEvent pauseStateChangeEvent = new PlayerPauseStateChangeEvent(player, pausestate);
            eventManager.dispatchEvent(pauseStateChangeEvent, player, pausestate);
        }, "ii");

        instanceManager.hookCallback("OnPlayerStatsAndWeaponsUpdate", amxCallEvent -> {
            Player player = Player.get((int) amxCallEvent.getParameters()[0]);

            PlayerStatsAndWeaponsUpdateEvent statsAndWeaponsUpdateEvent = new PlayerStatsAndWeaponsUpdateEvent(player);
            eventManager.dispatchEvent(statsAndWeaponsUpdateEvent, player);
        }, "i");

        instanceManager.hookCallback("OnRemoteRCONPacket", amxCallEvent -> {
            String ipaddr = (String) amxCallEvent.getParameters()[0];
            int port = (int) amxCallEvent.getParameters()[1];
            String password = (String) amxCallEvent.getParameters()[2];
            int success = (int) amxCallEvent.getParameters()[3];
            String command = (String) amxCallEvent.getParameters()[4];

            RemoteRCONPacketEvent rconPacketEvent = new RemoteRCONPacketEvent(ipaddr, port, password, success, command);
            eventManager.dispatchEvent(rconPacketEvent, ipaddr, port, password, success, command);
        }, "sisis");

        instanceManager.hookCallback("OnServerMessage", amxCallEvent -> {
            String msg = (String) amxCallEvent.getParameters()[0];

            ServerMessageEvent messageEvent = new ServerMessageEvent(msg);
            eventManager.dispatchEvent(messageEvent, msg);
        }, "s");

    }

    public static void unregisterHandlers(AmxInstanceManager instanceManager) {
        instanceManager.unhookCallback("OnPlayerEnterGangZone");
        instanceManager.unhookCallback("OnPlayerLeaveGangZone");
        instanceManager.unhookCallback("OnPlayerEnterPlayerGangZone");
        instanceManager.unhookCallback("OnPlayerLeavePlayerGangZone");
        instanceManager.unhookCallback("OnPlayerPickUpPlayerPickup");
        instanceManager.unhookCallback("OnPlayerPauseStateChange");
        instanceManager.unhookCallback("OnPlayerStatsAndWeaponsUpdate");
        instanceManager.unhookCallback("OnRemoteRCONPacket");
        instanceManager.unhookCallback("OnServerMessage");
    }
}