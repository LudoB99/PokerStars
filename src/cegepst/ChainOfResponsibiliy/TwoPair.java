package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class TwoPair extends CoR{

    private CoR next;

    @Override
    public void setNext(CoR next) {
        this.next = next;
    }

    @Override
    public boolean check(ArrayList<Card> hole, ArrayList<Card> community) {
        if(isTwoPair(hole, community)) {
            System.out.println("C'est un Two pair!");
            return true;
        }

        if(next != null){
            System.out.println("Ce n'est pas un Two pair.");
            return next.check(hole, community);
        }
        return false;
    }

    private boolean isTwoPair(ArrayList<Card> hole, ArrayList<Card> community) {
        return false;
    }
}
