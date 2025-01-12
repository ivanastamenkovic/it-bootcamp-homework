package javaclasscurrencyconverter;

// Create a class Converter that has RSD and currency as attributes.
// Currency is an enum, while RSD is an integer.
// You can input values for RSD and currency through the constructor, and there are setters, but there are no getters.
// Create a method for converting currency to the one specified through the constructor or setter.
// This means converting RSD to that specific currency.
// Use if-else or switch for comparisons in the method.
// Look at how enums are compared correctly in Java.

public class Converter {
    private int amountRSD;
    private Currency currency;

    public Converter() {

    }

    public Converter(int amountRSD, Currency currency) {
        this.amountRSD = amountRSD;
        this.currency = currency;
    }

    public void setAmountRSD(int amountRSD) {
        this.amountRSD = amountRSD;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void currencyConverter(int amountRSD, Currency currency) {
        double convertedAmount;
        switch(currency) {
            case EUR:
                convertedAmount = amountRSD / 117.2767;
                System.out.printf("%d RSD = %.2f EUR%n", amountRSD, convertedAmount);
                // System.out.println(amountRSD + " RSD = " + String.format("%.2f", convertedAmount) + " EUR");
                break;
            case USD:
                convertedAmount = amountRSD / 109.2064;  // Exchange rate for USD
                System.out.printf("%d RSD = %.2f USD%n", amountRSD, convertedAmount);
                break;
            case AUD:
                convertedAmount = amountRSD / 71.1285;  // Exchange rate for AUD
                System.out.printf("%d RSD = %.2f AUD%n", amountRSD, convertedAmount);
                break;
            case CAD:
                convertedAmount = amountRSD / 80.0688;  // Exchange rate for CAD
                System.out.printf("%d RSD = %.2f CAD%n", amountRSD, convertedAmount);
                break;
            case RUB:
                convertedAmount = amountRSD / 1.3646;  // Exchange rate for RUB
                System.out.printf("%d RSD = %.2f RUB%n", amountRSD, convertedAmount);
                break;
            case GBP:
                convertedAmount = amountRSD / 134.6770;  // Exchange rate for GBP
                System.out.printf("%d RSD = %.2f GBP%n", amountRSD, convertedAmount);
                break;
            default:
                System.out.println("Unknown currency.");
        }
    }
}
