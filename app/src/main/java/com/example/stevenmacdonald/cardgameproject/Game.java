package com.example.stevenmacdonald.cardgameproject;

import java.util.Random;
import java.util.concurrent.TimeUnit;


/**
 * Created by stevenmacdonald on 06/07/2017.
 */

public class Game {

    private int[] holding = new int[4];
    public Player player1;
    public Player computer;
//    Card card;


    public Game() {
       this.player1 = new Player(null,null);
        this.computer = new Player(null,null);
//        card = new Card;

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

//    public String getCardValues(){
//        int pcard = player.hand[0];
//        String pcardfinal = card.getCard(pcard);
//        return pcardfinal;
//       <<<>>>><<<<>>><<<>>< you are heer  <<<<>>>><<<<>>>?><><><><
//    }



    public void setupPlayers(){
//        <<<<>>>><<<>>> might add in taking in username <<<>>><<<>>><<>
        int[] player1hand = new int[2];
        int[] player2hand = new int[2];
//              (src   , src-offset  , dest , offset, count)
        System.arraycopy(holding,0,player1hand,0,player1hand.length);
        System.arraycopy(holding,player1hand.length,player2hand,0, player2hand.length);

        this.player1 = new Player("Steven",player1hand);
        this.computer = new Player("computer",player2hand);
    }


    public String whoWins(){
        int player1handtotal = player1.hand[0] + player1.hand[1];
        int computerhandtotal = computer.hand[0] + computer.hand[1];

        if(player1handtotal == computerhandtotal) return "draw";
        else if(player1handtotal > computerhandtotal)return player1.name + "wins";
        else return "You lose play again";
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
