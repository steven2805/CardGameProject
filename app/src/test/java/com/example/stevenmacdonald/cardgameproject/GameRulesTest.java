package com.example.stevenmacdonald.cardgameproject;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


public class GameRulesTest {

    GameRules gamerules;

    @Before
    public void before(){
        gamerules = new GameRules();
    }

    @Test
    public void checkDefaultPlayerCount(){
        assertEquals(2,gamerules.getPlayercount());
    }


    @Test
    public void checkchangedPlayerCount(){
        gamerules.setPlayercount(4);
        assertEquals(4,gamerules.getPlayercount());
    }

    @Test
    public void checkDefaultCardsPerHand(){
        assertEquals(2, gamerules.getPlayercardsperhand());
    }


}
