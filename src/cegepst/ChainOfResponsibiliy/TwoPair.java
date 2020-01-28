package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class TwoPair extends CoR{

    public TwoPair(CoR next){
        super(next);
    }

    @Override
    public boolean process(ArrayList<Card> cards) {
        return true;
    }
}
