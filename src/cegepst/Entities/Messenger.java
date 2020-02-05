package cegepst.Entities;

import java.util.ArrayList;

public class Messenger {

    public static void showCardsOnScreen(ArrayList<Card> cards) {
        for(Card card : cards)  {
            System.out.println(card.getCardName());
        }
    }
}
