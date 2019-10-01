/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arcus.state.demo.domain;

import com.arcus.state.demo.implementations.EjectState;
import com.arcus.state.demo.interfaces.PlayerState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author saind
 */
public class Player implements PlayerState{

    private static final Logger logger = LoggerFactory.getLogger(Player.class);
    
    private PlayerState state;
    
    public Player(){
        this.state = new EjectState(this);
    }

    @Override
    public void playPause() {
        this.state.playPause();
    }

    @Override
    public void stop() {
        this.state.stop();
    }

    @Override
    public void rewind() {
        this.state.rewind();
    }

    @Override
    public void skip() {
        this.state.skip();
    }

    @Override
    public void eject() {
       this.state.eject();
    }

    @Override
    public void insertMedia() {
        this.state.insertMedia();
    }

    @Override
    public String printState() {
        return this.state.printState();
    }

    /**
     * @return the state
     */
    public PlayerState getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(PlayerState state) {
        this.state = state;
    }

}
