package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class FullHouse extends CoR {

    private CoR next;

    @Override
    public void setNext(CoR next) {
        this.next = next;
    }

    @Override
    public boolean check(ArrayList<Card> hole, ArrayList<Card> community) {
        if(isFullHouse(hole, community)) {
            System.out.println("C'est un Full house!");
            return true;
        }

        if(next != null){
            System.out.println("Ce n'est pas un Full house.");
            return next.check(hole, community);
        }
        return false;
    }

    private boolean isFullHouse(ArrayList<Card> hole, ArrayList<Card> community) {
        return false;
    }
}
