package cegepst.Entities;

import java.util.ArrayList;

public class Dealer {
    private Deck deck;
    private ArrayList<Card> community;

    public Dealer(Deck deck) {
        this.deck = deck;
        community = new ArrayList<>();
    }

    public void startRound(Player player, Player opponent) {
        System.out.println("La partie va commencer.");
        deck.shuffle();
        System.out.println("Les cartes sont mélangées, je vais les distribuer.");
        deal(player, opponent);
        setupTable();
        showFlop();
    }

    public void deal(Player player, Player opponent) {
        int index = deck.getDeckSize() - 1;
        for(int i = index; i > index - 4; --i){
            if(i % 2 == 0) {
                player.receiveCard(deck.draw(i));
            }else{
                opponent.receiveCard(deck.draw(i));
            }
        }
        System.out.print("Vous avez en main: ");
        player.showHole();
    }

    public void setupTable() {
        for(int i = 1; i < 8; ++i){
            if(i != 3 && i != 5){
                community.add(deck.draw(deck.getDeckSize() - i));
            }
        }
    }

    public void showFlop() {
        System.out.print("Il y a sur la table : ");
        for(short i = 0; i < 3; ++i){
            System.out.print(community.get(i).getCardName());
        }
        System.out.println();
    }

    public void showTurn() {
        System.out.print("Je révèle la 4e carte: ");
        for(short i = 0; i < 3; ++i){
            System.out.print(community.get(i).getCardName());
        }
        System.out.println(community.get(3).getCardName());
    }

    public void showRiver() {
        System.out.print("Je révèle la 5e carte: ");
        for(short i = 0; i < 4; ++i){
            System.out.print(community.get(i).getCardName());
        }
        System.out.println(community.get(4).getCardName());
    }

    public void showTable() {
        for(short i = 0; i < 5; ++i){
            System.out.print(community.get(i).getCardName() + " ");
        }
    }

    public ArrayList<Card> getCommunity() {
        return community;
    }
}
