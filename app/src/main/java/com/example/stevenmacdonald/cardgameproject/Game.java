package com.example.stevenmacdonald.cardgameproject;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;


import static android.R.attr.value;

/**
 * Created by stevenmacdonald on 06/07/2017.
 */

public class Game {

    private Player player;
    private Card[] hand;
    int[] holding = new int[4];


    public Game() {

        this.hand = new Card[3];



    }

    public void setupHands() {
        int[] holding = new int[4];
        Card deck = new Card();
        deck.getDeck();
        int counter = 0;
        while (counter < 4) {
            int temp = randomNumber();
            holding[counter] = temp;
            counter++;


        }
    }

        private int randomNumber() {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random rand = new Random();
            rand.setSeed(System.currentTimeMillis());
            int temp = rand.nextInt(20);
            return temp;

    }







}
