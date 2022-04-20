import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;

    public Deck(){ // Generate a deck of cards by order
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

    public void shuffle(){ // Use collection to shuffle the deck of cards
        Collections.shuffle(deck);
    }


    public void sortDeck(){ // Sort the suite, then sort the value
        ArrayList<Card> clubsTemp = new ArrayList<>();
        ArrayList<Card> heartsTemp = new ArrayList<>();
        ArrayList<Card> diamondsTemp = new ArrayList<>();
        ArrayList<Card> spadesTemp = new ArrayList<>();
        for (Card card : deck) {
            if (card.getSuiteType() == Card.Suites.SPADES) {
                spadesTemp.add(card);
            } else if (card.getSuiteType() == Card.Suites.HEARTS) {
                heartsTemp.add(card);
            } else if (card.getSuiteType() == Card.Suites.CLUBS) {
                clubsTemp.add(card);
            } else {
                diamondsTemp.add(card);
            }
        }

        // sort the lists by value
        clubsTemp =  sortByValue(clubsTemp);
        heartsTemp = sortByValue(heartsTemp);
        diamondsTemp = sortByValue(diamondsTemp);
        spadesTemp = sortByValue(spadesTemp);

        // create a new list to store the values
        ArrayList<Card> tt = new ArrayList<>();
        tt.addAll(spadesTemp);
        tt.addAll(heartsTemp);
        tt.addAll(clubsTemp);
        tt.addAll(diamondsTemp);

        // assign the value to the deck
        this.deck = tt;

    }

    public ArrayList<Card> sortByValue(ArrayList<Card>temp){ // Sort the given list by value
        Collections.sort(temp);
        return temp;
    }


    public void setHand(int size){ // Set a hand of cards with given size
        ArrayList<Card> hand = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            hand.add(deck.get(i));
        }
        this.hand = hand;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void print(){
        for(Card a:deck){
            System.out.println(a);
        }
    }

}
