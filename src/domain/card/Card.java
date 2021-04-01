package domain.card;

import domain.card.enums.Suit;
import domain.card.enums.Type;

public class Card {

    private Suit suit;
    private Type type;

    public Card(Suit suit, Type type) {
        this.suit = suit;
        this.type = type;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String toString() {
        return this.type.name() + " of " + this.suit.name();
    }

}
