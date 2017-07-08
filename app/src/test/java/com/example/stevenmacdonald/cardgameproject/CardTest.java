package com.example.stevenmacdonald.cardgameproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;



public class CardTest {

    Deck deck;


    @Before
    public void before(){
        deck = new Deck();
        Game.getInstance().setupGame();
    }

    @Test
    public void testingTheCardAreMade(){
        Game.getInstance().setupGame();
        String result = deck.getCard(1);
        assertEquals("testing",result);
    }


}
