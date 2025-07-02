import java.util.Scanner;

public class DivisionByZeroHandler {

    /**
     * Divides two integers and handles division-by-zero via try-catch.
     * @param a numerator
     * @param b denominator
     */
    public static void safeDivide(int a, int b) {
        try {
            int result = a / b;  // may throw ArithmeticException
            System.out.println("Output: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Output: Exception handled");
        }
    }

    public static void main(String[] args) {
        // Interactive input (optional)
        Scanner in = new Scanner(System.in);
        /*
        System.out.print("Enter numerator: ");
        int num = in.nextInt();
        System.out.print("Enter denominator: ");
        int den = in.nextInt();
        safeDivide(num, den);
        */

        // Static test cases
        System.out.print("TC1: 10 / 2 → ");
        safeDivide(10, 2);     // expected: 5

        System.out.print("TC2: 20 / 0 → ");
        safeDivide(20, 0);     // expected: Exception handled

        System.out.print("TC3: -5 / 5 → ");
        safeDivide(-5, 5);     // expected: -1

        System.out.print("TC4: 0 / 3 → ");
        safeDivide(0, 3);      // expected: 0

        System.out.print("TC5: 100 / -10 → ");
        safeDivide(100, -10);  // expected: -10

        in.close();
    }
}