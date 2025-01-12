package homework06;

// Create a method that performs currency conversion. The currencies used are EUR, USD, and GBP.
// Write the conversions using a switch statement, where you check which currency the user has entered as a parameter,
// and return the calculated value in that particular currency.
// In the main method, using a scanner, prompt the user to enter an amount in Serbian Dinar (RSD)
// that they want to convert to a specific currency, and the currency itself as a string.
// The currencies should be of type double, and you can obtain their values from the National Bank of Serbia website.

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amountRSD;
        String currency;

        do {
            System.out.print("Enter the amount (RSD) or a negative number to exit: ");
            amountRSD = input.nextDouble();

            if (amountRSD >= 0) {
                System.out.print("Enter the currency (EUR/USD/GBP): ");
                currency = input.next().toUpperCase();

                double convertedAmount = convertCurrency(amountRSD, currency);
                System.out.printf("%.2f RSD = %.2f %s%n", amountRSD, convertedAmount, currency);
            }
        } while (amountRSD >= 0);

        input.close();
    }

    public static double convertCurrency(double amount, String currency) {
        switch (currency) {
            case "EUR":
                return amount / 117.64;
            case "USD":
                return amount / 106.51;
            case "GBP":
                return amount / 134.26;
            default:
                System.out.println("You entered an invalid currency.");
                return 0.0;
        }
    }
}
