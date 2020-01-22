package cegepst;

public class Card {
    private int id;
    private String value;
    private String type;

    public Card(int id, String value, String type) {
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

    public String getType() {
        return type;
    }

    public String getCardName() {
        return value + " de " + type;
    }

    public String getDetail() {
        return value + " de " + type + " (" + id + ")";
    }
}
