package net.gtaun.shoebill;

import net.gtaun.shoebill.amx.AmxInstance;
import net.gtaun.shoebill.amx.AmxInstanceManager;
import net.gtaun.shoebill.resource.Plugin;

/**
 * Created by marvin on 21.02.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class YSFWrapper extends Plugin {
    @Override
    protected void onEnable() throws Throwable {
        Functions.registerFunctions(AmxInstance.getDefault());
        Callbacks.registerHandlers(AmxInstanceManager.get(), getEventManager());
    }

    @Override
    protected void onDisable() throws Throwable {
        Callbacks.unregisterHandlers(AmxInstanceManager.get());
    }
}
