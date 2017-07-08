package com.example.stevenmacdonald.cardgameproject;

import org.junit.Before;
import org.junit.Test;

import static android.R.attr.value;
import static junit.framework.Assert.assertEquals;



public class CardTest {

    Card card;


    @Before
    public void before(){
        card = new Card();
        Game.getInstance().setupHands();
    }

    @Test
    public void testingTheCardAreMade(){
        Game.getInstance().setupHands();
        String result = card.getCard(1);
        assertEquals("testing",result);
    }


}
