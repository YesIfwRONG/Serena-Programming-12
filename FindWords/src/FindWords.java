import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner myObj = new Scanner(new File("illiad.txt"));
        while (myObj.hasNext()) {
            Words.convertWords(myObj.next());
        }
        Words.checkHashSet();
        System.out.println(Words.getDifferentWords());
    }

}
