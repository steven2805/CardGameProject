package com.example.stevenmacdonald.cardgameproject;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();

    }

    @Test
    public void testingTheFirstCard(){
        assertEquals("charmander",deck.getCard(0).getName());
    }

    @Test
    public void checkCardCount(){
        assertEquals(3,deck.countDeck());
    }

    @Test
    public void checkCardValue(){
        assertEquals(5,deck.getCard(1).getValue());
    }

    @Test
    public void checkCardID(){
        assertEquals(2,deck.getCard(2).getId());
    }
}









