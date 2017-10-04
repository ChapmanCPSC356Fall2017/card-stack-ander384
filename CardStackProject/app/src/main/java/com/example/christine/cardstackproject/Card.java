package com.example.christine.cardstackproject;

/**
 * Created by Christine on 9/29/2017.
 */

class Card {
    private int suit;
    private int number;

    Card(int theSuit, int theNumber)
    {
        suit = theSuit;
        number=theNumber;
    }

    int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }
}
