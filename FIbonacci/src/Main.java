public class Main {

    // testing the result
    public static void main(String[] args) {
        int[] fib = new int[10];

        initialize();
    }

    // base case: 1 and 2, return 1; starting from 2, update the sum then return;
    public static int fib(int count) {
        if (count == 1 || count == 2) {
            return 1;
        } else {
            int a = fib(count - 1);
            int b = fib(count - 2);
            int c = a+b;
            sum +=c;
            return c;
        }
    }

    public static void initialize(){
        sum = 0;
    }
}
