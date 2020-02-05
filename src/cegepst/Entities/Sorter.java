package cegepst.Entities;

import java.util.ArrayList;
import java.util.Collections;

class Sorter {
    private ArrayList<Card> cards;

    public Sorter(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getSortedBySuit() {
        int i, j, min_j;

        for ( i = 0 ; i < cards.size() ; i ++ )
        {
            min_j = i;

            for ( j = i + 1 ; j < cards.size(); j++ )
            {
                if ( cards.get(j).getCardSuit() < cards.get(min_j).getCardSuit() )
                {
                    min_j = j;
                }
            }

            Card help = cards.get(i);
            cards.set(i, cards.get(min_j));
            cards.set(min_j, help);
        }
        return cards;
    }

    public ArrayList<Card> getSortedByRank() {
        int i, j, min_j;

        for ( i = 0 ; i < cards.size() ; i ++ )
        {

            min_j = i;

            for ( j = i + 1 ; j < cards.size() ; j++ )
            {
                if (cards.get(j).getCardRank() < cards.get(min_j).getCardRank()  )
                {
                    min_j = j;
                }
            }
            Card help = cards.get(i);
            cards.set(i, cards.get(min_j));
            cards.set(min_j, help);
        }
        return cards;
    }
}
