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
public class InsertMediaState extends AbstractPlayerState {

    private static final Logger logger = LoggerFactory.getLogger(InsertMediaState.class);

    public InsertMediaState(Player player) {
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
        this.player.setState(new RewindState(this.player));
    }

    @Override
    public void skip() {
        this.player.setState(new SkipState(this.player));
    }

    @Override
    public void eject() {
        this.player.setState(new EjectState(this.player));
    }

    @Override
    public void insertMedia() {
        logger.info("Player already has media");
    }

    @Override
    public String printState() {
        return "Press play to listen to this media";
    }

}
