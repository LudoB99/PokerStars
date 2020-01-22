package cegepst;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }


    public void receiveCard(Card card){
        hand.add(card);
    }

    /*public void reset() {
        for(Card card : hand) {
            card = null;
        }
    }*/


    public void showHand() {
        for(Card card : hand) {
            System.out.println(card.getCardName());
        }
    }
}
