import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // set this to private later on;
    public ArrayList<Card> deck;
    // construct a new deck
    public void Deck(){
        generateDeck();

    }
    public static void shuffle(List deck){
        Collections.shuffle(deck);
    }
    public void generateDeck(){
        ArrayList<Card> deck = new ArrayList<>(52);
        for (int i = 2; i < 15; i++) {
            deck.add(new Card(Card.Suites.SPADES, i));
        }for (int i = 2; i < 15; i++) {
            deck.add(new Card(Card.Suites.HEARTS, i));
        }for (int i = 2; i < 15; i++) {
            deck.add(new Card(Card.Suites.CLUBS, i));
        }for (int i = 2; i < 15; i++) {
            deck.add(new Card(Card.Suites.DIAMONDS, i));
        }

        this.deck = deck;
    }

}
