package cegepst.Entities;

public enum Suit {
    HEART('♥'),
    DIAMOND('♦'),
    CLUB('♣'),
    SPADE('♠');

    private char suit;

    Suit(char suit) {
        this.suit = suit;
    }

    public char getSuit() {
        return suit;
    }
}