package com.example.stevenmacdonald.cardgameproject;
import android.content.ClipData;

import java.util.HashMap;
import java.util.List;


public class Card {

    public HashMap<Integer,String> deck = new HashMap();

    public Card() {
        populateDeck();
    }

    public HashMap<Integer, String> getDeck() {
        return deck;
    }

    public String getCard(int value) {
        return deck.get(value);
    }

    public int countDeck(){
        int total = 0;
        for (String something : deck.values()) {
            total ++;
        }
        return total;
    }

    public void populateDeck()
    {
        deck.put(1,"charmander");
        deck.put(2,"metapod");
        deck.put(3,"testing3");
        deck.put(4,"testing4");
        deck.put(5,"testing5");
        deck.put(6,"testing6");
        deck.put(7,"testing7");
        deck.put(8,"testing8");
        deck.put(9,"testing9");
    }

}
