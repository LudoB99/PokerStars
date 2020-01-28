package cegepst.Entities;

public class Card {
    private String value;
    private char type;

    public Card(String value, char type) {
        this.value = value;
        this.type = type;
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
}
