import java.util.Scanner;

public class Main {
    private static int[] fib; // array to store the term of fib;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num;
        while(true){ // infinite loop to take the term given, then give the user the value of fib on that term and the sum;

            System.out.println("Enter the term you want to check: ");
            num = myObj.nextInt(); // Notice: when num > 44, sum goes out of bound. num > 46, term goes out of bound.

            fib = new int[num + 10]; // initiate a list with a proper size

            // set up the base cases
            fib[1] = 1;
            fib[2] = 1;

            // print the value of the term and the sum;
            System.out.println(fib(num));
            System.out.println(findSum());
        }

    }


    public static int fib(int count) { // base case when count == 1 and 2, else calculate then fill in the array
        if (fib[count] != 0) {
            return fib[count];
        } else {
            int a = fib(count - 1);
            int b = fib(count - 2);
            int c = a+b;
            fib[count] = c;
            return c;
        }
    }

    public static int findSum(){ // add up the entire array
        int sum = 0;
        for (int i : fib) {
            sum += i;
        }
        return sum;
    }

}
