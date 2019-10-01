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
public class PlayState extends AbstractPlayerState{

    private static final Logger logger = LoggerFactory.getLogger(PlayState.class);
    
    private boolean isPlaying;

    public PlayState(Player player) {
        super(player);
        this.isPlaying = true;
    }

    @Override
    public void playPause() {
        this.isPlaying = !this.isPlaying;
        this.player.setState(this);
    }

    @Override
    public void stop() {
        this.player.setState(new StopState(this.player));
    }

    @Override
    public void rewind() {
        this.player.setState(new RewindState(this.player));
    }

    @Override
    public void skip() {
        this.player.setState(new SkipState(this.player));
    }

    @Override
    public void eject() {
        logger.info("Unable to eject media while music is playing.");
    }

    @Override
    public void insertMedia() {
        logger.info("Unable to insert media while music is playing.");
    }

    @Override
    public String printState() {
        return this.isPlaying ? "Music is playing": "Music is paused";
    }

}
