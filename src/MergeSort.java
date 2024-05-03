import java.util.Arrays;
/**
 * Implementation of the Merge Sort algorithm.
 * Merge Sort is a divide-and-conquer algorithm that recursively
 * divides the array into halves, sorts them, and merges the sorted halves.
 */
public class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(int[] array) {
        // Base case: Array of size < 2 is already sorted
        if (array.length < 2) return;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Recursively sort the left half
        sort(left);

        // Recursively sort the right half
        sort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    private void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge elements into the original array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements from left and right subarrays
        while (i < left.length) array[k++] = left[i++];
        while (j < right.length) array[k++] = right[j++];
    }
}
