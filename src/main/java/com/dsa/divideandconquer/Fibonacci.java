package divideandconquer;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Generating Fibonacci Series...");
        int num = 10;
        int result = fibonacci(num);
        System.out.println(result);

    }

    public static int fibonacci(int num) {
        if(num < 0) {
            System.out.println("Please provide a positive number");
            return Integer.MIN_VALUE;
        } else if (num == 0 || num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
