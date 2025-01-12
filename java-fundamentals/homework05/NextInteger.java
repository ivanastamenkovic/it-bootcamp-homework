package homework05;

// Create a method that returns a boolean value and accepts two integers as parameters.
// The method returns true only if the two integers are consecutive, for example, 16 and 17, or 24 and 25.
// In the main method, use println to display several examples for testing (4-5 calls are sufficient).

public class NextInteger {
    public static void main(String[] args) {
        System.out.println(nextNumbers(1, 2));
        System.out.println(nextNumbers(11, 10));
        System.out.println(nextNumbers(100, 101));
        System.out.println(nextNumbers(50, 100));
        System.out.println(nextNumbers(25, 27));
    }

    public static boolean nextNumbers(int firstNumber, int secondNumber) {
        return (secondNumber - firstNumber) == 1;
    }
}
