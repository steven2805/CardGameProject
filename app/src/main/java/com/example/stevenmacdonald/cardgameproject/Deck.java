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
        deck.add(new Card(0, 4,"charmander", R.drawable.charmander));
        deck.add(new Card(1, 1, "metapod", R.drawable.metapod));
        deck.add(new Card(2, 11, "Blastoise", R.drawable.blastoise));
        deck.add(new Card(3, 10, "Pidgeot",R.drawable.pidgeot));
        deck.add(new Card(4, 2, "Sandshrew", R.drawable.sandshrew));
        deck.add(new Card(5, 3, "Zobat", R.drawable.zubat));
        deck.add(new Card(6, 5, "paras", R.drawable.paras));
        deck.add(new Card(7, 6, "dugtrio", R.drawable.dugtrio));
        deck.add(new Card(8, 7, "persian", R.drawable.persian));
        deck.add(new Card(9, 9, "Arcanine", R.drawable.arcanine));
        deck.add(new Card(10,11, "pikachu", R.drawable.pikachu));

    }

}
