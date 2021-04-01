package game;

import domain.card.Deck;
import domain.card.Card;

public class Game {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.createNewDeck();

//        for(PlayingCard card: cards) {
//            System.out.println(card.toString());
//        }
        deck.shuffle();

        for(Card card: deck.getDeck()) {
            System.out.println(card.toString());
        }

    }

}
