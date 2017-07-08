package com.example.stevenmacdonald.cardgameproject;

import android.util.Range;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


public class Gametest {

    Card card;
    Player player1;
    Player computer;


   @Before
   public void before(){
       Game.getInstance().setupHands();
       int[] array1 = new int[]{3,8,3};
       int[] array2 = new int[]{2,6,1};
       this.player1 = new Player("Steven",array1);
       this.computer = new Player("masterrace",array2);

    }

    @Test
    public void checkingThePlayersHand(){
        Game.getInstance().getCardNames(Game.getInstance().player1.hand);
        assertNotNull(Game.getInstance().player1.hand);
    }

    @Test
    public void checkWhoWins(){
        assertEquals("Steven wins",Game.getInstance().whoWins(3,1));
    }
}
