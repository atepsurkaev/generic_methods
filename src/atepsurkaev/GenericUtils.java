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
}
