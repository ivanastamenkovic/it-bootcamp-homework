package homework01.temperatureconverter;

// Use scanner to enter the temperature in Celsius as an integer value.
// Convert from Celsius to Fahrenheit,
// and the program should print both in the format "31C = 87.8F" (round Fahrenheit to one decimal place).

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        int temperatureC = input.nextInt();

        double temperatureF;
        temperatureF = temperatureC * 1.800 + 32;

        System.out.printf("%dC = %.1fF", temperatureC, temperatureF);

        input.close();
    }
}
