package com.example.stevenmacdonald.cardgameproject;

/**
 * Created by stevenmacdonald on 06/07/2017.
 */

public class Player {

    public String name;
    public int[] hand;
    public int powerup;

    public Player(String name, int hand[])
    {
        this.name = name;
        this.hand = hand;
        this.powerup = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getHand() {
        return hand;
    }

    public void setHand(int[] hand) {
        this.hand = hand;
    }

    public int getPowerup() {
        return powerup;
    }

    public void setPowerup(int powerup) {
        this.powerup = powerup;
    }
}
