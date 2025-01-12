package homework05;

// Create a method that prints a text and accepts two strings as parameters.
// The output is in the following format: "First Name: " text1 " and Last Name: " text2.
// text1 should be in uppercase letters, while text2 should be in lowercase letters.
// In the main method, call the method with several examples for testing (2-3 calls are sufficient).

public class FormattedText {
    public static void main(String[] args) {
        printFullName("Harry", "Potter");
        printFullName("Hermione", "Granger");
        printFullName("Ron", "Weasley");
    }

    public static void printFullName(String firstName, String lastName) {
        String formattedText = "First Name: " + firstName.toUpperCase() + " and Last Name: " + lastName.toLowerCase();
        System.out.println(formattedText);
    }
}
