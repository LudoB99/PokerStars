package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class HighCard extends CoR {

    private CoR next;

    @Override
    public void setNext(CoR next) {
        this.next = next;
    }

    @Override
    public boolean check(ArrayList<Card> hole, ArrayList<Card> community) {
        System.out.println("C'est une High card!");
        return true;
    }
}
