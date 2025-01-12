package homework03;

// Provide the sum of the numbers that the user enters using the scanner
// Use a do-while loop because at least one number must be entered
// The program prints what the sum is when the user enters 0 or a negative number

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number;
        double sum = 0;

        do {
            System.out.print("Enter numbers to calculate their sum (enter 0 or a negative number to exit and display sum): ");
            number = scanner.nextInt();
            if (number > 0) {
                sum += number;
            }
        } while (number > 0);

        scanner.close();

        System.out.print("The sum of the entered numbers is: " + sum);
    }
}
