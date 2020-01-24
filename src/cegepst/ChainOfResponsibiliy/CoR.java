package cegepst.ChainOfResponsibiliy;

import cegepst.Entities.Card;


import java.util.ArrayList;

public abstract class CoR {
    public abstract void setNext(CoR next);
    public abstract boolean check(ArrayList<Card> hole, ArrayList<Card> community);
}
