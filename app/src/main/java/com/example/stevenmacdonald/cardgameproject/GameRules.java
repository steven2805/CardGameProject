package com.example.stevenmacdonald.cardgameproject;

/**
 * Created by stevenmacdonald on 07/07/2017.
 */

public class GameRules {
    int playercount =  2;
    int playercardsperhand = 2;
    String wincriteria = "highest";


    public GameRules(){
        this.playercount = playercount;
        this.playercardsperhand = playercardsperhand;
        this.wincriteria = wincriteria;
    }

    public int getPlayercount() {
        return playercount;
    }

    public void setPlayercount(int playercount) {
        this.playercount = playercount;
    }

    public int getPlayercardsperhand() {
        return playercardsperhand;
    }

    public void setPlayercardsperhand(int playercardsperhand) {
        this.playercardsperhand = playercardsperhand;
    }

    public String getWincriteria() {
        return wincriteria;
    }

    public void setWincriteria(String wincriteria) {
        this.wincriteria = wincriteria;
    }
}
