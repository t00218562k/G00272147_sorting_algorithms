/**
 * Implementation of the Selection Sort algorithm.
 * Selection Sort finds the minimum element from the unsorted portion
 * and swaps it with the first element of the unsorted portion.
 */
public class SelectionSort  implements SortingAlgorithm {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap array[i] and array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
