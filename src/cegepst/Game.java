package cegepst;

import java.lang.annotation.Documented;
import java.sql.SQLOutput;

public class Game {
    private Deck deck;
    private Player player = new Player();
    private Player opponent = new Player();
    private Card[] community = new Card[5];

    public void start() {
        deck = new Deck();
        deck.shuffle();
        deck.showDeck();
        dealCards(); //TODO: Faire une classe dealer;
    }

    //Testé
    private void dealCards() {
        int index = deck.getDeckSize() - 1;
        for(int i = index; i > index - 4; --i){
            if(i % 2 == 0) {
                player.receiveCard(deck.draw(i));
            }else{
                opponent.receiveCard(deck.draw(i));
            }
        }
        player.showHand();
        opponent.showHand();
        index = deck.getDeckSize() - 1;
        for(int i = 0; i < 5; ++i){
            community[i] = deck.draw(index);
            --index;
            System.out.println(community[i].getCardName());
        }
    }
}
