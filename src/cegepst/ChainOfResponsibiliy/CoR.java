package cegepst.ChainOfResponsibiliy;

import cegepst.Entities.Card;


import java.util.ArrayList;

public abstract class CoR {
    private CoR next;

    public CoR(CoR next) {
        this.next = next;
    }

    protected abstract boolean process(ArrayList<Card> cards);

    public boolean check(ArrayList<Card> cards){
        if(process(cards)) {
            System.out.println("C'est un " + this.getClass().getSimpleName());
            return true;
        }

        if(next != null) {
            //System.out.println("Ce n'est pas un " + this.getClass().getSimpleName() );
            return next.check(cards);
        }
        return false;
    }
}
