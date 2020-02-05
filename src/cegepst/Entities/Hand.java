package cegepst.Entities;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;
    private int weight;

    public Hand(ArrayList<Card> hand, int weight) {
        this.hand = hand;
        this.weight = weight;
    }
}
