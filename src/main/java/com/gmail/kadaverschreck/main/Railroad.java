package com.gmail.kadaverschreck.main;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.*;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id="railroad", name="Railroad", version="0.1", authors = "Kadaverschreck",
        url = "https://github.com/Kadaverschreck/Railroad")


public class Railroad {

    @Inject
    private Logger logger;

    @Listener
    public void preInit(GamePreInitializationEvent event){

    }

    @Listener
    public void postInit(GamePostInitializationEvent event) {

    }

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        logger.info("Railroad has started!");
    }

    @Listener
    public void onServerStop(GameStoppedServerEvent event) {
        logger.info("Railroad has stopped!");
    }

    @Listener
    public void onInit(GameInitializationEvent event) {



    }



}
