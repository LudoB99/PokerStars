package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class Straight extends CoR {

    public Straight(CoR next){
        super(next);
    }

    @Override
    public boolean process(ArrayList<Card> cards) {
        return true;
    }
}
