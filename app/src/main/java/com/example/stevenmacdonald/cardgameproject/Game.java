package com.example.stevenmacdonald.cardgameproject;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Game {

    private static Game instance;

    private int[] holding = new int[6];
    public Player player1, computer;
    public Deck deck;
    public int playerScore,computerScore;


    public static Game getInstance(){
        if(instance == null){
            instance = new Game();
        }
        return instance;
    }


    private Game() {
        this.player1 = new Player(null,null);
        this.computer = new Player(null,null);
        this.deck = new Deck();
    }
// creates an array of 6 cards
    public void setupGame() {
        this.playerScore = 0;
        this.computerScore = 0;
        int counter = 0;
        while (counter < 6) {
            int temp = deck.getDeck().get(randomNumber(deck.countDeck())).getId();
            holding[counter] = temp;
            counter++;
        }
        setupPlayers();
    }


// Self-explanatory
    public void setupPlayers(){
        int[] player1hand = new int[3];
        int[] player2hand = new int[3];
//              (src   , src-offset  , dest , offset, count)
        System.arraycopy(holding,0,player1hand,0,player1hand.length);
        System.arraycopy(holding,player1hand.length,player2hand,0, player2hand.length);
        this.player1 = new Player("Steven",player1hand);
        this.computer = new Player("MasterRace",player2hand);
    }

// recovering the names of the cards that the player has
    public String[] getCardNames(int playercardid[]){
        String[] array = new String[3];
        int count = 0;
        for(int cardnumber: playercardid) {
            String cardtitle = deck.getCard(cardnumber).getName();
            array[count] = cardtitle;
            count ++;
        }
        return array;
    }

// return a number between 1-3 for the computer to put against the player..
//    public int computerPickACard(){
//        int[] array = new int[]{1,2,3};
//        int rand = randomNumber(3);
//        int returnvalue = rand;
//        if(array[rand] == 9999)
//        {
//            computerPickACard();
//        }
//        array[rand] = 9999;
//        return returnvalue;
//    }

// simple comparison of who has the highest numbered deck
    public String whoWins(int playercard, int computercard){
        int player = playercard;
        int cmp = computercard;
        if(player == cmp) {
            return "draw";
        }
        else if(player > cmp){
            playerScore ++;
            return player1.name + " wins";
        }
        else {
            computerScore++;
            return "You lose play again";
        }

    }

    public Player whoWinsTheGame(){
        if(playerScore == 1){
            return player1;
        }else if(computerScore == 1){
            return computer;
        }else{
            return null;
        }
    }

// random number generation (takes a value in to set the maximum value possible)
    private int randomNumber(int randomlimit) {
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        return rand.nextInt(randomlimit);
    }
}
