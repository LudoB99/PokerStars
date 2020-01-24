package cegepst.Entities;

import cegepst.ChainOfResponsibiliy.*;

import java.util.ArrayList;

public class Checker {
    CoR c1;
    CoR c2;
    CoR c3;
    CoR c4;
    CoR c5;
    CoR c6;
    CoR c7;
    CoR c8;
    CoR c9;
    CoR c10;

    public Checker() {
        c1 = new RoyalFlush();
        c2 = new StraightFlush();
        c3 = new FourOfAKind();
        c4 = new FullHouse();
        c5 = new Flush();
        c6 = new Straight();
        c7 = new ThreeOfAKind();
        c8 = new TwoPair();
        c9 = new Pair();
        c10 = new HighCard();
        SetupChain();
    }

    public void SetupChain(){
        c1.setNext(c2);
        c2.setNext(c3);
        c3.setNext(c4);
        c4.setNext(c5);
        c5.setNext(c6);
        c6.setNext(c7);
        c7.setNext(c8);
        c8.setNext(c9);
        c9.setNext(c10);
        c10.setNext(null);
    }

    public void process(ArrayList<Card> hole, ArrayList<Card> community) {
        c1.check(hole, community);
    }
}
