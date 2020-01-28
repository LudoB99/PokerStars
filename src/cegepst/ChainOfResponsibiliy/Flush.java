package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class Flush extends CoR{

    public Flush(CoR next){
        super(next);
    }

    @Override
    public boolean process(ArrayList<Card> cards) {
        return true;
    }
}
