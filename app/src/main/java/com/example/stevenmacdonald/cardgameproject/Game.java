package com.example.stevenmacdonald.cardgameproject;

import java.util.Random;
import java.util.concurrent.TimeUnit;


//import static android.R.attr.value;

/**
 * Created by stevenmacdonald on 06/07/2017.
 */

public class Game {

    private int[] holding = new int[4];



    public Game() {

    }

    public void setupHands() {
//        int[] holding = new int[4];
        Card deck = new Card();
        deck.getDeck();
        int counter = 0;
        while (counter < 4) {
            int temp = randomNumber();
            holding[counter] = temp;
            counter++;
        }
        setupPlayers();

    }

    public void setupPlayers(){

//        <<<<>>>><<<>>> might add in taking in username <<<>>><<<>>><<>

        int[] player1hand = new int[2];
        int[] player2hand = new int[2];

//              (src   , src-offset  , dest , offset, count)
        System.arraycopy(holding,0,player1hand,0,player1hand.length);
        System.arraycopy(holding,player1hand.length,player2hand,0, player2hand.length);

        Player player1 = new Player("Steven",player1hand);
        Player computer = new Player("computer",player2hand);
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
