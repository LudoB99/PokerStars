package cegepst.Entities;

import java.util.ArrayList;

public class WeightCalculator {
    ArrayList<Card> hand;
    String name;

    public WeightCalculator(ArrayList<Card> hand, String name) {
        this.hand = hand;
        this.name = name;
    }

    public int getWeight() {
        System.out.print("Début du calcul pour la main : ");
        Messenger.showCardsOnScreen(hand);
        System.out.println();
        int ranking = Name.valueOf(name.toUpperCase()).getRank();
        return ranking;
    }
}
