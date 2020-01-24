package cegepst.Entities;

import cegepst.Entities.Card;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hole;

    public Player() {
        hole = new ArrayList<>();
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

    public void showHole() {
        for(Card card : hole) {
            System.out.print(card.getCardName());
        }
        System.out.println();
    }
}
