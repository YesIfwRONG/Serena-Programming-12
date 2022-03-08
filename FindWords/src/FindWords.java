import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner myObj = new Scanner(new File("illiad.txt"));
        String [] illiad = myObj.next().split(",");
        illiad = myObj.next().split(",");
//        System.out.println(illiad);
        for (String a : illiad) {
            System.out.println(a);
        }
    }

}
