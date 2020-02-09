package cegepst.Entities;

import cegepst.Entities.Card;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    private ArrayList<Card> hole;
    private Hand hand;
    private int id;

    public Player() {
        hole = new ArrayList<>();
        id = new Random().nextInt();
    }

    public ArrayList<Card> getHole() {
        return hole;
    }

    public void receiveCard(Card card){
        hole.add(card);
    }

    public void reset() {
        for(Card card : hole) {
            card = null;
        }
    }

    public void setPlayerHand(ArrayList<Card> cards, int weight, String namedType) {
        this.hand = new Hand(cards, weight, namedType, this);
    }

    public Hand getHand() {
        return hand;
    }

    public int getId() {
        return id;
    }

    public void showHole() {
        for(Card card : hole) {
            System.out.print(card.getCardName());
        }
        System.out.println();
    }
}
