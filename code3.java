public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempt to access an element outside the array bounds
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }

        try {
            // Attempt to divide by zero
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: Division by zero.");
        }
    }

    public static int divide(int a, int b) {
        // Check for division by zero before performing the division
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return a / b;
    }
}
