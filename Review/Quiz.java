package Review;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void start(int whichOne) {
        System.out.println();
        System.out.println(StudyAid.frame);
        System.out.println("Your current question set is: " + FlashCard.questions.get(whichOne-1));
        System.out.println();
        System.out.println("Question: " + FlashCard.questions.get(whichOne-1).getQs());
        Scanner yourAnswer = new Scanner(System.in);
        String compareAns = yourAnswer.nextLine();
        if (compareAns.equals(FlashCard.questions.get(whichOne - 1).getAns())) {
            System.out.println("BINGO!");
        }else{
            System.out.println("Ops, This is WRONG...");
        }
        StudyAid.homepage();
    }

    public static void multipleQuiz(int numOfQuestions){
        System.out.println("This is a quiz that has " + numOfQuestions + " questions. ");
        System.out.println("Wish you the best luck. ");
        System.out.println();
        ArrayList<Question> copy = new ArrayList<>(FlashCard.questions);
        Random rand = new Random();
        Scanner ans = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i< numOfQuestions; i++){
            int q = rand.nextInt(copy.size());
            System.out.println();
            System.out.println("Question " + (i+1) + ") " + copy.get(q).getQs());
            String userAns = ans.nextLine();
            if (userAns.equals(copy.get(q).getAns())) {
                System.out.println("BINGO!");
                copy.remove(q);
                count++;
            } else {
                System.out.println("Ops, This is WRONG...");
                copy.remove(q);
            }
        }
        System.out.println();
        System.out.println(StudyAid.frame);
        System.out.println("You can " + count + " out of " + numOfQuestions + " questions correct. ");
        StudyAid.quizSection();
    }
}
