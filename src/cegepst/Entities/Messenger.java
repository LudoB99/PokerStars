package cegepst.Entities;

import java.util.ArrayList;

public class Messenger {

    public static void showCardsOnScreen(ArrayList<Card> cards) {
        for(Card card : cards)  {
            System.out.print(card.getCardName());
        }
    }

    public static void showPlayerHand(Hand hand) {
        for(Card card : hand.getHand()) {
            System.out.print(hand.getOwner());
        }
    }
}
