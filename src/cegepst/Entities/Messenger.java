package cegepst.Entities;

import java.util.ArrayList;

public class Messenger {

    public static void showCardsOnScreen(ArrayList<Card> cards) {
        for(Card card : cards)  {
            System.out.print(card.getCardName());
        }
    }

    public static void showPlayerHole(Player player) {
        System.out.print("Vous avez en main: ");
        player.showHole();
    }

    public static void showOpponentHole(Player player) {
        System.out.print("Votre adversaire a: ");
        player.showHole();
    }

    public static void showPlayerHand(Player player) {
        for(Card card : player.getHand().getHand()) {
            System.out.print(card.getCardName());
        }
    }

    public static void announceWinner(Player player) {
        System.out.print("Le gagnant de la manche est... ");
        System.out.println(player.getName() + " avec " + player.getHand().getNamedType() + "!");
    }

    public static void showEndMessage() {
        System.out.println("Merci d'avoir joué!");
    }

    public static void askIfContinue() {
        System.out.print("Voulez-vous continuer? y/n : ");
    }

    public static void askIfFolding() {
        System.out.print("Voulez vous continuer (0) ou vous coucher (1) ? ");
    }
}
