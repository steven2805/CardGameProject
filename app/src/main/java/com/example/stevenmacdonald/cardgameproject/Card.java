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
        deck.put(3,"placeholderball");
        deck.put(4,"placeholderball");
        deck.put(5,"placeholderball");
        deck.put(6,"placeholderball");
        deck.put(7,"placeholderball");
        deck.put(8,"placeholderball");
        deck.put(9,"placeholderball");
    }

}
