package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class HighCard extends CoR {

    public HighCard(CoR next){
        super(next);
    }

    @Override
    public boolean process(ArrayList<Card> cards) {
        return true;
    }
}
