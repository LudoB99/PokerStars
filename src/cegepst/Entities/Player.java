package cegepst.Entities;

import cegepst.Entities.Card;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    private ArrayList<Card> hole;
    private Hand hand;
    private String name;

    public Player(String name) {
        hole = new ArrayList<>();
        this.name = name;
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

    public void setHole(ArrayList<Card> hole) {
        this.hole = hole;
    }

    public void setPlayerHand(ArrayList<Card> cards, String namedType) {
        int weight = (new WeightCalculator(cards, namedType)).getWeight();
        String name = Name.valueOf(namedType.toUpperCase()).getName();
        this.hand = new Hand(cards, weight, name, this);
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {return name;}

    public void showHole() {
        for(Card card : hole) {
            System.out.print(card.getCardName());
        }
        System.out.println();
    }

    public ArrayList<Card> getValidCards() {
        ArrayList<Card> result = new ArrayList<Card>();
        for(Card card : hole) {
            if(card.isInHand()){
                result.add(card);
            }
        }
        return result;
    }
}
