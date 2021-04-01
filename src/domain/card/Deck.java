package domain.card;

import domain.card.enums.Suit;
import domain.card.enums.Type;

import java.util.*;

public class Deck {

    private Card[] deck;

    private Stack<Card> currentDeck;

    private final Random random = new Random();

    public Deck(Card[] deck) {
        this.deck = deck;
        this.currentDeck = new Stack<>();
        currentDeck.addAll(Arrays.asList(deck));
    }

    public Deck() {
        this.deck = new Card[52];
        this.currentDeck = new Stack<>();
    }

    public void createNewDeck() {
        Type[] types = Type.values();
        Suit[] suits = Suit.values();

        List<Card> newDeck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                newDeck.add(new Card(suits[i], types[j]));
            }
        }
        deck = newDeck.toArray(new Card[52]);
        currentDeck.addAll(Arrays.asList(deck));
    }


    public void shuffle() {
        for(int i = 0; i < this.deck.length; i++) {
            int r = i + random.nextInt(52 - i);
            Card temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        currentDeck.clear();
        currentDeck.addAll(Arrays.asList(deck));
    }

    public List<Card> deal(int numberOfCards) {
        List<Card> hand = new ArrayList<>();
        for(int i = 0; i < numberOfCards; i++) {
            hand.add(currentDeck.pop());
        }
        return hand;
    }



    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        if(deck.length == 52) {
            this.deck = deck;
        } else {
            throw new IllegalArgumentException("A Deck cannot have more than 52 cards");
        }
    }

}
