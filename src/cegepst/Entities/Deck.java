package cegepst.Entities;

import cegepst.Entities.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
    private final String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private final char[] types = {'♥', '♦', '♣', '♠'};

    public Deck() {
        cards = new ArrayList<>();
        getNewDeck();
    }

    public Card draw(int i) {
        Card card = cards.get(i);
        cards.remove(i);
        return card;
    }

    public void getNewDeck() {
        int id = 0;
        for(char type : types) {
            for(String value : values) {
                ++id;
                cards.add(new Card(id, value, type));
            }
        }
    }

    public void showDeck() {
        for(Card card : cards) {
            System.out.println(card.getDetail());
        }
    }

    public void sort() {
        cards.clear();
        getNewDeck();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getDeckSize() {
        return cards.size();
    }
}
