package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class RoyalFlush extends CoR {

    public RoyalFlush(CoR next){
        super(next);
    }

    @Override
    public boolean process(ArrayList<Card> cards) {
        return false;
    }
}
