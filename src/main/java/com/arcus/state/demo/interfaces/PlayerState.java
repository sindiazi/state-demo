/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arcus.state.demo.interfaces;

/**
 *
 * @author saind
 */
public interface PlayerState {
    
    public void playPause();
    
    public void stop();
    
    public void rewind();
    
    public void skip();
    
    public void eject();
    
    public void insertMedia();
    
    public String printState();
    
}
