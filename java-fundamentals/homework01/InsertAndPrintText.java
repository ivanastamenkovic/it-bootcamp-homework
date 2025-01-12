package homework01.printtext;

// Use scanner to enter your first and last name separately, and then print your first and last name combined.

import java.util.Scanner;

public class InsertAndPrintText {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName);

        input.close();
    }
}
