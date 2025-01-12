package homework02;

//  Use the scanner to enter the year.
//  Check if the year was a leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        if ((year % 400 == 0) || ((year % 100!=0) && (year % 4==0))) {
            System.out.println("Year " + year + " was a leap year.");
        } else {
            System.out.println("Year " + year + " was not a leap year.");
        }

        input.close();
    }
}
