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
public class SkipState extends AbstractPlayerState{

    private static final Logger logger = LoggerFactory.getLogger(SkipState.class);
    
    private static final int MAX_SKIP_SPEED = 3;
    private int skipSpeed = 1;

    public SkipState(Player player) {
        super(player);
    }

    @Override
    public void playPause() {
        this.player.setState(new PlayState(this.player));
    }

    @Override
    public void stop() {
        this.skipSpeed = 0;
        this.player.setState(new StopState(this.player));
    }

    @Override
    public void rewind() {
        this.skipSpeed = 0;
        this.player.setState(new RewindState(this.player));
    }

    @Override
    public void skip() {
        this.skipSpeed = this.skipSpeed < MAX_SKIP_SPEED ? this.skipSpeed++ : 1;
        this.player.setState(this);
    }

    @Override
    public void eject() {
        logger.info("Unable to eject, skipping...");
    }

    @Override
    public void insertMedia() {
        logger.info("Unable to insert media, skipping...");
    }

    @Override
    public String printState() {
       return String.format("Skipping at %sx speed",this.skipSpeed);
    }

}
