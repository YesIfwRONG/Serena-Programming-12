public class Card implements Comparable<Card>{
    private int cardValue;
    private Faces faceType;
    private Suites suiteType;

    @Override
    public int compareTo(Card o) {
        return this.cardValue-o.cardValue;
    }

    enum Faces{
        // descending
        ACES, KING, QUEEN, JACK, NONE
    }
    enum Suites{
        // descending
        SPADES, HEARTS, DIAMONDS, CLUBS
    }

    public Card(Suites suite, int value){
        this.suiteType = suite;
        this.cardValue = value;
        // There is no value 1 or 0 as the input;
        if (value < 11) {
            this.faceType = Faces.NONE;
        } else if (value < 12) {
            this.faceType = Faces.JACK;
        } else if (value < 13) {
            this.faceType = Faces.QUEEN;
        } else if (value < 14) {
            this.faceType = Faces.KING;
        } else {
            this.faceType = Faces.ACES;
        }
    }

    public int getCardValue() {
        return cardValue;
    }

    public Faces getFaceType() {
        return faceType;
    }

    public Suites getSuiteType() {
        return suiteType;
    }


    @Override
    public String toString() {
        return cardValue + ", " + suiteType;
    }
}
