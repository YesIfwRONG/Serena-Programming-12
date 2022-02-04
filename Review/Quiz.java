package Review;

import java.util.Scanner;

public class Quiz {
    public static void start(int whichOne) {
        System.out.println("Welcome to StudyAid quiz.");
        System.out.println("Your current question set is: " + FlashCard.questions.get(whichOne-1));
        System.out.println();

        System.out.println(FlashCard.questions.get(whichOne-1).getQs()+"?");
        Scanner yourAnswer = new Scanner(System.in);
        String compareAns = yourAnswer.nextLine();
        if (compareAns.equals(FlashCard.questions.get(whichOne - 1).getAns())) {
            System.out.println("BINGO!");
        }else{
            System.out.println("Ops, This is WRONG...");
        }
        FlashCard.initiate();
    }
}
