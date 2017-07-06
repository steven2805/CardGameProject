package com.example.stevenmacdonald.cardgameproject;

import org.junit.Before;
import org.junit.Test;

import static android.R.attr.value;
import static junit.framework.Assert.assertEquals;



public class CardTest {

    Card card;
    Game game;

    @Before
    public void before(){
        card = new Card();
        game = new Game();
    }

    @Test
    public void testingTheCardAreMade(){
        game.setupHands();
        String result = card.getCard(1);
        assertEquals("testing",result);
    }


}
