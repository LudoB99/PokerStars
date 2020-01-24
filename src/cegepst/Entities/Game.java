package cegepst.Entities;

import cegepst.ChainOfResponsibiliy.CoR;
import cegepst.ChainOfResponsibiliy.RoyalFlush;
import cegepst.ChainOfResponsibiliy.StraightFlush;

import java.util.Scanner;

public class Game {
    private Deck deck;
    private Dealer dealer;
    private Player player = new Player();
    private Player opponent = new Player();
    private Scanner input;
    private Checker check;

    public Game() {
        input = new Scanner(System.in);
        check = new Checker();
    }

    public void start() {
        while (true) {
            deck = new Deck();
            dealer = new Dealer(deck);
            dealer.startRound(player, opponent);
            System.out.print("Voulez vous continuer (0) ou vous coucher (1) ? ");
            if(input.nextInt() == 1){ break; }
            System.out.print("Vous avez en main: ");
            player.showHole();
            dealer.showTurn();
            System.out.print("Voulez vous continuer (0) ou vous coucher (1) ? ");
            if(input.nextInt() == 1){ break; }
            System.out.print("Vous avez en main: ");
            player.showHole();
            dealer.showRiver();
            System.out.println("Le gagnant de la manche est...");
            check.process(player.getHole(), dealer.getCommunity());
            System.out.print("Voulez-vous continuer? y/n : ");
            if(!input.next().equals("y")){ break; }
        }
        System.out.println("Merci d'avoir joué!");
    }
}
