package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class StraightFlush extends CoR {

    public StraightFlush(CoR next){
        super(next);
    }

    @Override
    public boolean process(ArrayList<Card> cards) {
        return false;
    }
}
