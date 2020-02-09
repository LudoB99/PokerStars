package cegepst.Entities;

import java.util.ArrayList;

public class Hand {
    private Player owner;
    private ArrayList<Card> hand;
    private int weight;
    private String namedType;

    public Hand(ArrayList<Card> hand, int weight, String namedType, Player owner) {
        this.hand = hand;
        this.weight = weight;
        this.namedType = namedType;
        this.owner = owner;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getWeight() {
        return weight;
    }

    public String getNamedType() {
        return namedType;
    }

    public Player getOwner() {
        return owner;
    }
}
