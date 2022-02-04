package Review;

import java.util.ArrayList;
import java.util.Scanner;

/* Purpose: FlashCard section is used for check and create sets.
   Each sets contain a number of questions and answer matched with.
 */

public class FlashCard {
    // store the number of cards
    public static int numberOfCards = 0;
    private static ArrayList<Question>questions = new ArrayList<>();

    public static void initiate(){
        System.out.println();
        System.out.println("Flashcard: ");
        System.out.println("1. Create a new Flashcard.");
        System.out.println("2. Check the old Flashcards.");
        System.out.println("3. Leave.");
        System.out.println("Enter an option ( 1/ 2/ 3 ): ");
        Scanner myObj = new Scanner(System.in);
        int op = Integer.valueOf(myObj.nextLine());

        if (op == 1){
            int key = 0;
            while (key != -1) {
                System.out.println("Enter -1 to leave; Enter 1 to continue.");
                Scanner ifLeave = new Scanner(System.in);
                if (Integer.valueOf(ifLeave.nextLine()) == -1){
                    key = -1;
                }else {
                    System.out.println("Enter your set name: ");
                    Scanner setName = new Scanner(System.in);

                    System.out.println("Enter your questions: ");
                    Scanner yourQuestions = new Scanner(System.in);

                    System.out.println("Enter your answers: ");
                    Scanner yourAnswers = new Scanner(System.in);

                    Question q1 = new Question(setName.nextLine(), yourQuestions.nextLine(), yourAnswers.nextLine());
                    // Create a question object;
                    questions.add(q1);
                    numberOfCards++;
                }
            }
            FlashCard.initiate();
        }else if (op == 2){
            System.out.println(questions);
            FlashCard.initiate();
        }else if (op == 3){
            StudyAid.homepage();
        }else{
            System.out.println("Something went wrong...");
            System.out.println("Back to the last page...");
            FlashCard.initiate();
        }

    }

}
