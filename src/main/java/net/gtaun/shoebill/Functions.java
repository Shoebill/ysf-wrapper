package net.gtaun.shoebill;

import net.gtaun.shoebill.amx.AmxCallable;
import net.gtaun.shoebill.amx.AmxInstance;
import net.gtaun.shoebill.amx.types.ReferenceFloat;
import net.gtaun.shoebill.amx.types.ReferenceInt;
import net.gtaun.shoebill.amx.types.ReferenceString;
import net.gtaun.shoebill.amx.types.ReturnType;

import java.util.HashMap;

public class Functions {

    private static HashMap<String, AmxCallable> functions = new HashMap<>();

    public static void registerFunctions(AmxInstance instance) {
        functions.put("SetModeRestartTime", instance.getNative("SetModeRestartTime", ReturnType.INTEGER));
        functions.put("GetModeRestartTime", instance.getNative("GetModeRestartTime", ReturnType.FLOAT));
        functions.put("SetMaxPlayers", instance.getNative("SetMaxPlayers", ReturnType.INTEGER));
        functions.put("SetMaxNPCs", instance.getNative("SetMaxNPCs", ReturnType.INTEGER));
        functions.put("LoadFilterScript", instance.getNative("LoadFilterScript", ReturnType.INTEGER));
        functions.put("UnLoadFilterScript", instance.getNative("UnLoadFilterScript", ReturnType.INTEGER));
        functions.put("GetFilterScriptCount", instance.getNative("GetFilterScriptCount", ReturnType.INTEGER));
        functions.put("GetFilterScriptName", instance.getNative("GetFilterScriptName", ReturnType.INTEGER));
        functions.put("AddServerRule", instance.getNative("AddServerRule", ReturnType.INTEGER));
        functions.put("SetServerRule", instance.getNative("SetServerRule", ReturnType.INTEGER));
        functions.put("IsValidServerRule", instance.getNative("IsValidServerRule", ReturnType.INTEGER));
        functions.put("SetServerRuleFlags", instance.getNative("SetServerRuleFlags", ReturnType.INTEGER));
        functions.put("GetServerRuleFlags", instance.getNative("GetServerRuleFlags", ReturnType.INTEGER));
        functions.put("ModifyFlag", instance.getNative("ModifyFlag", ReturnType.INTEGER));
        functions.put("GetServerSettings", instance.getNative("GetServerSettings", ReturnType.INTEGER));
        functions.put("YSF_SetTickRate", instance.getNative("YSF_SetTickRate", ReturnType.INTEGER));
        functions.put("YSF_GetTickRate", instance.getNative("YSF_GetTickRate", ReturnType.INTEGER));
        functions.put("YSF_EnableNightVisionFix", instance.getNative("YSF_EnableNightVisionFix", ReturnType.INTEGER));
        functions.put("YSF_IsNightVisionFixEnabled", instance.getNative("YSF_IsNightVisionFixEnabled", ReturnType.INTEGER));
        functions.put("IsValidNickName", instance.getNative("IsValidNickName", ReturnType.INTEGER));
        functions.put("AllowNickNameCharacter", instance.getNative("AllowNickNameCharacter", ReturnType.INTEGER));
        functions.put("IsNickNameCharacterAllowed", instance.getNative("IsNickNameCharacterAllowed", ReturnType.INTEGER));
        functions.put("GetAvailableClasses", instance.getNative("GetAvailableClasses", ReturnType.INTEGER));
        functions.put("GetPlayerClass", instance.getNative("GetPlayerClass", ReturnType.INTEGER));
        functions.put("EditPlayerClass", instance.getNative("EditPlayerClass", ReturnType.INTEGER));
        functions.put("GetRunningTimers", instance.getNative("GetRunningTimers", ReturnType.INTEGER));
        functions.put("SetPlayerGravity", instance.getNative("SetPlayerGravity", ReturnType.INTEGER));
        functions.put("GetPlayerGravity", instance.getNative("GetPlayerGravity", ReturnType.FLOAT));
        functions.put("SetPlayerAdmin", instance.getNative("SetPlayerAdmin", ReturnType.INTEGER));
        functions.put("SetPlayerTeamForPlayer", instance.getNative("SetPlayerTeamForPlayer", ReturnType.INTEGER));
        functions.put("GetPlayerTeamForPlayer", instance.getNative("GetPlayerTeamForPlayer", ReturnType.INTEGER));
        functions.put("SetPlayerSkinForPlayer", instance.getNative("SetPlayerSkinForPlayer", ReturnType.INTEGER));
        functions.put("GetPlayerSkinForPlayer", instance.getNative("GetPlayerSkinForPlayer", ReturnType.INTEGER));
        functions.put("SetPlayerNameForPlayer", instance.getNative("SetPlayerNameForPlayer", ReturnType.INTEGER));
        functions.put("GetPlayerNameForPlayer", instance.getNative("GetPlayerNameForPlayer", ReturnType.INTEGER));
        functions.put("SetPlayerFightStyleForPlayer", instance.getNative("SetPlayerFightStyleForPlayer", ReturnType.INTEGER));
        functions.put("GetPlayerFightStyleForPlayer", instance.getNative("GetPlayerFightStyleForPlayer", ReturnType.INTEGER));
        functions.put("SetPlayerPosForPlayer", instance.getNative("SetPlayerPosForPlayer", ReturnType.INTEGER));
        functions.put("SetPlayerRotationQuatForPlayer", instance.getNative("SetPlayerRotationQuatForPlayer", ReturnType.INTEGER));
        functions.put("ApplyAnimationForPlayer", instance.getNative("ApplyAnimationForPlayer", ReturnType.INTEGER));
        functions.put("GetPlayerWeather", instance.getNative("GetPlayerWeather", ReturnType.INTEGER));
        functions.put("TogglePlayerWidescreen", instance.getNative("TogglePlayerWidescreen", ReturnType.INTEGER));
        functions.put("IsPlayerWidescreenToggled", instance.getNative("IsPlayerWidescreenToggled", ReturnType.INTEGER));
        functions.put("GetSpawnInfo", instance.getNative("GetSpawnInfo", ReturnType.INTEGER));
        functions.put("GetPlayerSkillLevel", instance.getNative("GetPlayerSkillLevel", ReturnType.INTEGER));
        functions.put("IsPlayerCheckpointActive", instance.getNative("IsPlayerCheckpointActive", ReturnType.INTEGER));
        functions.put("GetPlayerCheckpoint", instance.getNative("GetPlayerCheckpoint", ReturnType.INTEGER));
        functions.put("IsPlayerRaceCheckpointActive", instance.getNative("IsPlayerRaceCheckpointActive", ReturnType.INTEGER));
        functions.put("GetPlayerRaceCheckpoint", instance.getNative("GetPlayerRaceCheckpoint", ReturnType.INTEGER));
        functions.put("GetPlayerWorldBounds", instance.getNative("GetPlayerWorldBounds", ReturnType.INTEGER));
        functions.put("IsPlayerInModShop", instance.getNative("IsPlayerInModShop", ReturnType.INTEGER));
        functions.put("GetPlayerSirenState", instance.getNative("GetPlayerSirenState", ReturnType.INTEGER));
        functions.put("GetPlayerLandingGearState", instance.getNative("GetPlayerLandingGearState", ReturnType.INTEGER));
        functions.put("GetPlayerHydraReactorAngle", instance.getNative("GetPlayerHydraReactorAngle", ReturnType.INTEGER));
        functions.put("GetPlayerTrainSpeed", instance.getNative("GetPlayerTrainSpeed", ReturnType.FLOAT));
        functions.put("GetPlayerZAim", instance.getNative("GetPlayerZAim", ReturnType.FLOAT));
        functions.put("GetPlayerSurfingOffsets", instance.getNative("GetPlayerSurfingOffsets", ReturnType.INTEGER));
        functions.put("GetPlayerRotationQuat", instance.getNative("GetPlayerRotationQuat", ReturnType.INTEGER));
        functions.put("GetPlayerSpectateID", instance.getNative("GetPlayerSpectateID", ReturnType.INTEGER));
        functions.put("GetPlayerSpectateType", instance.getNative("GetPlayerSpectateType", ReturnType.INTEGER));
        functions.put("GetPlayerLastSyncedVehicleID", instance.getNative("GetPlayerLastSyncedVehicleID", ReturnType.INTEGER));
        functions.put("GetPlayerLastSyncedTrailerID", instance.getNative("GetPlayerLastSyncedTrailerID", ReturnType.INTEGER));
        functions.put("SendBulletData", instance.getNative("SendBulletData", ReturnType.INTEGER));
        functions.put("ShowPlayerForPlayer", instance.getNative("ShowPlayerForPlayer", ReturnType.INTEGER));
        functions.put("HidePlayerForPlayer", instance.getNative("HidePlayerForPlayer", ReturnType.INTEGER));
        functions.put("SetPlayerChatBubbleForPlayer", instance.getNative("SetPlayerChatBubbleForPlayer", ReturnType.INTEGER));
        functions.put("SetPlayerVersion", instance.getNative("SetPlayerVersion", ReturnType.INTEGER));
        functions.put("IsPlayerSpawned", instance.getNative("IsPlayerSpawned", ReturnType.INTEGER));
        functions.put("IsPlayerControllable", instance.getNative("IsPlayerControllable", ReturnType.INTEGER));
        functions.put("SpawnForWorld", instance.getNative("SpawnForWorld", ReturnType.INTEGER));
        functions.put("BroadcastDeath", instance.getNative("BroadcastDeath", ReturnType.INTEGER));
        functions.put("IsPlayerCameraTargetEnabled", instance.getNative("IsPlayerCameraTargetEnabled", ReturnType.INTEGER));
        functions.put("SetPlayerDisabledKeysSync", instance.getNative("SetPlayerDisabledKeysSync", ReturnType.INTEGER));
        functions.put("GetPlayerDisabledKeysSync", instance.getNative("GetPlayerDisabledKeysSync", ReturnType.INTEGER));
        functions.put("GetActorSpawnInfo", instance.getNative("GetActorSpawnInfo", ReturnType.INTEGER));
        functions.put("GetActorSkin", instance.getNative("GetActorSkin", ReturnType.INTEGER));
        functions.put("TogglePlayerScoresPingsUpdate", instance.getNative("TogglePlayerScoresPingsUpdate", ReturnType.INTEGER));
        functions.put("TogglePlayerFakePing", instance.getNative("TogglePlayerFakePing", ReturnType.INTEGER));
        functions.put("SetPlayerFakePing", instance.getNative("SetPlayerFakePing", ReturnType.INTEGER));
        functions.put("TogglePlayerOnPlayerList", instance.getNative("TogglePlayerOnPlayerList", ReturnType.INTEGER));
        functions.put("IsPlayerToggledOnPlayerList", instance.getNative("IsPlayerToggledOnPlayerList", ReturnType.INTEGER));
        functions.put("IsPlayerPaused", instance.getNative("IsPlayerPaused", ReturnType.INTEGER));
        functions.put("GetPlayerPausedTime", instance.getNative("GetPlayerPausedTime", ReturnType.INTEGER));
        functions.put("GetObjectDrawDistance", instance.getNative("GetObjectDrawDistance", ReturnType.FLOAT));
        functions.put("SetObjectMoveSpeed", instance.getNative("SetObjectMoveSpeed", ReturnType.INTEGER));
        functions.put("GetObjectMoveSpeed", instance.getNative("GetObjectMoveSpeed", ReturnType.FLOAT));
        functions.put("GetObjectTarget", instance.getNative("GetObjectTarget", ReturnType.INTEGER));
        functions.put("GetObjectAttachedData", instance.getNative("GetObjectAttachedData", ReturnType.INTEGER));
        functions.put("GetObjectAttachedOffset", instance.getNative("GetObjectAttachedOffset", ReturnType.INTEGER));
        functions.put("IsObjectMaterialSlotUsed", instance.getNative("IsObjectMaterialSlotUsed", ReturnType.INTEGER));
        functions.put("GetObjectMaterial", instance.getNative("GetObjectMaterial", ReturnType.INTEGER));
        functions.put("GetObjectMaterialText", instance.getNative("GetObjectMaterialText", ReturnType.INTEGER));
        functions.put("IsObjectNoCameraCol", instance.getNative("IsObjectNoCameraCol", ReturnType.INTEGER));
        functions.put("GetPlayerObjectDrawDistance", instance.getNative("GetPlayerObjectDrawDistance", ReturnType.FLOAT));
        functions.put("SetPlayerObjectMoveSpeed", instance.getNative("SetPlayerObjectMoveSpeed", ReturnType.INTEGER));
        functions.put("GetPlayerObjectMoveSpeed", instance.getNative("GetPlayerObjectMoveSpeed", ReturnType.FLOAT));
        functions.put("GetPlayerObjectTarget", instance.getNative("GetPlayerObjectTarget", ReturnType.FLOAT));
        functions.put("GetPlayerObjectAttachedData", instance.getNative("GetPlayerObjectAttachedData", ReturnType.INTEGER));
        functions.put("GetPlayerObjectAttachedOffset", instance.getNative("GetPlayerObjectAttachedOffset", ReturnType.INTEGER));
        functions.put("IsPlayerObjectMaterialSlotUsed", instance.getNative("IsPlayerObjectMaterialSlotUsed", ReturnType.INTEGER));
        functions.put("GetPlayerObjectMaterial", instance.getNative("GetPlayerObjectMaterial", ReturnType.INTEGER));
        functions.put("GetPlayerObjectMaterialText", instance.getNative("GetPlayerObjectMaterialText", ReturnType.INTEGER));
        functions.put("IsPlayerObjectNoCameraCol", instance.getNative("IsPlayerObjectNoCameraCol", ReturnType.INTEGER));
        functions.put("GetPlayerSurfingPlayerObjectID", instance.getNative("GetPlayerSurfingPlayerObjectID", ReturnType.INTEGER));
        functions.put("GetPlayerCameraTargetPlayerObj", instance.getNative("GetPlayerCameraTargetPlayerObj", ReturnType.INTEGER));
        functions.put("GetObjectType", instance.getNative("GetObjectType", ReturnType.INTEGER));
        functions.put("GetPlayerAttachedObject", instance.getNative("GetPlayerAttachedObject", ReturnType.INTEGER));
        functions.put("AttachPlayerObjectToObject", instance.getNative("AttachPlayerObjectToObject", ReturnType.INTEGER));
        functions.put("ClearBanList", instance.getNative("ClearBanList", ReturnType.INTEGER));
        functions.put("IsBanned", instance.getNative("IsBanned", ReturnType.INTEGER));
        functions.put("SetTimeoutTime", instance.getNative("SetTimeoutTime", ReturnType.INTEGER));
        functions.put("GetMTUSize", instance.getNative("GetMTUSize", ReturnType.INTEGER));
        functions.put("GetLocalIP", instance.getNative("GetLocalIP", ReturnType.INTEGER));
        functions.put("GetVehicleSpawnInfo", instance.getNative("GetVehicleSpawnInfo", ReturnType.INTEGER));
        functions.put("SetVehicleSpawnInfo", instance.getNative("SetVehicleSpawnInfo", ReturnType.INTEGER));
        functions.put("GetVehicleColor", instance.getNative("GetVehicleColor", ReturnType.INTEGER));
        functions.put("GetVehiclePaintjob", instance.getNative("GetVehiclePaintjob", ReturnType.INTEGER));
        functions.put("GetVehicleInterior", instance.getNative("GetVehicleInterior", ReturnType.INTEGER));
        functions.put("GetVehicleNumberPlate", instance.getNative("GetVehicleNumberPlate", ReturnType.INTEGER));
        functions.put("SetVehicleRespawnDelay", instance.getNative("SetVehicleRespawnDelay", ReturnType.INTEGER));
        functions.put("GetVehicleRespawnDelay", instance.getNative("GetVehicleRespawnDelay", ReturnType.INTEGER));
        functions.put("SetVehicleOccupiedTick", instance.getNative("SetVehicleOccupiedTick", ReturnType.INTEGER));
        functions.put("GetVehicleOccupiedTick", instance.getNative("GetVehicleOccupiedTick", ReturnType.INTEGER));
        functions.put("SetVehicleRespawnTick", instance.getNative("SetVehicleRespawnTick", ReturnType.INTEGER));
        functions.put("GetVehicleRespawnTick", instance.getNative("GetVehicleRespawnTick", ReturnType.INTEGER));
        functions.put("GetVehicleLastDriver", instance.getNative("GetVehicleLastDriver", ReturnType.INTEGER));
        functions.put("GetVehicleCab", instance.getNative("GetVehicleCab", ReturnType.INTEGER));
        functions.put("HasVehicleBeenOccupied", instance.getNative("HasVehicleBeenOccupied", ReturnType.INTEGER));
        functions.put("SetVehicleBeenOccupied", instance.getNative("SetVehicleBeenOccupied", ReturnType.INTEGER));
        functions.put("IsVehicleOccupied", instance.getNative("IsVehicleOccupied", ReturnType.INTEGER));
        functions.put("IsVehicleDead", instance.getNative("IsVehicleDead", ReturnType.INTEGER));
        functions.put("IsValidGangZone", instance.getNative("IsValidGangZone", ReturnType.INTEGER));
        functions.put("IsPlayerInGangZone", instance.getNative("IsPlayerInGangZone", ReturnType.INTEGER));
        functions.put("IsGangZoneVisibleForPlayer", instance.getNative("IsGangZoneVisibleForPlayer", ReturnType.INTEGER));
        functions.put("GangZoneGetColorForPlayer", instance.getNative("GangZoneGetColorForPlayer", ReturnType.INTEGER));
        functions.put("GangZoneGetFlashColorForPlayer", instance.getNative("GangZoneGetFlashColorForPlayer", ReturnType.INTEGER));
        functions.put("IsGangZoneFlashingForPlayer", instance.getNative("IsGangZoneFlashingForPlayer", ReturnType.INTEGER));
        functions.put("GangZoneGetPos", instance.getNative("GangZoneGetPos", ReturnType.INTEGER));
        functions.put("CreatePlayerGangZone", instance.getNative("CreatePlayerGangZone", ReturnType.INTEGER));
        functions.put("PlayerGangZoneDestroy", instance.getNative("PlayerGangZoneDestroy", ReturnType.INTEGER));
        functions.put("PlayerGangZoneShow", instance.getNative("PlayerGangZoneShow", ReturnType.INTEGER));
        functions.put("PlayerGangZoneHide", instance.getNative("PlayerGangZoneHide", ReturnType.INTEGER));
        functions.put("PlayerGangZoneFlash", instance.getNative("PlayerGangZoneFlash", ReturnType.INTEGER));
        functions.put("PlayerGangZoneStopFlash", instance.getNative("PlayerGangZoneStopFlash", ReturnType.INTEGER));
        functions.put("IsValidPlayerGangZone", instance.getNative("IsValidPlayerGangZone", ReturnType.INTEGER));
        functions.put("IsPlayerInPlayerGangZone", instance.getNative("IsPlayerInPlayerGangZone", ReturnType.INTEGER));
        functions.put("IsPlayerGangZoneVisible", instance.getNative("IsPlayerGangZoneVisible", ReturnType.INTEGER));
        functions.put("PlayerGangZoneGetColor", instance.getNative("PlayerGangZoneGetColor", ReturnType.INTEGER));
        functions.put("PlayerGangZoneGetFlashColor", instance.getNative("PlayerGangZoneGetFlashColor", ReturnType.INTEGER));
        functions.put("IsPlayerGangZoneFlashing", instance.getNative("IsPlayerGangZoneFlashing", ReturnType.INTEGER));
        functions.put("PlayerGangZoneGetPos", instance.getNative("PlayerGangZoneGetPos", ReturnType.INTEGER));
        functions.put("IsValidTextDraw", instance.getNative("IsValidTextDraw", ReturnType.INTEGER));
        functions.put("IsTextDrawVisibleForPlayer", instance.getNative("IsTextDrawVisibleForPlayer", ReturnType.INTEGER));
        functions.put("TextDrawGetString", instance.getNative("TextDrawGetString", ReturnType.INTEGER));
        functions.put("TextDrawSetPos", instance.getNative("TextDrawSetPos", ReturnType.INTEGER));
        functions.put("TextDrawGetLetterSize", instance.getNative("TextDrawGetLetterSize", ReturnType.INTEGER));
        functions.put("TextDrawGetFontSize", instance.getNative("TextDrawGetFontSize", ReturnType.INTEGER));
        functions.put("TextDrawGetPos", instance.getNative("TextDrawGetPos", ReturnType.INTEGER));
        functions.put("TextDrawGetColor", instance.getNative("TextDrawGetColor", ReturnType.INTEGER));
        functions.put("TextDrawGetBoxColor", instance.getNative("TextDrawGetBoxColor", ReturnType.INTEGER));
        functions.put("TextDrawGetBackgroundColor", instance.getNative("TextDrawGetBackgroundColor", ReturnType.INTEGER));
        functions.put("TextDrawGetShadow", instance.getNative("TextDrawGetShadow", ReturnType.INTEGER));
        functions.put("TextDrawGetOutline", instance.getNative("TextDrawGetOutline", ReturnType.INTEGER));
        functions.put("TextDrawGetFont", instance.getNative("TextDrawGetFont", ReturnType.INTEGER));
        functions.put("TextDrawIsBox", instance.getNative("TextDrawIsBox", ReturnType.INTEGER));
        functions.put("TextDrawIsProportional", instance.getNative("TextDrawIsProportional", ReturnType.INTEGER));
        functions.put("TextDrawIsSelectable", instance.getNative("TextDrawIsSelectable", ReturnType.INTEGER));
        functions.put("TextDrawGetAlignment", instance.getNative("TextDrawGetAlignment", ReturnType.INTEGER));
        functions.put("TextDrawGetPreviewModel", instance.getNative("TextDrawGetPreviewModel", ReturnType.INTEGER));
        functions.put("TextDrawGetPreviewRot", instance.getNative("TextDrawGetPreviewRot", ReturnType.INTEGER));
        functions.put("TextDrawGetPreviewVehCol", instance.getNative("TextDrawGetPreviewVehCol", ReturnType.INTEGER));
        functions.put("IsValidPlayerTextDraw", instance.getNative("IsValidPlayerTextDraw", ReturnType.INTEGER));
        functions.put("IsPlayerTextDrawVisible", instance.getNative("IsPlayerTextDrawVisible", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetString", instance.getNative("PlayerTextDrawGetString", ReturnType.INTEGER));
        functions.put("PlayerTextDrawSetPos", instance.getNative("PlayerTextDrawSetPos", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetLetterSize", instance.getNative("PlayerTextDrawGetLetterSize", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetFontSize", instance.getNative("PlayerTextDrawGetFontSize", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetPos", instance.getNative("PlayerTextDrawGetPos", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetColor", instance.getNative("PlayerTextDrawGetColor", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetBoxColor", instance.getNative("PlayerTextDrawGetBoxColor", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetBackgroundCol", instance.getNative("PlayerTextDrawGetBackgroundCol", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetShadow", instance.getNative("PlayerTextDrawGetShadow", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetOutline", instance.getNative("PlayerTextDrawGetOutline", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetFont", instance.getNative("PlayerTextDrawGetFont", ReturnType.INTEGER));
        functions.put("PlayerTextDrawIsBox", instance.getNative("PlayerTextDrawIsBox", ReturnType.INTEGER));
        functions.put("PlayerTextDrawIsProportional", instance.getNative("PlayerTextDrawIsProportional", ReturnType.INTEGER));
        functions.put("PlayerTextDrawIsSelectable", instance.getNative("PlayerTextDrawIsSelectable", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetAlignment", instance.getNative("PlayerTextDrawGetAlignment", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetPreviewModel", instance.getNative("PlayerTextDrawGetPreviewModel", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetPreviewRot", instance.getNative("PlayerTextDrawGetPreviewRot", ReturnType.INTEGER));
        functions.put("PlayerTextDrawGetPreviewVehCol", instance.getNative("PlayerTextDrawGetPreviewVehCol", ReturnType.INTEGER));
        functions.put("IsValid3DTextLabel", instance.getNative("IsValid3DTextLabel", ReturnType.INTEGER));
        functions.put("Is3DTextLabelStreamedIn", instance.getNative("Is3DTextLabelStreamedIn", ReturnType.INTEGER));
        functions.put("Get3DTextLabelText", instance.getNative("Get3DTextLabelText", ReturnType.INTEGER));
        functions.put("Get3DTextLabelColor", instance.getNative("Get3DTextLabelColor", ReturnType.INTEGER));
        functions.put("Get3DTextLabelPos", instance.getNative("Get3DTextLabelPos", ReturnType.INTEGER));
        functions.put("Get3DTextLabelDrawDistance", instance.getNative("Get3DTextLabelDrawDistance", ReturnType.FLOAT));
        functions.put("Get3DTextLabelLOS", instance.getNative("Get3DTextLabelLOS", ReturnType.INTEGER));
        functions.put("Get3DTextLabelVirtualWorld", instance.getNative("Get3DTextLabelVirtualWorld", ReturnType.INTEGER));
        functions.put("Get3DTextLabelAttachedData", instance.getNative("Get3DTextLabelAttachedData", ReturnType.INTEGER));
        functions.put("IsValidPlayer3DTextLabel", instance.getNative("IsValidPlayer3DTextLabel", ReturnType.INTEGER));
        functions.put("GetPlayer3DTextLabelText", instance.getNative("GetPlayer3DTextLabelText", ReturnType.INTEGER));
        functions.put("GetPlayer3DTextLabelColor", instance.getNative("GetPlayer3DTextLabelColor", ReturnType.INTEGER));
        functions.put("GetPlayer3DTextLabelPos", instance.getNative("GetPlayer3DTextLabelPos", ReturnType.INTEGER));
        functions.put("GetPlayer3DTextLabelDrawDist", instance.getNative("GetPlayer3DTextLabelDrawDist", ReturnType.FLOAT));
        functions.put("GetPlayer3DTextLabelLOS", instance.getNative("GetPlayer3DTextLabelLOS", ReturnType.INTEGER));
        functions.put("GetPlayer3DTextLabelVirtualW", instance.getNative("GetPlayer3DTextLabelVirtualW", ReturnType.INTEGER));
        functions.put("GetPlayer3DTextLabelAttached", instance.getNative("GetPlayer3DTextLabelAttached", ReturnType.INTEGER));
        functions.put("IsMenuDisabled", instance.getNative("IsMenuDisabled", ReturnType.INTEGER));
        functions.put("IsMenuRowDisabled", instance.getNative("IsMenuRowDisabled", ReturnType.INTEGER));
        functions.put("GetMenuColumns", instance.getNative("GetMenuColumns", ReturnType.INTEGER));
        functions.put("GetMenuItems", instance.getNative("GetMenuItems", ReturnType.INTEGER));
        functions.put("GetMenuPos", instance.getNative("GetMenuPos", ReturnType.INTEGER));
        functions.put("GetMenuColumnWidth", instance.getNative("GetMenuColumnWidth", ReturnType.INTEGER));
        functions.put("GetMenuColumnHeader", instance.getNative("GetMenuColumnHeader", ReturnType.INTEGER));
        functions.put("GetMenuItem", instance.getNative("GetMenuItem", ReturnType.INTEGER));
        functions.put("IsValidPickup", instance.getNative("IsValidPickup", ReturnType.INTEGER));
        functions.put("IsPickupStreamedIn", instance.getNative("IsPickupStreamedIn", ReturnType.INTEGER));
        functions.put("GetPickupPos", instance.getNative("GetPickupPos", ReturnType.INTEGER));
        functions.put("GetPickupModel", instance.getNative("GetPickupModel", ReturnType.INTEGER));
        functions.put("GetPickupType", instance.getNative("GetPickupType", ReturnType.INTEGER));
        functions.put("GetPickupVirtualWorld", instance.getNative("GetPickupVirtualWorld", ReturnType.INTEGER));
        functions.put("GetColCount", instance.getNative("GetColCount", ReturnType.INTEGER));
        functions.put("GetColSphereRadius", instance.getNative("GetColSphereRadius", ReturnType.FLOAT));
        functions.put("GetColSphereOffset", instance.getNative("GetColSphereOffset", ReturnType.INTEGER));
        functions.put("GetWeather", instance.getNative("GetWeather", ReturnType.INTEGER));
        functions.put("GetWeaponSlot", instance.getNative("GetWeaponSlot", ReturnType.INTEGER));
    }

    public static int SetModeRestartTime(float time) {
        return (int) functions.get("SetModeRestartTime").call(time);
    }

    public static float GetModeRestartTime() {
        return (float) functions.get("GetModeRestartTime").call();
    }

    public static int SetMaxPlayers(int maxplayers) {
        return (int) functions.get("SetMaxPlayers").call(maxplayers);
    }

    public static int SetMaxNPCs(int maxnpcs) {
        return (int) functions.get("SetMaxNPCs").call(maxnpcs);
    }

    public static int LoadFilterScript(String scriptname) {
        return (int) functions.get("LoadFilterScript").call(scriptname);
    }

    public static int UnLoadFilterScript(String scriptname) {
        return (int) functions.get("UnLoadFilterScript").call(scriptname);
    }

    public static int GetFilterScriptCount() {
        return (int) functions.get("GetFilterScriptCount").call();
    }

    public static int GetFilterScriptName(int id, String name, int len) {
        return (int) functions.get("GetFilterScriptName").call(id, name, len);
    }

    public static int AddServerRule(String name, String value, int flags) {
        return (int) functions.get("AddServerRule").call(name, value, flags);
    }

    public static int SetServerRule(String name, String value) {
        return (int) functions.get("SetServerRule").call(name, value);
    }

    public static int IsValidServerRule(String name) {
        return (int) functions.get("IsValidServerRule").call(name);
    }

    public static int SetServerRuleFlags(String name, int flags) {
        return (int) functions.get("SetServerRuleFlags").call(name, flags);
    }

    public static int GetServerRuleFlags(String name) {
        return (int) functions.get("GetServerRuleFlags").call(name);
    }

    public static int ModifyFlag(String name, int flags) {
        return (int) functions.get("ModifyFlag").call(name, flags);
    }

    public static int GetServerSettings(ReferenceInt showplayermarkes, ReferenceInt shownametags, ReferenceInt stuntbonus, ReferenceInt useplayerpedanims, ReferenceInt bLimitchatradius, ReferenceInt disableinteriorenterexits, ReferenceInt nametaglos, ReferenceInt manualvehicleengine, ReferenceInt limitplayermarkers, ReferenceInt vehiclefriendlyfire, ReferenceInt defaultcameracollision, ReferenceFloat fGlobalchatradius, ReferenceFloat fNameTagDrawDistance, ReferenceFloat fPlayermarkerslimit) {
        return (int) functions.get("GetServerSettings").call(showplayermarkes, shownametags, stuntbonus, useplayerpedanims, bLimitchatradius, disableinteriorenterexits, nametaglos, manualvehicleengine, limitplayermarkers, vehiclefriendlyfire, defaultcameracollision, fGlobalchatradius, fNameTagDrawDistance, fPlayermarkerslimit);
    }

    public static int YSF_SetTickRate(int ticks) {
        return (int) functions.get("YSF_SetTickRate").call(ticks);
    }

    public static int YSF_GetTickRate() {
        return (int) functions.get("YSF_GetTickRate").call();
    }

    public static int YSF_EnableNightVisionFix(int enable) {
        return (int) functions.get("YSF_EnableNightVisionFix").call(enable);
    }

    public static int YSF_IsNightVisionFixEnabled() {
        return (int) functions.get("YSF_IsNightVisionFixEnabled").call();
    }

    public static int IsValidNickName(String name) {
        return (int) functions.get("IsValidNickName").call(name);
    }

    public static int AllowNickNameCharacter(int character, boolean allow) {
        return (int) functions.get("AllowNickNameCharacter").call(character, allow);
    }

    public static int IsNickNameCharacterAllowed(int character) {
        return (int) functions.get("IsNickNameCharacterAllowed").call(character);
    }

    public static int GetAvailableClasses() {
        return (int) functions.get("GetAvailableClasses").call();
    }

    public static int GetPlayerClass(int classid, ReferenceInt teamid, ReferenceInt modelid, ReferenceFloat spawn_x, ReferenceFloat spawn_y, ReferenceFloat spawn_z, ReferenceFloat z_angle, ReferenceInt weapon1, ReferenceInt weapon1_ammo, ReferenceInt weapon2, ReferenceInt weapon2_ammo, ReferenceInt weapon3, ReferenceInt weapon3_ammo) {
        return (int) functions.get("GetPlayerClass").call(classid, teamid, modelid, spawn_x, spawn_y, spawn_z, z_angle, weapon1, weapon1_ammo, weapon2, weapon2_ammo, weapon3, weapon3_ammo);
    }

    public static int EditPlayerClass(int classid, int teamid, int modelid, float spawn_x, float spawn_y, float spawn_z, float z_angle, int weapon1, int weapon1_ammo, int weapon2, int weapon2_ammo, int weapon3, int weapon3_ammo) {
        return (int) functions.get("EditPlayerClass").call(classid, teamid, modelid, spawn_x, spawn_y, spawn_z, z_angle, weapon1, weapon1_ammo, weapon2, weapon2_ammo, weapon3, weapon3_ammo);
    }

    public static int GetRunningTimers() {
        return (int) functions.get("GetRunningTimers").call();
    }

    public static int SetPlayerGravity(int playerid, float gravity) {
        return (int) functions.get("SetPlayerGravity").call(playerid, gravity);
    }

    public static float GetPlayerGravity(int playerid) {
        return (float) functions.get("GetPlayerGravity").call(playerid);
    }

    public static int SetPlayerAdmin(int playerid, boolean admin) {
        return (int) functions.get("SetPlayerAdmin").call(playerid, admin);
    }

    public static int SetPlayerTeamForPlayer(int playerid, int teamplayerid, int teamid) {
        return (int) functions.get("SetPlayerTeamForPlayer").call(playerid, teamplayerid, teamid);
    }

    public static int GetPlayerTeamForPlayer(int playerid, int teamplayerid) {
        return (int) functions.get("GetPlayerTeamForPlayer").call(playerid, teamplayerid);
    }

    public static int SetPlayerSkinForPlayer(int playerid, int skinplayerid, int skin) {
        return (int) functions.get("SetPlayerSkinForPlayer").call(playerid, skinplayerid, skin);
    }

    public static int GetPlayerSkinForPlayer(int playerid, int skinplayerid) {
        return (int) functions.get("GetPlayerSkinForPlayer").call(playerid, skinplayerid);
    }

    public static int SetPlayerNameForPlayer(int playerid, int nameplayerid, String playername) {
        return (int) functions.get("SetPlayerNameForPlayer").call(playerid, nameplayerid, playername);
    }

    public static int GetPlayerNameForPlayer(int playerid, int nameplayerid, ReferenceString playername, int size) {
        return (int) functions.get("GetPlayerNameForPlayer").call(playerid, nameplayerid, playername, size);
    }

    public static int SetPlayerFightStyleForPlayer(int playerid, int styleplayerid, int style) {
        return (int) functions.get("SetPlayerFightStyleForPlayer").call(playerid, styleplayerid, style);
    }

    public static int GetPlayerFightStyleForPlayer(int playerid, int skinplayerid) {
        return (int) functions.get("GetPlayerFightStyleForPlayer").call(playerid, skinplayerid);
    }

    public static int SetPlayerPosForPlayer(int playerid, int posplayerid, float fX, float fY, float fZ, boolean forcesync) {
        return (int) functions.get("SetPlayerPosForPlayer").call(playerid, posplayerid, fX, fY, fZ, forcesync);
    }

    public static int SetPlayerRotationQuatForPlayer(int playerid, int quatplayerid, float w, float x, float y, float z, boolean forcesync) {
        return (int) functions.get("SetPlayerRotationQuatForPlayer").call(playerid, quatplayerid, w, x, y, z, forcesync);
    }

    public static int ApplyAnimationForPlayer(int playerid, int animplayerid, String animlib, String animname, float fDelta, int loop, int lockx, int locky, int freeze, int time) {
        return (int) functions.get("ApplyAnimationForPlayer").call(playerid, animplayerid, animlib, animname, fDelta, loop, lockx, locky, freeze, time);
    }

    public static int GetPlayerWeather(int playerid) {
        return (int) functions.get("GetPlayerWeather").call(playerid);
    }

    public static int TogglePlayerWidescreen(int playerid, boolean set) {
        return (int) functions.get("TogglePlayerWidescreen").call(playerid, set);
    }

    public static int IsPlayerWidescreenToggled(int playerid) {
        return (int) functions.get("IsPlayerWidescreenToggled").call(playerid);
    }

    public static int GetSpawnInfo(int playerid, ReferenceInt teamid, ReferenceInt modelid, ReferenceFloat spawn_x, ReferenceFloat spawn_y, ReferenceFloat spawn_z, ReferenceFloat z_angle, ReferenceInt weapon1, ReferenceInt weapon1_ammo, ReferenceInt weapon2, ReferenceInt weapon2_ammo, ReferenceInt weapon3, ReferenceInt weapon3_ammo) {
        return (int) functions.get("GetSpawnInfo").call(playerid, teamid, modelid, spawn_x, spawn_y, spawn_z, z_angle, weapon1, weapon1_ammo, weapon2, weapon2_ammo, weapon3, weapon3_ammo);
    }

    public static int GetPlayerSkillLevel(int playerid, int skill) {
        return (int) functions.get("GetPlayerSkillLevel").call(playerid, skill);
    }

    public static int IsPlayerCheckpointActive(int playerid) {
        return (int) functions.get("IsPlayerCheckpointActive").call(playerid);
    }

    public static int GetPlayerCheckpoint(int playerid, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ, ReferenceFloat fSize) {
        return (int) functions.get("GetPlayerCheckpoint").call(playerid, fX, fY, fZ, fSize);
    }

    public static int IsPlayerRaceCheckpointActive(int playerid) {
        return (int) functions.get("IsPlayerRaceCheckpointActive").call(playerid);
    }

    public static int GetPlayerRaceCheckpoint(int playerid, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ, ReferenceFloat fNextX, ReferenceFloat fNextY, ReferenceFloat NextZ, ReferenceFloat fSize) {
        return (int) functions.get("GetPlayerRaceCheckpoint").call(playerid, fX, fY, fZ, fNextX, fNextY, NextZ, fSize);
    }

    public static int GetPlayerWorldBounds(int playerid, ReferenceFloat x_max, ReferenceFloat x_min, ReferenceFloat y_max, ReferenceFloat y_min) {
        return (int) functions.get("GetPlayerWorldBounds").call(playerid, x_max, x_min, y_max, y_min);
    }

    public static int IsPlayerInModShop(int playerid) {
        return (int) functions.get("IsPlayerInModShop").call(playerid);
    }

    public static int GetPlayerSirenState(int playerid) {
        return (int) functions.get("GetPlayerSirenState").call(playerid);
    }

    public static int GetPlayerLandingGearState(int playerid) {
        return (int) functions.get("GetPlayerLandingGearState").call(playerid);
    }

    public static int GetPlayerHydraReactorAngle(int playerid) {
        return (int) functions.get("GetPlayerHydraReactorAngle").call(playerid);
    }

    public static float GetPlayerTrainSpeed(int playerid) {
        return (float) functions.get("GetPlayerTrainSpeed").call(playerid);
    }

    public static float GetPlayerZAim(int playerid) {
        return (float) functions.get("GetPlayerZAim").call(playerid);
    }

    public static int GetPlayerSurfingOffsets(int playerid, ReferenceFloat fOffsetX, ReferenceFloat fOffsetY, ReferenceFloat fOffsetZ) {
        return (int) functions.get("GetPlayerSurfingOffsets").call(playerid, fOffsetX, fOffsetY, fOffsetZ);
    }

    public static int GetPlayerRotationQuat(int playerid, ReferenceFloat w, ReferenceFloat x, ReferenceFloat y, ReferenceFloat z) {
        return (int) functions.get("GetPlayerRotationQuat").call(playerid, w, x, y, z);
    }

    public static int GetPlayerSpectateID(int playerid) {
        return (int) functions.get("GetPlayerSpectateID").call(playerid);
    }

    public static int GetPlayerSpectateType(int playerid) {
        return (int) functions.get("GetPlayerSpectateType").call(playerid);
    }

    public static int GetPlayerLastSyncedVehicleID(int playerid) {
        return (int) functions.get("GetPlayerLastSyncedVehicleID").call(playerid);
    }

    public static int GetPlayerLastSyncedTrailerID(int playerid) {
        return (int) functions.get("GetPlayerLastSyncedTrailerID").call(playerid);
    }

    public static int SendBulletData(int sender, int hitid, int hittype, int weaponid, float fHitOriginX, float fHitOriginY, float fHitOriginZ, float fHitTargetX, float fHitTargetY, float fHitTargetZ, float fCenterOfHitX, float fCenterOfHitY, float fCenterOfHitZ, int forplayerid) {
        return (int) functions.get("SendBulletData").call(sender, hitid, hittype, weaponid, fHitOriginX, fHitOriginY, fHitOriginZ, fHitTargetX, fHitTargetY, fHitTargetZ, fCenterOfHitX, fCenterOfHitY, fCenterOfHitZ, forplayerid);
    }

    public static int ShowPlayerForPlayer(int forplayerid, int playerid) {
        return (int) functions.get("ShowPlayerForPlayer").call(forplayerid, playerid);
    }

    public static int HidePlayerForPlayer(int forplayerid, int playerid) {
        return (int) functions.get("HidePlayerForPlayer").call(forplayerid, playerid);
    }

    public static int SetPlayerChatBubbleForPlayer(int forplayerid, int playerid, String text, int color, float drawdistance, int expiretime) {
        return (int) functions.get("SetPlayerChatBubbleForPlayer").call(forplayerid, playerid, text, color, drawdistance, expiretime);
    }

    public static int SetPlayerVersion(int playerid, String version) {
        return (int) functions.get("SetPlayerVersion").call(playerid, version);
    }

    public static int IsPlayerSpawned(int playerid) {
        return (int) functions.get("IsPlayerSpawned").call(playerid);
    }

    public static int IsPlayerControllable(int playerid) {
        return (int) functions.get("IsPlayerControllable").call(playerid);
    }

    public static int SpawnForWorld(int playerid) {
        return (int) functions.get("SpawnForWorld").call(playerid);
    }

    public static int BroadcastDeath(int playerid) {
        return (int) functions.get("BroadcastDeath").call(playerid);
    }

    public static int IsPlayerCameraTargetEnabled(int playerid) {
        return (int) functions.get("IsPlayerCameraTargetEnabled").call(playerid);
    }

    public static int SetPlayerDisabledKeysSync(int playerid, int keys) {
        return (int) functions.get("SetPlayerDisabledKeysSync").call(playerid, keys);
    }

    public static int GetPlayerDisabledKeysSync(int playerid) {
        return (int) functions.get("GetPlayerDisabledKeysSync").call(playerid);
    }

    public static int GetActorSpawnInfo(int actorid, ReferenceInt skinid, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ, ReferenceFloat fAngle) {
        return (int) functions.get("GetActorSpawnInfo").call(actorid, skinid, fX, fY, fZ, fAngle);
    }

    public static int GetActorSkin(int actorid) {
        return (int) functions.get("GetActorSkin").call(actorid);
    }

    public static int TogglePlayerScoresPingsUpdate(int playerid, boolean toggle) {
        return (int) functions.get("TogglePlayerScoresPingsUpdate").call(playerid, toggle);
    }

    public static int TogglePlayerFakePing(int playerid, boolean toggle) {
        return (int) functions.get("TogglePlayerFakePing").call(playerid, toggle);
    }

    public static int SetPlayerFakePing(int playerid, int ping) {
        return (int) functions.get("SetPlayerFakePing").call(playerid, ping);
    }

    public static int TogglePlayerOnPlayerList(int playerid, boolean toggle) {
        return (int) functions.get("TogglePlayerOnPlayerList").call(playerid, toggle);
    }

    public static int IsPlayerToggledOnPlayerList(int playerid) {
        return (int) functions.get("IsPlayerToggledOnPlayerList").call(playerid);
    }

    public static int IsPlayerPaused(int playerid) {
        return (int) functions.get("IsPlayerPaused").call(playerid);
    }

    public static int GetPlayerPausedTime(int playerid) {
        return (int) functions.get("GetPlayerPausedTime").call(playerid);
    }

    public static float GetObjectDrawDistance(int objectid) {
        return (float) functions.get("GetObjectDrawDistance").call(objectid);
    }

    public static int SetObjectMoveSpeed(int objectid, float fSpeed) {
        return (int) functions.get("SetObjectMoveSpeed").call(objectid, fSpeed);
    }

    public static float GetObjectMoveSpeed(int objectid) {
        return (float) functions.get("GetObjectMoveSpeed").call(objectid);
    }

    public static int GetObjectTarget(int objectid, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ) {
        return (int) functions.get("GetObjectTarget").call(objectid, fX, fY, fZ);
    }

    public static int GetObjectAttachedData(int objectid, ReferenceInt attached_vehicleid, ReferenceInt attached_objectid, ReferenceInt attached_playerid) {
        return (int) functions.get("GetObjectAttachedData").call(objectid, attached_vehicleid, attached_objectid, attached_playerid);
    }

    public static int GetObjectAttachedOffset(int objectid, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ, ReferenceFloat fRotX, ReferenceFloat fRotY, ReferenceFloat fRotZ) {
        return (int) functions.get("GetObjectAttachedOffset").call(objectid, fX, fY, fZ, fRotX, fRotY, fRotZ);
    }

    public static int IsObjectMaterialSlotUsed(int objectid, int materialindex) {
        return (int) functions.get("IsObjectMaterialSlotUsed").call(objectid, materialindex);
    }

    public static int GetObjectMaterial(int objectid, int materialindex, ReferenceInt modelid, ReferenceString txdname, int txdnamelen, ReferenceString texturename, int texturenamelen, ReferenceInt materialcoor) {
        return (int) functions.get("GetObjectMaterial").call(objectid, materialindex, modelid, txdname, txdnamelen, texturename, texturenamelen, materialcoor);
    }

    public static int GetObjectMaterialText(int objectid, int materialindex, ReferenceString text, int textlen, ReferenceInt materialsize, ReferenceString fontface, int fontfacelen, ReferenceInt fontsize, ReferenceInt bold, ReferenceInt fontcolor, ReferenceInt backcolor, ReferenceInt textalignment) {
        return (int) functions.get("GetObjectMaterialText").call(objectid, materialindex, text, textlen, materialsize, fontface, fontfacelen, fontsize, bold, fontcolor, backcolor, textalignment);
    }

    public static int IsObjectNoCameraCol(int objectid) {
        return (int) functions.get("IsObjectNoCameraCol").call(objectid);
    }

    public static float GetPlayerObjectDrawDistance(int playerid, int objectid) {
        return (float) functions.get("GetPlayerObjectDrawDistance").call(playerid, objectid);
    }

    public static int SetPlayerObjectMoveSpeed(int playerid, int objectid, float fSpeed) {
        return (int) functions.get("SetPlayerObjectMoveSpeed").call(playerid, objectid, fSpeed);
    }

    public static float GetPlayerObjectMoveSpeed(int playerid, int objectid) {
        return (float) functions.get("GetPlayerObjectMoveSpeed").call(playerid, objectid);
    }

    public static float GetPlayerObjectTarget(int playerid, int objectid, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ) {
        return (float) functions.get("GetPlayerObjectTarget").call(playerid, objectid, fX, fY, fZ);
    }

    public static int GetPlayerObjectAttachedData(int playerid, int objectid, ReferenceInt attached_vehicleid, ReferenceInt attached_objectid, ReferenceInt attached_playerid) {
        return (int) functions.get("GetPlayerObjectAttachedData").call(playerid, objectid, attached_vehicleid, attached_objectid, attached_playerid);
    }

    public static int GetPlayerObjectAttachedOffset(int playerid, int objectid, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ, ReferenceFloat fRotX, ReferenceFloat fRotY, ReferenceFloat fRotZ) {
        return (int) functions.get("GetPlayerObjectAttachedOffset").call(playerid, objectid, fX, fY, fZ, fRotX, fRotY, fRotZ);
    }

    public static int IsPlayerObjectMaterialSlotUsed(int playerid, int objectid, int materialindex) {
        return (int) functions.get("IsPlayerObjectMaterialSlotUsed").call(playerid, objectid, materialindex);
    }

    public static int GetPlayerObjectMaterial(int playerid, int objectid, int materialindex, ReferenceInt modelid, ReferenceString txdname, int txdnamelen, ReferenceString texturename, int texturenamelen, ReferenceInt materialcolor) {
        return (int) functions.get("GetPlayerObjectMaterial").call(playerid, objectid, materialindex, modelid, txdname, txdnamelen, texturename, texturenamelen, materialcolor);
    }

    public static int GetPlayerObjectMaterialText(int playerid, int objectid, int materialindex, ReferenceString text, int textlen, ReferenceInt materialsize, ReferenceString fontface, int fontfacelen, ReferenceInt fontsize, ReferenceInt bold, ReferenceInt fontcolor, ReferenceInt backcolor, ReferenceInt textalignment) {
        return (int) functions.get("GetPlayerObjectMaterialText").call(playerid, objectid, materialindex, text, textlen, materialsize, fontface, fontfacelen, fontsize, bold, fontcolor, backcolor, textalignment);
    }

    public static int IsPlayerObjectNoCameraCol(int playerid, int objectid) {
        return (int) functions.get("IsPlayerObjectNoCameraCol").call(playerid, objectid);
    }

    public static int GetPlayerSurfingPlayerObjectID(int playerid) {
        return (int) functions.get("GetPlayerSurfingPlayerObjectID").call(playerid);
    }

    public static int GetPlayerCameraTargetPlayerObj(int playerid) {
        return (int) functions.get("GetPlayerCameraTargetPlayerObj").call(playerid);
    }

    public static int GetObjectType(int playerid, int objectid) {
        return (int) functions.get("GetObjectType").call(playerid, objectid);
    }

    public static int GetPlayerAttachedObject(int playerid, int index, ReferenceInt modelid, ReferenceInt bone, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ, ReferenceFloat fRotX, ReferenceFloat fRotY, ReferenceFloat fRotZ, ReferenceFloat fSacleX, ReferenceFloat fScaleY, ReferenceFloat fScaleZ, ReferenceInt materialcolor1, ReferenceInt materialcolor2) {
        return (int) functions.get("GetPlayerAttachedObject").call(playerid, index, modelid, bone, fX, fY, fZ, fRotX, fRotY, fRotZ, fSacleX, fScaleY, fScaleZ, materialcolor1, materialcolor2);
    }

    public static int AttachPlayerObjectToObject(int playerid, int objectid, int attachtoid, float OffsetX, float OffsetY, float OffsetZ, float RotX, float RotY, float RotZ, int SyncRotation) {
        return (int) functions.get("AttachPlayerObjectToObject").call(playerid, objectid, attachtoid, OffsetX, OffsetY, OffsetZ, RotX, RotY, RotZ, SyncRotation);
    }

    public static int ClearBanList() {
        return (int) functions.get("ClearBanList").call();
    }

    public static int IsBanned(String ipaddress) {
        return (int) functions.get("IsBanned").call(ipaddress);
    }

    public static int SetTimeoutTime(int playerid, int time_ms) {
        return (int) functions.get("SetTimeoutTime").call(playerid, time_ms);
    }

    public static int GetMTUSize() {
        return (int) functions.get("GetMTUSize").call();
    }

    public static int GetLocalIP(int index, String localip, int len) {
        return (int) functions.get("GetLocalIP").call(index, localip, len);
    }

    public static int GetVehicleSpawnInfo(int vehicleid, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ, ReferenceFloat fRot, ReferenceInt color1, ReferenceInt color2) {
        return (int) functions.get("GetVehicleSpawnInfo").call(vehicleid, fX, fY, fZ, fRot, color1, color2);
    }

    public static int SetVehicleSpawnInfo(int vehicleid, int modelid, float fX, float fY, float fZ, float fAngle, int color1, int color2, int respawntime, int interior) {
        return (int) functions.get("SetVehicleSpawnInfo").call(vehicleid, modelid, fX, fY, fZ, fAngle, color1, color2, respawntime, interior);
    }

    public static int GetVehicleColor(int vehicleid, ReferenceInt color1, ReferenceInt color2) {
        return (int) functions.get("GetVehicleColor").call(vehicleid, color1, color2);
    }

    public static int GetVehiclePaintjob(int vehicleid) {
        return (int) functions.get("GetVehiclePaintjob").call(vehicleid);
    }

    public static int GetVehicleInterior(int vehicleid) {
        return (int) functions.get("GetVehicleInterior").call(vehicleid);
    }

    public static int GetVehicleNumberPlate(int vehicleid, String plate, int len) {
        return (int) functions.get("GetVehicleNumberPlate").call(vehicleid, plate, len);
    }

    public static int SetVehicleRespawnDelay(int vehicleid, int delay) {
        return (int) functions.get("SetVehicleRespawnDelay").call(vehicleid, delay);
    }

    public static int GetVehicleRespawnDelay(int vehicleid) {
        return (int) functions.get("GetVehicleRespawnDelay").call(vehicleid);
    }

    public static int SetVehicleOccupiedTick(int vehicleid, int ticks) {
        return (int) functions.get("SetVehicleOccupiedTick").call(vehicleid, ticks);
    }

    public static int GetVehicleOccupiedTick(int vehicleid) {
        return (int) functions.get("GetVehicleOccupiedTick").call(vehicleid);
    }

    public static int SetVehicleRespawnTick(int vehicleid, int ticks) {
        return (int) functions.get("SetVehicleRespawnTick").call(vehicleid, ticks);
    }

    public static int GetVehicleRespawnTick(int vehicleid) {
        return (int) functions.get("GetVehicleRespawnTick").call(vehicleid);
    }

    public static int GetVehicleLastDriver(int vehicleid) {
        return (int) functions.get("GetVehicleLastDriver").call(vehicleid);
    }

    public static int GetVehicleCab(int vehicleid) {
        return (int) functions.get("GetVehicleCab").call(vehicleid);
    }

    public static int HasVehicleBeenOccupied(int vehicleid) {
        return (int) functions.get("HasVehicleBeenOccupied").call(vehicleid);
    }

    public static int SetVehicleBeenOccupied(int vehicleid, int occupied) {
        return (int) functions.get("SetVehicleBeenOccupied").call(vehicleid, occupied);
    }

    public static int IsVehicleOccupied(int vehicleid) {
        return (int) functions.get("IsVehicleOccupied").call(vehicleid);
    }

    public static int IsVehicleDead(int vehicleid) {
        return (int) functions.get("IsVehicleDead").call(vehicleid);
    }

    public static int IsValidGangZone(int zoneid) {
        return (int) functions.get("IsValidGangZone").call(zoneid);
    }

    public static int IsPlayerInGangZone(int playerid, int zoneid) {
        return (int) functions.get("IsPlayerInGangZone").call(playerid, zoneid);
    }

    public static int IsGangZoneVisibleForPlayer(int playerid, int zoneid) {
        return (int) functions.get("IsGangZoneVisibleForPlayer").call(playerid, zoneid);
    }

    public static int GangZoneGetColorForPlayer(int playerid, int zoneid) {
        return (int) functions.get("GangZoneGetColorForPlayer").call(playerid, zoneid);
    }

    public static int GangZoneGetFlashColorForPlayer(int playerid, int zoneid) {
        return (int) functions.get("GangZoneGetFlashColorForPlayer").call(playerid, zoneid);
    }

    public static int IsGangZoneFlashingForPlayer(int playerid, int zoneid) {
        return (int) functions.get("IsGangZoneFlashingForPlayer").call(playerid, zoneid);
    }

    public static int GangZoneGetPos(int zoneid, ReferenceFloat fMinX, ReferenceFloat fMinY, ReferenceFloat fMaxX, ReferenceFloat fMaxY) {
        return (int) functions.get("GangZoneGetPos").call(zoneid, fMinX, fMinY, fMaxX, fMaxY);
    }

    public static int CreatePlayerGangZone(int playerid, float minx, float miny, float maxx, float maxy) {
        return (int) functions.get("CreatePlayerGangZone").call(playerid, minx, miny, maxx, maxy);
    }

    public static int PlayerGangZoneDestroy(int playerid, int zoneid) {
        return (int) functions.get("PlayerGangZoneDestroy").call(playerid, zoneid);
    }

    public static int PlayerGangZoneShow(int playerid, int zoneid, int color) {
        return (int) functions.get("PlayerGangZoneShow").call(playerid, zoneid, color);
    }

    public static int PlayerGangZoneHide(int playerid, int zoneid) {
        return (int) functions.get("PlayerGangZoneHide").call(playerid, zoneid);
    }

    public static int PlayerGangZoneFlash(int playerid, int zoneid, int color) {
        return (int) functions.get("PlayerGangZoneFlash").call(playerid, zoneid, color);
    }

    public static int PlayerGangZoneStopFlash(int playerid, int zoneid) {
        return (int) functions.get("PlayerGangZoneStopFlash").call(playerid, zoneid);
    }

    public static int IsValidPlayerGangZone(int playerid, int zoneid) {
        return (int) functions.get("IsValidPlayerGangZone").call(playerid, zoneid);
    }

    public static int IsPlayerInPlayerGangZone(int playerid, int zoneid) {
        return (int) functions.get("IsPlayerInPlayerGangZone").call(playerid, zoneid);
    }

    public static int IsPlayerGangZoneVisible(int playerid, int zoneid) {
        return (int) functions.get("IsPlayerGangZoneVisible").call(playerid, zoneid);
    }

    public static int PlayerGangZoneGetColor(int playerid, int zoneid) {
        return (int) functions.get("PlayerGangZoneGetColor").call(playerid, zoneid);
    }

    public static int PlayerGangZoneGetFlashColor(int playerid, int zoneid) {
        return (int) functions.get("PlayerGangZoneGetFlashColor").call(playerid, zoneid);
    }

    public static int IsPlayerGangZoneFlashing(int playerid, int zoneid) {
        return (int) functions.get("IsPlayerGangZoneFlashing").call(playerid, zoneid);
    }

    public static int PlayerGangZoneGetPos(int playerid, int zoneid, ReferenceFloat fMinX, ReferenceFloat fMinY, ReferenceFloat fMaxX, ReferenceFloat fMaxY) {
        return (int) functions.get("PlayerGangZoneGetPos").call(playerid, zoneid, fMinX, fMinY, fMaxX, fMaxY);
    }

    public static int IsValidTextDraw(int textdrawid) {
        return (int) functions.get("IsValidTextDraw").call(textdrawid);
    }

    public static int IsTextDrawVisibleForPlayer(int playerid, int textdrawid) {
        return (int) functions.get("IsTextDrawVisibleForPlayer").call(playerid, textdrawid);
    }

    public static int TextDrawGetString(int textdrawid, ReferenceString text, int len) {
        return (int) functions.get("TextDrawGetString").call(textdrawid, text, len);
    }

    public static int TextDrawSetPos(int textdrawid, float fX, float fY) {
        return (int) functions.get("TextDrawSetPos").call(textdrawid, fX, fY);
    }

    public static int TextDrawGetLetterSize(int textdrawid, ReferenceFloat fX, ReferenceFloat fY) {
        return (int) functions.get("TextDrawGetLetterSize").call(textdrawid, fX, fY);
    }

    public static int TextDrawGetFontSize(int textdrawid, ReferenceFloat fX, ReferenceFloat fY) {
        return (int) functions.get("TextDrawGetFontSize").call(textdrawid, fX, fY);
    }

    public static int TextDrawGetPos(int textdrawid, ReferenceFloat fX, ReferenceFloat fY) {
        return (int) functions.get("TextDrawGetPos").call(textdrawid, fX, fY);
    }

    public static int TextDrawGetColor(int textdrawid) {
        return (int) functions.get("TextDrawGetColor").call(textdrawid);
    }

    public static int TextDrawGetBoxColor(int textdrawid) {
        return (int) functions.get("TextDrawGetBoxColor").call(textdrawid);
    }

    public static int TextDrawGetBackgroundColor(int textdrawid) {
        return (int) functions.get("TextDrawGetBackgroundColor").call(textdrawid);
    }

    public static int TextDrawGetShadow(int textdrawid) {
        return (int) functions.get("TextDrawGetShadow").call(textdrawid);
    }

    public static int TextDrawGetOutline(int textdrawid) {
        return (int) functions.get("TextDrawGetOutline").call(textdrawid);
    }

    public static int TextDrawGetFont(int textdrawid) {
        return (int) functions.get("TextDrawGetFont").call(textdrawid);
    }

    public static int TextDrawIsBox(int textdrawid) {
        return (int) functions.get("TextDrawIsBox").call(textdrawid);
    }

    public static int TextDrawIsProportional(int textdrawid) {
        return (int) functions.get("TextDrawIsProportional").call(textdrawid);
    }

    public static int TextDrawIsSelectable(int textdrawid) {
        return (int) functions.get("TextDrawIsSelectable").call(textdrawid);
    }

    public static int TextDrawGetAlignment(int textdrawid) {
        return (int) functions.get("TextDrawGetAlignment").call(textdrawid);
    }

    public static int TextDrawGetPreviewModel(int textdrawid) {
        return (int) functions.get("TextDrawGetPreviewModel").call(textdrawid);
    }

    public static int TextDrawGetPreviewRot(int textdrawid, ReferenceFloat fRotX, ReferenceFloat fRotY, ReferenceFloat fRotZ, ReferenceFloat fZoom) {
        return (int) functions.get("TextDrawGetPreviewRot").call(textdrawid, fRotX, fRotY, fRotZ, fZoom);
    }

    public static int TextDrawGetPreviewVehCol(int textdrawid, ReferenceInt color1, ReferenceInt color2) {
        return (int) functions.get("TextDrawGetPreviewVehCol").call(textdrawid, color1, color2);
    }

    public static int IsValidPlayerTextDraw(int playerid, int textdrawid) {
        return (int) functions.get("IsValidPlayerTextDraw").call(playerid, textdrawid);
    }

    public static int IsPlayerTextDrawVisible(int playerid, int textdrawid) {
        return (int) functions.get("IsPlayerTextDrawVisible").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawGetString(int playerid, int textdrawid, ReferenceString text, int len) {
        return (int) functions.get("PlayerTextDrawGetString").call(playerid, textdrawid, text, len);
    }

    public static int PlayerTextDrawSetPos(int playerid, int textdrawid, float fX, float fY) {
        return (int) functions.get("PlayerTextDrawSetPos").call(playerid, textdrawid, fX, fY);
    }

    public static int PlayerTextDrawGetLetterSize(int playerid, int textdrawid, ReferenceFloat fX, ReferenceFloat fY) {
        return (int) functions.get("PlayerTextDrawGetLetterSize").call(playerid, textdrawid, fX, fY);
    }

    public static int PlayerTextDrawGetFontSize(int playerid, int textdrawid, ReferenceFloat fX, ReferenceFloat fY) {
        return (int) functions.get("PlayerTextDrawGetFontSize").call(playerid, textdrawid, fX, fY);
    }

    public static int PlayerTextDrawGetPos(int playerid, int textdrawid, ReferenceFloat fX, ReferenceFloat fY) {
        return (int) functions.get("PlayerTextDrawGetPos").call(playerid, textdrawid, fX, fY);
    }

    public static int PlayerTextDrawGetColor(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawGetColor").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawGetBoxColor(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawGetBoxColor").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawGetBackgroundCol(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawGetBackgroundCol").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawGetShadow(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawGetShadow").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawGetOutline(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawGetOutline").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawGetFont(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawGetFont").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawIsBox(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawIsBox").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawIsProportional(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawIsProportional").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawIsSelectable(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawIsSelectable").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawGetAlignment(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawGetAlignment").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawGetPreviewModel(int playerid, int textdrawid) {
        return (int) functions.get("PlayerTextDrawGetPreviewModel").call(playerid, textdrawid);
    }

    public static int PlayerTextDrawGetPreviewRot(int playerid, int textdrawid, ReferenceFloat fRotX, ReferenceFloat fRotY, ReferenceFloat fRotZ, ReferenceFloat fZoom) {
        return (int) functions.get("PlayerTextDrawGetPreviewRot").call(playerid, textdrawid, fRotX, fRotY, fRotZ, fZoom);
    }

    public static int PlayerTextDrawGetPreviewVehCol(int playerid, int textdrawid, ReferenceInt color1, ReferenceInt color2) {
        return (int) functions.get("PlayerTextDrawGetPreviewVehCol").call(playerid, textdrawid, color1, color2);
    }

    public static int IsValid3DTextLabel(int id) {
        return (int) functions.get("IsValid3DTextLabel").call(id);
    }

    public static int Is3DTextLabelStreamedIn(int playerid, int id) {
        return (int) functions.get("Is3DTextLabelStreamedIn").call(playerid, id);
    }

    public static int Get3DTextLabelText(int id, ReferenceString text, int len) {
        return (int) functions.get("Get3DTextLabelText").call(id, text, len);
    }

    public static int Get3DTextLabelColor(int id) {
        return (int) functions.get("Get3DTextLabelColor").call(id);
    }

    public static int Get3DTextLabelPos(int id, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ) {
        return (int) functions.get("Get3DTextLabelPos").call(id, fX, fY, fZ);
    }

    public static float Get3DTextLabelDrawDistance(int id) {
        return (float) functions.get("Get3DTextLabelDrawDistance").call(id);
    }

    public static int Get3DTextLabelLOS(int id) {
        return (int) functions.get("Get3DTextLabelLOS").call(id);
    }

    public static int Get3DTextLabelVirtualWorld(int id) {
        return (int) functions.get("Get3DTextLabelVirtualWorld").call(id);
    }

    public static int Get3DTextLabelAttachedData(int id, ReferenceInt attached_playerid, ReferenceInt attached_vehicleid) {
        return (int) functions.get("Get3DTextLabelAttachedData").call(id, attached_playerid, attached_vehicleid);
    }

    public static int IsValidPlayer3DTextLabel(int playerid, int id) {
        return (int) functions.get("IsValidPlayer3DTextLabel").call(playerid, id);
    }

    public static int GetPlayer3DTextLabelText(int playerid, int id, ReferenceString text, int len) {
        return (int) functions.get("GetPlayer3DTextLabelText").call(playerid, id, text, len);
    }

    public static int GetPlayer3DTextLabelColor(int playerid, int id) {
        return (int) functions.get("GetPlayer3DTextLabelColor").call(playerid, id);
    }

    public static int GetPlayer3DTextLabelPos(int playerid, int id, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ) {
        return (int) functions.get("GetPlayer3DTextLabelPos").call(playerid, id, fX, fY, fZ);
    }

    public static float GetPlayer3DTextLabelDrawDist(int playerid, ReferenceFloat id) {
        return (float) functions.get("GetPlayer3DTextLabelDrawDist").call(playerid, id);
    }

    public static int GetPlayer3DTextLabelLOS(int playerid, int id) {
        return (int) functions.get("GetPlayer3DTextLabelLOS").call(playerid, id);
    }

    public static int GetPlayer3DTextLabelVirtualW(int playerid, int id) {
        return (int) functions.get("GetPlayer3DTextLabelVirtualW").call(playerid, id);
    }

    public static int GetPlayer3DTextLabelAttached(int playerid, int id, ReferenceInt attached_playerid, ReferenceInt attached_vehicleid) {
        return (int) functions.get("GetPlayer3DTextLabelAttached").call(playerid, id, attached_playerid, attached_vehicleid);
    }

    public static int IsMenuDisabled(int menuid) {
        return (int) functions.get("IsMenuDisabled").call(menuid);
    }

    public static int IsMenuRowDisabled(int menuid, int row) {
        return (int) functions.get("IsMenuRowDisabled").call(menuid, row);
    }

    public static int GetMenuColumns(int menuid) {
        return (int) functions.get("GetMenuColumns").call(menuid);
    }

    public static int GetMenuItems(int menuid, int column) {
        return (int) functions.get("GetMenuItems").call(menuid, column);
    }

    public static int GetMenuPos(int menuid, ReferenceFloat fX, ReferenceFloat fY) {
        return (int) functions.get("GetMenuPos").call(menuid, fX, fY);
    }

    public static int GetMenuColumnWidth(int menuid, ReferenceFloat fColumn1, ReferenceFloat fColumn2) {
        return (int) functions.get("GetMenuColumnWidth").call(menuid, fColumn1, fColumn2);
    }

    public static int GetMenuColumnHeader(int menuid, int column, ReferenceString header, int len) {
        return (int) functions.get("GetMenuColumnHeader").call(menuid, column, header, len);
    }

    public static int GetMenuItem(int menuid, int column, int itemid, ReferenceString item, int len) {
        return (int) functions.get("GetMenuItem").call(menuid, column, itemid, item, len);
    }

    public static int IsValidPickup(int pickupid) {
        return (int) functions.get("IsValidPickup").call(pickupid);
    }

    public static int IsPickupStreamedIn(int playerid, int pickupid) {
        return (int) functions.get("IsPickupStreamedIn").call(playerid, pickupid);
    }

    public static int GetPickupPos(int pickupid, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ) {
        return (int) functions.get("GetPickupPos").call(pickupid, fX, fY, fZ);
    }

    public static int GetPickupModel(int pickupid) {
        return (int) functions.get("GetPickupModel").call(pickupid);
    }

    public static int GetPickupType(int pickupid) {
        return (int) functions.get("GetPickupType").call(pickupid);
    }

    public static int GetPickupVirtualWorld(int pickupid) {
        return (int) functions.get("GetPickupVirtualWorld").call(pickupid);
    }

    public static int GetColCount() {
        return (int) functions.get("GetColCount").call();
    }

    public static float GetColSphereRadius(int modelid) {
        return (float) functions.get("GetColSphereRadius").call(modelid);
    }

    public static int GetColSphereOffset(int modelid, ReferenceFloat fX, ReferenceFloat fY, ReferenceFloat fZ) {
        return (int) functions.get("GetColSphereOffset").call(modelid, fX, fY, fZ);
    }

    public static int GetWeather() {
        return (int) functions.get("GetWeather").call();
    }

    public static int GetWeaponSlot(int weaponid) {
        return (int) functions.get("GetWeaponSlot").call(weaponid);
    }

}