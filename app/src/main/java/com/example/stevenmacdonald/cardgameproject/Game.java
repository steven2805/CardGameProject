package com.example.stevenmacdonald.cardgameproject;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by stevenmacdonald on 06/07/2017.
 */

public class Game {

    private Player player;
    private Card[] hand;


    public Game(HashMap deck) {
        this.deck = deck;
        this.hand = new Card[3];


    }

    public void setupHands(){
        Card deck = new Card();
        deck.getDeck();
        int counter = 0;
        while(counter < 4){
            Random rand = new Random();
            int  n = rand.nextInt(50);
            
        }

    }

}
