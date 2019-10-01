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
public class RewindState extends AbstractPlayerState{

    private static final Logger logger = LoggerFactory.getLogger(RewindState.class);
    
    private static int MAX_REWIND_SPEED = 3;
    private int rewindSpeed = 1;

    public RewindState(Player player) {
        super(player);
    }

    @Override
    public void playPause() {
        this.player.setState(new PlayState(this.player));
    }

    @Override
    public void stop() {
        this.player.setState(new StopState(this.player));
    }

    @Override
    public void rewind() {
        this.rewindSpeed += this.rewindSpeed < MAX_REWIND_SPEED ? this.rewindSpeed++ : 1;
        this.player.setState(this);
    }

    @Override
    public void skip() {
        this.rewindSpeed = 0;
        this.player.setState(new SkipState(this.player));
    }

    @Override
    public void eject() {
        logger.info("Unable to eject, rewinding ...");
    }

    @Override
    public void insertMedia() {
        logger.info("Unable to insert media, rewinding ...");
    }

    @Override
    public String printState() {
        return String.format("Rewinding media at %sx speed", this.rewindSpeed);
    }

}
