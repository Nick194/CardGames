package domain.player;

import domain.card.Card;

import java.util.List;
import java.util.Stack;

public class Player {

    public List<Card> hand;
    public int position;

    public Player(List<Card> hand, int position) {
        this.hand = hand;
        this.position = position;
    }

    public void draw(Stack<Card> deck) {
        hand.add(deck.pop());
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
