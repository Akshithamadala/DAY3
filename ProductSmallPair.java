import java.util.Arrays;

public class ProductSmallPair {

    public static int productSmallPair(int sum, int[] arr) {
        // Check if the array is empty or has less than 2 elements
        if (arr == null || arr.length < 2) {
            return -1; // Return -1 if invalid input
        }

        // Sort the array to find the two smallest elements
        Arrays.sort(arr);

        // Find the two smallest elements
        int smallest1 = arr[0];
        int smallest2 = arr[1];

        // Check if their sum is less than the given sum
        if (smallest1 + smallest2 < sum) {
            return smallest1 * smallest2; // Return their product
        }

        return 0; // Return 0 if no valid pair is found
    }

    public static void main(String[] args) {
        int sum = 9; // Given sum
        int[] arr = {5, 4, 2, 3, 9, 1, 7}; // Given array

        int result = productSmallPair(sum, arr);
        System.out.println("Output: " + result);
    }
}
