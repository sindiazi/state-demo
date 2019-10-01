/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arcus.state.demo.implementations;

import com.arcus.state.demo.domain.Player;
import com.arcus.state.demo.interfaces.PlayerState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author saind
 */
public abstract class AbstractPlayerState implements PlayerState{

    private static final Logger logger = LoggerFactory.getLogger(AbstractPlayerState.class);
    
    protected Player player;
    
    public AbstractPlayerState(Player player){
        this.player = player;
    }

}
