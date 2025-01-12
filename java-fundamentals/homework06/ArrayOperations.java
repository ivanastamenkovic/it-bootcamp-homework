package homework06;

// Create a method that prints an array and accepts an array as a parameter.
// Inside the method, find the largest value in the array, and then set that value as the value for each element in the array.
// Use a scanner to populate the initial array.

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int arrayLength = input.nextInt();

        int[] array = new int[arrayLength];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        printArray(array);
        setLargestValue(array);
        printArray(array);
        System.out.println();
        input.close();
    }

    public static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void setLargestValue(int[] array) {
        int largestValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestValue) {
                largestValue = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = largestValue;
        }
    }
}
