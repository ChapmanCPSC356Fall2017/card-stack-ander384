package com.example.christine.cardstackproject;

/**
 * Created by Christine on 9/29/2017.
 */

public class Card {
    private int suit;
    private int number;

    Card(int theSuit, int theNumber)
    {
        suit = theSuit;
        number=theNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }
}
