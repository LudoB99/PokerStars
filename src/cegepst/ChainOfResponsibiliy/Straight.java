package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class Straight extends CoR {

    private CoR next;

    @Override
    public void setNext(CoR next) {
        this.next = next;
    }

    @Override
    public boolean check(ArrayList<Card> hole, ArrayList<Card> community) {
        if(isStraight(hole, community)) {
            System.out.println("C'est un Straight!");
            return true;
        }

        if(next != null){
            System.out.println("Ce n'est pas un Straight.");
            return next.check(hole, community);
        }
        return false;
    }

    private boolean isStraight(ArrayList<Card> hole, ArrayList<Card> community) {
        return true;
    }
}
