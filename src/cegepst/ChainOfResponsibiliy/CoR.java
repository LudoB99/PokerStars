package cegepst.ChainOfResponsibiliy;

import cegepst.Entities.Card;


import java.util.ArrayList;

public abstract class CoR {
    private CoR next;

    public CoR(CoR next) {
        this.next = next;
    }

    public abstract boolean process(ArrayList<Card> cards);

    public boolean check(ArrayList<Card> cards){
        if(process(cards)) { // Si le check retourne vrai, la chaine arrête.
            System.out.println("C'est un " + this.getClass().getSimpleName());
            return true;
        }

        if(next != null) { // Si le check retourne false et qu'il y a un prochain noeud, on continue.
            System.out.println("Ce n'est pas un " + this.getClass().getSimpleName() );
            return next.check(cards);
        }

        return false; //S'il n'y a pas de prochain noeud, on arrête. (Fin de la chaîne)
    }
}
