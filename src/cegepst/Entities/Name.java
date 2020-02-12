package cegepst.Entities;

public enum Name {
    ROYALFLUSH("une quinte flush royale",1),
    STRAIGHTFLUSH("une quinte flush",2),
    FOUROFAKIND("un carré",3),
    FULLHOUSE("un full",4),
    FLUSH("une couleur",5),
    STRAIGHT("une quinte",6),
    THREEOFAKIND("un brelan",7),
    TWOPAIR("deux paires",8),
    PAIR("une paire",9),
    HIGHCARD("un carte haute",10);

    private String name;
    private int rank;

    Name(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
}
