/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arcus.state.demo.implementations;

import com.arcus.state.demo.domain.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author saind
 */
public class EjectState extends AbstractPlayerState {

    private static final Logger logger = LoggerFactory.getLogger(EjectState.class);
    
    private boolean mediaEjected;

    public EjectState(Player player) {
        super(player);
        this.mediaEjected = true;
    }

    @Override
    public void playPause() {
        logger.info("Please insert media");
    }

    @Override
    public void stop() {
       logger.info("Please insert media");
    }

    @Override
    public void rewind() {
        logger.info("Please insert media");
    }

    @Override
    public void skip() {
        logger.info("Please insert media");
    }

    @Override
    public void eject() {
        logger.info("Media already ejected");
    }

    @Override
    public void insertMedia() {
        this.player.setState(new InsertMediaState(this.player));
    }

    @Override
    public String printState() {
        return "Player has no media. Please insert media";
    }

}
