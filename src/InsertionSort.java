/**
 * Implementation of the Insertion Sort algorithm.
 * Insertion Sort builds a sorted array one item at a time,
 * shifting elements as needed to insert the new element in the correct position.
 */
public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
