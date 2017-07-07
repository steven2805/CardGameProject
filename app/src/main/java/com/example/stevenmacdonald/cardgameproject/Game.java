package com.example.stevenmacdonald.cardgameproject;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Game {

    private int[] holding = new int[6];
    public Player player1;
    public Player computer;
    public Card card;
    Card deck = new Card();



    public Game() {
       this.player1 = new Player(null,null);
        this.computer = new Player(null,null);


    }

    public void setupHands() {
        deck.getDeck();
        int counter = 0;
        while (counter < 6) {
            int temp = randomNumber();
            holding[counter] = temp;
            counter++;
        }
        setupPlayers();
    }


    public void setupPlayers(){
        int[] player1hand = new int[3];
        int[] player2hand = new int[3];
//              (src   , src-offset  , dest , offset, count)
        System.arraycopy(holding,0,player1hand,0,player1hand.length);
        System.arraycopy(holding,player1hand.length,player2hand,0, player2hand.length);

        this.player1 = new Player("Steven",player1hand);
        this.computer = new Player("computer",player2hand);
    }

    public String[] getPlayersCardNames(int playercardid[]){

    String[] array = new String[3];
//    Card deck = new Card();
        int count = 0;
        for(int cardnumber: playercardid) {
            String cardtitle = deck.getCard(cardnumber);
            array[count] = cardtitle;
            count ++;
        }
        return array;
    }


    public String whoWins(Player player1,Player computer){
         int player1handtotal = player1.hand[0] + player1.hand[1];
         int computerhandtotal = computer.hand[0] + computer.hand[1];

        if(player1handtotal == computerhandtotal) return "draw";
        else if(player1handtotal > computerhandtotal)return player1.name + " wins";
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
        int temp = rand.nextInt(7); //<<<<<<<<<<<<<<<<increase this steven
        return temp;
    }
}
