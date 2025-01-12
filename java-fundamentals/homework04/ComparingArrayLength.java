package homework04;

// create two arrays and display which array has more elements

public class ComparingArrayLength {
    public static void main(String[] args) {
        int[] array1 = {1, 28, 52, 17, 116};
        int[] array2 = {2, 6, 25, 71, 92, 111};

        if (array1.length == array2.length) {
            System.out.println("The first and second array have the same number of elements.");
        } else if (array1.length > array2.length) {
            System.out.println("The first array has more elements than the second array.");
        } else {
            System.out.println("The second array has more elements than the first array.");
        }
    }
}
