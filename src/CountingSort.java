import java.util.Arrays;
/**
 * Implementation of the Counting Sort algorithm.
 * Counting Sort is a non-comparison sorting algorithm
 * that counts occurrences of each value and uses them to place values in sorted order.
 */
public class CountingSort implements SortingAlgorithm {
    @Override
    public void sort(int[] array) {
        // Find the maximum value in the array
        int max = Arrays.stream(array).max().orElse(Integer.MAX_VALUE);
        int[] count = new int[max + 1];

        // Count occurrences of each element
        for (int num : array) count[num]++;

        // Reconstruct the sorted array based on the counts
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) array[index++] = i;
        }
    }
}
