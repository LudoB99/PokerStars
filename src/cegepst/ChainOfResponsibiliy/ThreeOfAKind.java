package cegepst.ChainOfResponsibiliy;
import cegepst.Entities.Card;
import java.util.ArrayList;

public class ThreeOfAKind extends CoR {

    public ThreeOfAKind(CoR next){
        super(next);
    }

    @Override
    public boolean process(ArrayList<Card> cards) {
        return true;
    }
}
