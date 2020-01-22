package cegepst;

import java.lang.annotation.Documented;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    private Deck deck;
    private Dealer dealer;
    private Player player = new Player();
    private Player opponent = new Player();
    private Scanner input;

    public Game() {
        input = new Scanner(System.in);
    }

    public void start() {
        deck = new Deck();
        dealer = new Dealer(deck);
        dealer.startRound(player, opponent);
        play();
    }

    public void play() {
        while (true){
            System.out.print("Voulez vous continuer (0) ou vous coucher (1) ? ");
            if(input.nextInt() == 1){ break; }
            dealer.showTurn();
            System.out.print("Voulez vous continuer (0) ou vous coucher (1) ? ");
            if(input.nextInt() == 1){ break; }
            dealer.showRiver();
            System.out.println("Voyons voir les résultats.");
        }
        System.out.println("Merci d'avoir joué!");
    }
}
