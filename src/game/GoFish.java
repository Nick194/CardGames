package game;

import domain.card.Card;
import domain.card.Deck;
import domain.player.Player;

import java.util.ArrayList;
import java.util.List;

public class GoFish {

    private List<Player> players;
    private Deck deck;

    public void setup(int numberOfPlayers) {
        // Create a new deck and shuffle it
        deck = new Deck();
        deck.createNewDeck();
        deck.shuffle();
        // Add players to player list unless numberOfPlayers is < 2 in which case
        // throw IllegalArgumentException
         for(int i = 0; i < numberOfPlayers; i++) {
             if(numberOfPlayers >= 2) {
                 // Create new list of players and deal 9 cards to them
                 players = new ArrayList<>();
                 players.add(new Player(deck.deal(9), i));
             } else {
                 throw new IllegalArgumentException("A game of GoFish needs at least 2 players");
             }
         }
    }

    public boolean checkForBooks(List<Card> hand) {
        return false;
    }



    public static void main(String[] args) {
        GoFish game = new GoFish();
        game.setup(2);
    }

}
