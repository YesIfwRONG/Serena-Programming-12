public class Main {
    public static int[]fibo;
    public static void main(String[] args) {
        fibo = new int[10];
        System.out.println(fib(10));
    }

    public static int fib(int count) {
        if (count == 1 || count == 2) {
            return 1;
        } else if (fibo[count] != null) {
            return fibo[count];
        } else {

            int a = fib(count - 1);
            int b = fib(count - 2);
            return a + b;
        }
    }
}
