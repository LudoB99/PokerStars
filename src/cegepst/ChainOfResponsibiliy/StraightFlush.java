package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class StraightFlush extends CoR {

    private CoR next;

    @Override
    public void setNext(CoR next) {
        this.next = next;
    }

    @Override
    public boolean check(ArrayList<Card> hole, ArrayList<Card> community) {
        if(isStraightFlush(hole, community)) {
            System.out.println("C'est une Straight Flush!");
            return true;
        }

        if(next != null){
            System.out.println("Ce n'est pas une Straight Flush.");
            return next.check(hole, community);
        }
        return false;
    }

    private boolean isStraightFlush(ArrayList<Card> hole, ArrayList<Card> community) {
        return false;
    }
}
