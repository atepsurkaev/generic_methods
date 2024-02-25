package atepsurkaev;

/**
 * The Test class contains the main method to test the functionality of the GenericUtils class.
 * @author Tepsurkaev Abdurrahman
 * @version 25-02-2024
 */

public class Test {
    public static void main(String[] args) {
        // Testing the reverse - method
        System.out.println("\n--- Testing the reverse-method: ---");
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + java.util.Arrays.toString(intArray));
        GenericUtils.reverse(intArray);
        System.out.println("Reversed array: " + java.util.Arrays.toString(intArray));

        // Testing the sum - method
        System.out.println("\n--- Testing the sum-method: ---");
        Double[] doubleArray = {1.2, 2.43, 3.5, 4.3, 5.33};
        Integer[] integerArray = {1, 2, 3, 4, 5};
        System.out.println("Sum of doubleArray: " + GenericUtils.sum(doubleArray));
        System.out.println("Sum of doubleArray: " + GenericUtils.sum(integerArray));
    }
}