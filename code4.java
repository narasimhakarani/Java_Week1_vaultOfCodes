public class Fibonacci {
    public static int fibonacci(int n) {
        if (n < 0) {
            // Handle negative input by returning an error value or an appropriate result.
            throw new IllegalArgumentException("Input n cannot be negative.");
        }
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}
