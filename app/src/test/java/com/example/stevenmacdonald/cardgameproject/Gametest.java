package com.example.stevenmacdonald.cardgameproject;

import android.util.Range;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by stevenmacdonald on 06/07/2017.
 */

public class Gametest {

    Card card;
    Game game;


   @Before
   public void before(){
        game = new Game();
    }



    @Test
    public void checkingThePlayersHand(){
        game.setupHands();
        assertNotNull(game.player1.hand);
    }
}
