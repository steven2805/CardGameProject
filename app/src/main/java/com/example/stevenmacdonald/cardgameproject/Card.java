package com.example.stevenmacdonald.cardgameproject;

/**
 * Created by stevenmacdonald on 08/07/2017.
 */

public class Card {
    private int value;
    private String name;
    private int resource;
    private int id;

    public Card(int id, int value, String name, int resource){
        this.value = value;
        this.name = name;
        this.resource = resource;
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public int getResource() {
        return resource;
    }

    public int getId() {
        return id;
    }
}
