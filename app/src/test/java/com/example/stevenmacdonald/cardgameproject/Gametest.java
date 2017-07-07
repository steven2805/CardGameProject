package com.example.stevenmacdonald.cardgameproject;

import android.util.Range;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


public class Gametest {

    Card card;
    Game game;
    Player player1;
    Player computer;


   @Before
   public void before(){
       game = new Game();
       int[] array1 = new int[]{10,8};
       int[] array2 = new int[]{2,6};
       this.player1 = new Player("Steven",array1);
       this.computer = new Player("masterrace",array2);

    }

    @Test
    public void checkingThePlayersHand(){
        game.setupHands();
        game.getPlayersCards(game.player1.hand);
        assertNotNull(game.player1.hand);
    }

    @Test
    public void checkWhoWins(){
        assertEquals("Steven wins",game.whoWins(player1,computer));
    }
}
