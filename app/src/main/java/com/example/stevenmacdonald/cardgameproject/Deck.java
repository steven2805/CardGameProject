package com.example.stevenmacdonald.cardgameproject;
import android.content.ClipData;

import java.util.ArrayList;
import java.util.List;


public class Deck {

    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        populateDeck();
    }

    public List<Card> getDeck() {
        return deck;
    }

    public Card getCard(int id) {
        for(Card card:deck) {
            if(card.getId() == id)
                return card;
        }
        return null;
    }

    public int countDeck(){
        return deck.size();
    }

    public void populateDeck()
    {
        deck.add(new Card(0, 10,"charmander", R.drawable.charmander));
        deck.add(new Card(1, 5, "metapod", R.drawable.metapod));
        deck.add(new Card(2, 1, "placeholderball", R.drawable.placeholderball));
    }

}
