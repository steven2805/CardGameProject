package com.example.stevenmacdonald.cardgameproject;
import java.util.HashMap;


public class Card {

    public HashMap<Integer,String> deck = new HashMap();

    public Card() {
        populateDeck();
    }

    public HashMap<Integer, String> getDeck() {
        return deck;
    }

    public String getCard(int value) {
        String var = deck.get(value);
        return var;
    }

    public void populateDeck()
    {
        deck.put(1,"testing");
        deck.put(2,"testing2");
        deck.put(3,"testing3");
    }
}
