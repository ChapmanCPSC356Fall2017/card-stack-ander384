package com.example.christine.cardstack;

/**
 * Created by Christine on 9/29/2017.
 */

public class Card {
    private Suit suit;
    private int number;

    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public enum Suit {hearts, diamonds, spades, clubs};
}
