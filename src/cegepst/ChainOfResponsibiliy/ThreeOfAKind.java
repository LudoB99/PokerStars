package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class ThreeOfAKind extends CoR {

    private CoR next;

    @Override
    public void setNext(CoR next) {
        this.next = next;
    }

    @Override
    public boolean check(ArrayList<Card> hole, ArrayList<Card> community) {
        if(isThreeOfAKind(hole, community)) {
            System.out.println("C'est un Three of a kind!");
            return true;
        }

        if(next != null){
            System.out.println("Ce n'est pas un Three of a kind.");
            return next.check(hole, community);
        }
        return false;
    }

    private boolean isThreeOfAKind(ArrayList<Card> hole, ArrayList<Card> community) {
        return false;
    }
}
