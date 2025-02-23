/**
 * A utility class for generic operations.
 *
 * @author Elias Hofbauer
 * @version 23-02-2025
 */
public class GenericUtils {
    /**
     * Reverses the elements of a given array in place.
     *
     * @param array the array to reverse
     * @param <T> the type of elements in the array
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Calculates the sum of an array of numbers.
     *
     * @param array the array of numbers
     * @param <T>   the type of numbers in the array, must extend Number
     * @return the sum of all values as a double
     */
    public static <T extends Number> double sum(T[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i].doubleValue();
        }
        return total;
    }
}
