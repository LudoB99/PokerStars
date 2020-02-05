package cegepst.Entities;

public class Card {
    private String rank;
    private char suit;

    public Card(String rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public char getSuit() {
        return suit;
    }

    public String getCardName() {
        return "[" + rank + ' ' + suit + "] ";
    }

    public char getCardSuit() {return suit; }

    public int getCardRank() {
        if(rank.equals(Rank.JACK.getRank())) {return 11;}
        if(rank.equals(Rank.QUEEN.getRank())) {return 12;}
        if(rank.equals(Rank.KING.getRank())) {return 13;}
        if(rank.equals(Rank.ACE.getRank())) {return 14;}
        return Integer.parseInt(rank);
    }

}
