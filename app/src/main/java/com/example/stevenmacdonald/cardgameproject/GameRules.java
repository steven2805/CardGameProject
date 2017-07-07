package com.example.stevenmacdonald.cardgameproject;


public class GameRules {
    public int playercount;
    public int playercardsperhand;
    public String wincriteria;


    public GameRules(){
        this.playercount = 2;
        this.playercardsperhand = 2;
        this.wincriteria = "highest";
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
