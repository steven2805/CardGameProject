package com.example.stevenmacdonald.cardgameproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


public class Gametest {


   @Before
   public void before(){
       Game.getInstance().setupGame();
    }

    @Test
    public void checkingThePlayersHand(){
        Game.getInstance().getCardNames(Game.getInstance().player1.hand);
        assertNotNull(Game.getInstance().player1.hand);
    }

    @Test
    public void checkWhoWins(){
        assertEquals("Steven wins",Game.getInstance().whoWins(1,3,true));
    }

    @Test
    public void checkRuleChangeisWorking(){
        assertEquals("Steven wins",Game.getInstance().whoWins(3,1,false));
    }
}
