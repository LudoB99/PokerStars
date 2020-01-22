package cegepst;

public class Dealer {
    private Deck deck;
    private Card[] community = new Card[5];

    public Dealer(Deck deck) {
        this.deck = deck;
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
        System.out.println("Vous avez en main: ");
        player.showHole();
    }

    public void setupTable() {
        int index = 0;
        for(int i = 1; i < 8; ++i){
            if(i != 3 && i != 5){
                community[index] = deck.draw(deck.getDeckSize() - i);
                ++index;
            }
        }
    }

    public void showFlop() {
        System.out.println("Il y a sur la table :");
        for(short i = 0; i < 3; ++i){
            System.out.println(community[i].getCardName());
        }
        System.out.println("Faites vos jeux!");
    }

    public void showTurn() {
        System.out.println("Je révèle la 4e carte: ");
        System.out.println(community[3].getCardName());
    }

    public void showRiver() {
        System.out.println("Je révèle la 5e carte: ");
        System.out.println(community[4].getCardName());
    }
}
