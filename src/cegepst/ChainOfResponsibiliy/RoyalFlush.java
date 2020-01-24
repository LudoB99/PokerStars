package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class RoyalFlush extends CoR {

    private CoR next;

    @Override
    public void setNext(CoR next) {
        this.next = next;
    }

    @Override
    public boolean check(ArrayList<Card> hole, ArrayList<Card> community) {
        if(isRoyalFlush(hole, community)) {
            System.out.println("C'est une Royal Flush!");
            return true;
        }

        if(next != null){
            System.out.println("Ce n'est pas une Royal Flush.");
            return next.check(hole, community);
        }

        return false;
    }

    private boolean isRoyalFlush(ArrayList<Card> hole, ArrayList<Card> community) {
        return false;
    }
}
