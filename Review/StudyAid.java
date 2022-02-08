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
    public static String frame = "------------------------------";
    public static void homepage(){
        // Homepage and information:
        System.out.println(frame);
        System.out.println("HOMEPAGE: ");
        System.out.println("1. Go to Flashcards;");
        System.out.println("2. Take a Quiz;");
        System.out.println("Enter an option ( 1 / 2 ): ");
        Scanner myObj = new Scanner(System.in);
        String myOb = myObj.nextLine();
        if(myOb == null || !FlashCard.isStringInt(myOb)){
            System.out.println("Something went wrong...");
            System.out.println("Back to the last page...");
            homepage();
        }
        int op = Integer.parseInt(myOb);

        // Deciding which page are we going to;
        // 1: Create Flashcards;
        // 2: Take the quiz;
        if (op == 1){
            FlashCard.initiate();
        }else if (op == 2){
            System.out.println();
            System.out.println("Your current Flashcard number is " + FlashCard.numberOfCards + ". ");
            if (FlashCard.numberOfCards<=0){
                System.out.println("Sorry, You don't have any Flashcards yet. ");
                StudyAid.homepage();
            }
            quizSection();
        }else{
            System.out.println("Input not valid. ");
            homepage();
        }
    }

    public static void quizSection() {
        System.out.println(StudyAid.frame);
        System.out.println("Welcome to StudyAid quiz.");
        System.out.println();
        System.out.println("Your options: ");
        Scanner myObj = new Scanner(System.in);

        int key = 0;

        if(FlashCard.numberOfCards<5){
            System.out.println("1. Do an one-question quiz. ");
            System.out.println("0. Leave ");
            System.out.println("Enter an option ( 1 / 0 ): ");
            key = 1;
        }else if (FlashCard.numberOfCards<10){
            System.out.println("1. Do an one-question quiz. ");
            System.out.println("2. Do an five-question quiz. ");
            System.out.println("0. Leave ");
            System.out.println("Enter an option ( 1 / 2 / 0 ): ");
            key = 2;
        }else {
            System.out.println("1. Do an one-question quiz. ");
            System.out.println("2. Do an five-question quiz. ");
            System.out.println("3. Do an ten-question quiz. ");
            System.out.println("0. Leave ");
            System.out.println("Enter an option ( 1 / 2 / 3 / 0 ): ");
            key = 3;
        }

        String myOb = myObj.nextLine();
        if(myOb == null || !FlashCard.isStringInt(myOb)){
            System.out.println("Something went wrong...");
            System.out.println("Back to the last page...");
            homepage();
        }
        int op = Integer.parseInt(myOb);
        if (op == 1) {
            System.out.println("Which quiz do you want to enter? ");
            System.out.println("(Enter a number)");
            Scanner quizSize = new Scanner(System.in);
            String size = quizSize.nextLine();
            if (size == null || !FlashCard.isStringInt(size)) {
                System.out.println("Enter not valid. ");
                StudyAid.quizSection();
            } else {
                int siize = Integer.parseInt(size);
                if (siize < 0 || siize > FlashCard.numberOfCards) {
                    System.out.println("Enter not valid. ");
                    StudyAid.homepage();
                }
                Quiz.start(siize);
            }
        } else if (op == 2 && key != 1) {
            Quiz.multipleQuiz(5);
        } else if (op == 3 && key == 3) {
            Quiz.multipleQuiz(10);
        } else if (op == 0){
            StudyAid.homepage();
        } else {
            System.out.println();
            System.out.println("No, this is not gonna work. ");
            quizSection();
        }

    }

    public static void main (String[] args){
        System.out.println(StudyAid.frame);
        System.out.println("Hello, welcome to StudyAid! StudyAid is an app which helps you develop your own knowledge through flashcards.");
        homepage();
    }
}
