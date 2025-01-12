package homework02;

// Write a program where the user enters the day and month of birth
// and the program returns which zodiac sign it is.

import java.util.Scanner;

public class ZodiacSignChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your day of birth (e.g. 01): ");
        int dayOfBirth = input.nextInt();

        System.out.print("Enter your month of birth (e.g. May): ");
        String monthOfBirth = input.next();

        input.close();

        switch (monthOfBirth.toLowerCase()) {
            case "january":
                if (dayOfBirth <= 20) {
                System.out.println("Your zodiac sign is Capricorn.");
            } else {
                System.out.println("Your zodiac sign is Aquarius.");
            }
                break;
            case "february":
                if (dayOfBirth <= 19) {
                System.out.println("Your zodiac sign is Aquarius.");
            } else {
                System.out.println("Your zodiac sign is Pisces.");
            }
                break;
            case "march":
                if (dayOfBirth <= 20) {
                System.out.println("Your zodiac sign is Pisces.");
            } else {
                System.out.println("Your zodiac sign is Arius.");
            }
                break;
            case "april":
                if (dayOfBirth <= 20) {
                System.out.println("Your zodiac sign is Arius.");
            } else {
                System.out.println("Your zodiac sign is Taurus.");
            }
                break;
            case "may":
                if (dayOfBirth <= 21) {
                System.out.println("Your zodiac sign is Taurus.");
            } else {
                System.out.println("Your zodiac sign is Gemini.");
            }
                break;
            case "june":
                if (dayOfBirth <= 21) {
                System.out.println("Your zodiac sign is Gemini.");
            } else {
                System.out.println("Your zodiac sign is Cancer.");
            }
                break;
            case "july":
                if (dayOfBirth <= 21) {
                System.out.println("Your zodiac sign is Cancer.");
            } else {
                System.out.println("Your zodiac sign is Leo.");
            }
                break;
            case "august":
                if (dayOfBirth <= 22) {
                System.out.println("Your zodiac sign is Leo.");
            } else {
                System.out.println("Your zodiac sign is Virgo.");
            }
                break;
            case "september":
                if (dayOfBirth <= 22) {
                System.out.println("Your zodiac sign is Virgo.");
            } else {
                System.out.println("Your zodiac sign is Libra.");
            }
                break;
            case "october":
                if (dayOfBirth <= 23) {
                System.out.println("Your zodiac sign is Libra.");
            } else {
                System.out.println("Your zodiac sign is Scorpio.");
            }
                break;
            case "november":
                if (dayOfBirth <= 22) {
                System.out.println("Your zodiac sign is Scorpio.");
            } else {
                System.out.println("Your zodiac sign is Sagittarius.");
            }
                break;
            case "december":
                if (dayOfBirth <= 21) {
                System.out.println("Your zodiac sign is Sagittarius.");
            } else {
                System.out.println("Your zodiac sign is Capricorn.");
            }
        }
    }
}
