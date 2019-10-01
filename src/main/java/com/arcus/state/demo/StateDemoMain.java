/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arcus.state.demo;

import com.arcus.state.demo.domain.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author saind
 */
public class StateDemoMain {
    
    private static final Logger logger = LoggerFactory.getLogger(StateDemoMain.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player p = new Player();
       p.insertMedia();
       p.playPause();
       logger.info(p.printState());
       p.skip();
       p.skip();
       p.skip();
       logger.info(p.printState());
       p.eject();
       logger.info(p.printState());
    }
    
}
