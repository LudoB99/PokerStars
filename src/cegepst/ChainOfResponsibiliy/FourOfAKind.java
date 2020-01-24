package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class FourOfAKind extends CoR{

    private CoR next;

    @Override
    public void setNext(CoR next) { this.next = next; }

    @Override
    public boolean check(ArrayList<Card> hole, ArrayList<Card> community) {
        if(isFourOfAKind(hole, community)) {
            System.out.println("C'est un Four of a kind!");
            return true;
        }

        if(next != null){
            System.out.println("Ce n'est pas un Four of a kind.");
            return next.check(hole, community);
        }
        return false;
    }

    private boolean isFourOfAKind(ArrayList<Card> hole, ArrayList<Card> community) {
        return false;
    }
}
