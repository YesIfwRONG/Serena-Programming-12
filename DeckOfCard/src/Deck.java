import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    // construct a new deck
    public Deck(){
        generateDeck();
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public void sortDeck(){
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
        // sort the lists
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
        // assign the value to tt
        this.deck = tt;

    }

    public ArrayList<Card> sortByValue(ArrayList<Card>temp){
        ArrayList<Card> ret = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            for (Card card : temp) {
                int cardValue = card.getCardValue();
                if (cardValue == i + 2) {
                    ret.add(card);
                }
            }
        }
        return ret;
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

    public void setHand(int size){
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
