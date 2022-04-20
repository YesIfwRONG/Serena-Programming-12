import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // test or user interface
        test();
        userChoice();
    }

    public static void test(){ // test to see the shuffled cards and the sorted cards
        Deck deck = new Deck();
        System.out.println("Shuffled cards: ");
        deck.shuffle();
        deck.print();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("Sorted cards: ");
        deck.sortDeck();
        deck.print();
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    public static void userChoice(){ // ask the user whether to shuffle the cards, then let the user select a hand of cards by entering the size.
        Deck deck = new Deck();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Do you need to shuffle the cards? (Y/N) ");
        String ans = myObj.next();
        if (ans.equals("Y")) {
            deck.shuffle();
            System.out.println("Shuffled. ");
        } else if (ans.equals("N")) {
            System.out.println("Received. ");
        }else{
            System.out.println("Answer not valid, we will keep everything as what it was. ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Enter a size of your cards: ");

        int op = myObj.nextInt();
        if (op > deck.getDeck().size() || op < 1) {
            System.out.println("Sorry, size not valid. ");
        } else {
            deck.setHand(op);
            System.out.println("This is your cards. ");
            for (Card a : deck.getHand()) {
                System.out.println(a);
            }
        }

    }
}
