package Review;

import java.util.ArrayList;
import java.util.Scanner;

/* Purpose: FlashCard section is used for check and create sets.
   Each sets contain a number of questions and answer matched with.
 */

public class FlashCard {
    // store the number of cards
    public static int numberOfCards = 0;
    public static ArrayList<Question>questions = new ArrayList<>();

    public static void initiate(){
        System.out.println(StudyAid.frame);
        System.out.println("Flashcard: ");
        System.out.println("1. Create a new Flashcard.");
        System.out.println("2. Check the old Flashcards.");
        System.out.println("3. Leave.");
        System.out.println("Enter an option ( 1/ 2/ 3 ): ");
        Scanner myObj = new Scanner(System.in);
        String myOb = myObj.nextLine();
        if(myOb == null || !FlashCard.isStringInt(myOb)){
            System.out.println("Something went wrong...");
            System.out.println("Back to the last page...");
            FlashCard.initiate();
        }
        int op = Integer.parseInt(myOb);

        if (op == 1){
            int key = 0;
            while (key != -1) {
                System.out.println(StudyAid.frame);
                System.out.println("Enter -1 to leave; Enter other keys to continue.");
                Scanner ifLeave = new Scanner(System.in);
                String ifL = ifLeave.nextLine();
                int doILeave;
                // if it is a string or null then doILeave become 0; if it is an integer, store it.
                if (ifL == null || !isStringInt(ifL)){
                    doILeave = 0;
                }else {
                    doILeave = Integer.parseInt(ifL);
                }

                if (doILeave == -1){
                    key = -1;
                }else {
                    System.out.println("Enter your flashcard name: ");
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
            if(questions.isEmpty()){
                FlashCard.initiate();
            }
            // now adding a new section for checking the question and the answer in each flashcard.
            System.out.println(StudyAid.frame);
            System.out.println("1. Check the question and the answer. ");
            System.out.println("2. Leave. ");
            System.out.println("Enter an option ( 1/ 2 ): ");
            Scanner ifCheck = new Scanner(System.in);
            String ifCh = ifCheck.nextLine();
            if(ifCh == null || !FlashCard.isStringInt(ifCh)){
                System.out.println("Something went wrong...");
                System.out.println("Back to the last page...");
                FlashCard.initiate();
            }
            int ifC = Integer.parseInt(ifCh);

            if (ifC == 1){
                System.out.println(StudyAid.frame);
                System.out.println("Which flashcard do you want to access? ");
                System.out.println("(Enter a number)");
                Scanner whichSet = new Scanner(System.in);
                String whichSe = whichSet.nextLine();
                if (!isStringInt(whichSe) || whichSe == null) {
                    System.out.println("Enter not valid. ");
                    FlashCard.initiate();
                }else {
                    int whichS = Integer.parseInt(whichSe) -1;
                    System.out.println("Your flashcard name is: " + questions.get(whichS).getName());
                    System.out.println("Your question is: " + questions.get(whichS).getQs());
                    System.out.println("Your answer to this question is: " + questions.get(whichS).getAns());
                    FlashCard.initiate();
                }

            }else if (ifC == 2) {
                FlashCard.initiate();
            }

        }else if (op == 3){
            StudyAid.homepage();
        }else{
            System.out.println("Something went wrong...");
            System.out.println("Back to the last page...");
            FlashCard.initiate();
        }

    }

    public static boolean isStringInt(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }

}
