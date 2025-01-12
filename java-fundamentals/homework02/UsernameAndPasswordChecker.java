package homework02;

//  Create the variables "username" and "password" and define some values as desired.
//  Use the scanner to enter two values, which should represent username and password,
//  and compare them to already defined values.
//  If the username and password are correct, print "You have successfully logged in",
//  and if one of those two is wrong, print the same message "Wrong username or password".

import java.util.Scanner;

public class UsernameAndPasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username01a = "User01";
        String password01a = "Password01";

        System.out.print("Enter your username: ");
        String username01b = input.next();

        System.out.print("Enter your password: ");
        String password01b = input.next();

        if (username01a.equals(username01b) && password01a.equals(password01b)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Wrong username or password!");
        }

        input.close();
    }
}
