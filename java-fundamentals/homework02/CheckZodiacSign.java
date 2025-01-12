package homework02;

// Write a program where the user enters the day and month of birth
// and the program returns which zodiac sign it is.

import java.util.Scanner;

public class CheckZodiacSign {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your day of birth (e.g. 01): ");
        int dayOfBirth = input.nextInt();

        System.out.print("Enter your month of birth (e.g. May): ");
        String monthOfBirth = input.next();

        input.close();

        if (monthOfBirth.equalsIgnoreCase("January")) {
            if (dayOfBirth <= 20) {
                System.out.println("Your zodiac sign is Capricorn.");
            } else {
                System.out.println("Your zodiac sign is Aquarius.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("February")) {
            if (dayOfBirth <= 19) {
                System.out.println("Your zodiac sign is Aquarius.");
            } else {
                System.out.println("Your zodiac sign is Pisces.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("March")) {
            if (dayOfBirth <= 20) {
                System.out.println("Your zodiac sign is Pisces.");
            } else {
                System.out.println("Your zodiac sign is Arius.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("April")) {
            if (dayOfBirth <= 20) {
                System.out.println("Your zodiac sign is Arius.");
            } else {
                System.out.println("Your zodiac sign is Taurus.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("May")) {
            if (dayOfBirth <= 21) {
                System.out.println("Your zodiac sign is Taurus.");
            } else {
                System.out.println("Your zodiac sign is Gemini.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("June")) {
            if (dayOfBirth <= 21) {
                System.out.println("Your zodiac sign is Gemini.");
            } else {
                System.out.println("Your zodiac sign is Cancer.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("July")) {
            if (dayOfBirth <= 21) {
                System.out.println("Your zodiac sign is Cancer.");
            } else {
                System.out.println("Your zodiac sign is Leo.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("August")) {
            if (dayOfBirth <= 22) {
                System.out.println("Your zodiac sign is Leo.");
            } else {
                System.out.println("Your zodiac sign is Virgo.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("September")) {
            if (dayOfBirth <= 22) {
                System.out.println("Your zodiac sign is Virgo.");
            } else {
                System.out.println("Your zodiac sign is Libra.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("October")) {
            if (dayOfBirth <= 23) {
                System.out.println("Your zodiac sign is Libra.");
            } else {
                System.out.println("Your zodiac sign is Scorpio.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("November")) {
            if (dayOfBirth <= 22) {
                System.out.println("Your zodiac sign is Scorpio.");
            } else {
                System.out.println("Your zodiac sign is Sagittarius.");
            }
        } else if (monthOfBirth.equalsIgnoreCase("December")) {
            if (dayOfBirth <= 21) {
                System.out.println("Your zodiac sign is Sagittarius.");
            } else {
                System.out.println("Your zodiac sign is Capricorn.");
            }
        }
    }
}
