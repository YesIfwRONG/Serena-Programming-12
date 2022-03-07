public class Card {

    Faces faceType;
    Suites suiteType;

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


}
