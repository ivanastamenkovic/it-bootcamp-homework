package homework03;

// Using a while loop, the user continuously enters numbers and they are added up.
// When the user enters 0, the program prints the sum of the previously entered numbers and the program ends.

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number;
        double sum = 0;

        System.out.println("Enter numbers to calculate their sum (enter 0 to exit and display sum):");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }

        scanner.close();

        System.out.print("The sum of the entered numbers is: " + sum);
    }
}
