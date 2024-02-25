package atepsurkaev;

/**
 * The GenericUtils class provides utility methods for manipulating arrays of generic types.
 * @author Tepsurkaev Abdurrahman
 * @version 25-02-2024
 */

public class GenericUtils {

    /**
     * Reverses the order of elements in the given array in-place.
     * @param array The array to be reversed.
     * @param <T> The generic type of the array elements.
     */
    public static <T> void reverse(T[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Calculates the sum of elements in the given array, assuming the elements are subclasses
     * of the java.lang.Number class (including java.lang.Number). Returns the result as a double.
     * @param array The array containing elements of types extending java.lang.Number.
     * @param <T>   The generic type of the array elements, extending java.lang.Number.
     * @return The sum of the elements in the array as a double.
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0.0;

        for(int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        return sum;
    }
}
