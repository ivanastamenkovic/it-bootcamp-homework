package homework04;

// create an array of arbitrary length with integer values
// multiply the last element by the total number of elements
// use .length instead of a fixed value

public class AccessingArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};

        int numberOfElements = array.length;

        int lastElement = array[numberOfElements - 1];

        int product = lastElement * numberOfElements;

        System.out.println("The product of the last element and the total number of elements in the array is: " + product);
    }
}
