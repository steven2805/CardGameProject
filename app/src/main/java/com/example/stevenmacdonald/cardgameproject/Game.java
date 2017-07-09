package com.example.stevenmacdonald.cardgameproject;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Game {

    private static Game instance;

    private int[] holding = new int[6];
    public Player player1, computer;
    public Deck deck;
    public int playerScore,computerScore,drawCounter;
    public boolean tutorial;


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
        this.tutorial = false;
    }



    public void setTutorial(boolean value){
        this.tutorial = value;
    }

    public boolean getTutorialStatues(){
        return this.tutorial;
    }


// creates an array of 6 cards from the deck
    public void setupGame() {
        this.playerScore = 0;
        this.computerScore = 0;
        this.drawCounter = 0;
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

//******* REDUNDANT CODE FOR TESTING*********
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


// simple comparison of who has the highest numbered CARD
    public String whoWins(int playercard, int computercard){
        int player = playercard;
        int cmp = computercard;
        if(player == cmp) {
            drawCounter ++;
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
        if(playerScore + computerScore + drawCounter == 3){
            if (playerScore > computerScore) {
                return player1;}
            else
                {return computer;}
            }
        else if(playerScore == 3){
            return player1;
        }else if(computerScore == 3){
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
