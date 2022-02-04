package Review;

import java.util.Scanner;

/*
This class is used to run the entire program.
This class can also be considered as a "homepage".

Target:
1. "homepage":
    Show User 3 options:
    - Create Flashcards;
    - Enter an existed Flashcard;
    - Enter Quiz;
2. Ask User to input their questions and answers.
3. Store User inputs into Question class.
4. Return to the "homepage".
 */

public class StudyAid {
    public static void homepage(){
        // Homepage and information:
        System.out.println("HOMEPAGE: ");
        System.out.println("1. Create Flashcards;");
        System.out.println("2. Take a Quiz;");
        System.out.println("Enter an option ( 1/ 2 ): ");
        Scanner myObj = new Scanner(System.in);
        int op = Integer.valueOf(myObj.nextLine());

        // Deciding which page are we going to;
        // 1: Create Flashcards;
        // 2: Take the quiz;
        if (op == 1){
            FlashCard.initiate();
        }else if (op == 2){
            System.out.println();
            System.out.println("Your current Flashcard number is " + String.valueOf(FlashCard.numberOfCards) + ". ");
            if (FlashCard.numberOfCards<=0){
                System.out.println("Sorry, You don't have any Flashcards yet. ");
                StudyAid.homepage();
            }

            System.out.println("Which quiz do you want to enter? ");
            Scanner quizSize = new Scanner(System.in);
            if (Integer.valueOf(quizSize.nextLine()) < 0 || Integer.valueOf(quizSize.nextLine()) > FlashCard.numberOfCards) {
                System.out.println("Enter not valid. ");
                StudyAid.homepage();
            }else{
                Quiz.start();
            }

        }else{
            System.out.println("Input not valid. ");
        }
    }

    public static void main (String args[]){
        System.out.println();
        System.out.println("Hello, welcome to StudyAid! StudyAid is an app which helps you develop your own knowledge through flashcards.");
        System.out.println();

        homepage();
    }
}
