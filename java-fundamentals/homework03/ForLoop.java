package homework03;

// Write a for loop that goes from 0 to 50 and displays all numbers divisible by 3.

public class ForLoop {
    public static void main(String[] args) {

        for(int i = 0; i <= 50; i++) {

            if (i % 3 == 0 && i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
