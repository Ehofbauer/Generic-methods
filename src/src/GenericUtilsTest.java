import java.util.Arrays;

/**
 * Test class for GenericUtils.
 *
 * @author Elias Hofbauer
 * @version 23-02-2025
 */
public class GenericUtilsTest {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericUtils.reverse(intArray);
        System.out.println("Reversed Integer Array: " + Arrays.toString(intArray));

        String[] strArray = {"A", "B", "C", "D"};
        GenericUtils.reverse(strArray);
        System.out.println("Reversed String Array: " + Arrays.toString(strArray));

        Double[] doubleArray = {1.5, 2.5, 3.5};
        System.out.println("Sum of Double Array: " + GenericUtils.sum(doubleArray));

        Integer[] numArray = {10, 20, 30};
        System.out.println("Sum of Integer Array: " + GenericUtils.sum(numArray));
    }
}
