package javaclasscurrencyconverter;

// Create an object of type Converter and test it for all currencies.
// EUR, USD, AUD, CAD, RUB, and GBP.

public class TaskConverter {
    public static void main(String[] args) {
        Converter converter1 = new Converter();
        converter1.currencyConverter(15850, Currency.EUR);

        Converter converter2 = new Converter();
        converter2.currencyConverter(15850, Currency.USD);

        Converter converter3 = new Converter();
        converter3.currencyConverter(15850, Currency.AUD);

        Converter converter4 = new Converter();
        converter4.currencyConverter(15850, Currency.CAD);

        Converter converter5 = new Converter();
        converter5.currencyConverter(15850, Currency.RUB);

        Converter converter6 = new Converter();
        converter6.currencyConverter(15850, Currency.GBP);
    }
}
