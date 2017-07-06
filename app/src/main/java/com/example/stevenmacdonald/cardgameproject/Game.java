package com.example.stevenmacdonald.cardgameproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


import static android.R.attr.value;

/**
 * Created by stevenmacdonald on 06/07/2017.
 */

public class Game {

    private Player player;
    private Card[] hand;


    public Game() {

        this.hand = new Card[3];


    }

    public void setupHands(){
        int[] holding = new int[10];
        Card deck = new Card();
        deck.getDeck();
        int counter = 0;
        while(counter < 10){
            Random rand = new Random();
            rand.setSeed(System.currentTimeMillis());
            int  temp = rand.nextInt(50);
            holding[counter] = temp;
            counter ++;









        }

    }

}
