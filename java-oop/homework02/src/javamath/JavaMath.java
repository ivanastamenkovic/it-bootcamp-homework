package javamath;

// Create a static method in the main function
// that functions like SQL's min, max, sum, avg, and distinct using ArrayList<Integer>.
// You don't need to create another class except for the main class,
// and the methods should accept ArrayList<Integer> as a parameter.
// The distinct method returns a new ArrayList<Integer>,
// while the other methods have return types of int (for min, max, and sum) and double (for avg).

import java.util.ArrayList;
import java.util.Scanner;

public class JavaMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int x;

        do {
            System.out.print("Enter a natural number: ");
            x = input.nextInt();

            if (x == 0) {
                break;
            }

            if (x < 0) {
                System.out.println("Invalid input!");
            } else {
                numbers.add(x);
            }
        } while (true);

        System.out.println("List of entered numbers: " + numbers);

        System.out.println("The smallest number in the list is " + findMin(numbers));
        System.out.println("The largest number in the list is " + findMax(numbers));
        System.out.println("The sum of the numbers in the list is " + findSum(numbers));
        System.out.println("The average of the numbers in the list is " + findAvg(numbers));
        System.out.println("The list of unique numbers in the list is " + findUnique(numbers));

    }

    // SQL min
    public static int findMin(ArrayList<Integer> numbers) {
        int min = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    // SQL max
    public static int findMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    // SQL sum
    public static int findSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    // SQL avg
    public static double findAvg(ArrayList<Integer> numbers) {
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            avg = (double) sum / numbers.size();
        }
        return avg;
    }

    // SQL distinct
    public static ArrayList<Integer> findUnique(ArrayList<Integer> numbers) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (!uniqueNumbers.contains(currentNumber)) {
                uniqueNumbers.add(currentNumber);
            }
        }
        return uniqueNumbers;
    }
}
