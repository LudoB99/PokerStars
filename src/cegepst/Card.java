package cegepst;

public class Card {
    private int id;
    private String value;
    private char type;

    public Card(int id, String value, char type) {
        this.id = id;
        this.value = value;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public char getType() {
        return type;
    }

    public String getCardName() {
        return "[" + value + ' ' + type + "] ";
    }

    public String getDetail() {
        return value + ' ' + type + " (" + id + ")";
    }
}
