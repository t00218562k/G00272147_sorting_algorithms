import java.util.Arrays;
import java.util.Random;
/**
 * The main class to benchmark different sorting algorithms.
 * It generates random arrays and measures the time taken by each algorithm to sort them.
 */
public class TestClass {
    public static void main(String[] args) {
        // Array sizes to test
        int[] sizes = {10, 100, 500, 1000, 5000, 10000};
        // Number of times to run each sort
        int runs = 10;

        // Sorting algorithms to benchmark
        SortingAlgorithm[] algorithms = {
                new BubbleSort(), new SelectionSort(), new InsertionSort(),
                new MergeSort(), new CountingSort()
        };

        // Names of the sorting algorithms
        String[] algorithmNames = {
                "Bubble Sort", "Selection Sort", "Insertion Sort",
                "Merge Sort", "Counting Sort"
        };

        // Benchmark each sorting algorithm with various array sizes
        for (int size : sizes) {
            System.out.println("Array size: " + size);
            int[] array = generateRandomArray(size);
            for (int i = 0; i < algorithms.length; i++) {
                benchmarkSort(algorithmNames[i], algorithms[i], array, runs);
            }
            System.out.println();
        }

        System.out.println("Total runs: " + runs);
    }


    //Benchmarks a sorting algorithm by measuring the average execution time over multiple runs.
    static void benchmarkSort(String sortName, SortingAlgorithm algorithm, int[] array, int runs) {
        long totalTime = 0;

        // Run the sorting algorithm multiple times and measure the execution time
        for (int i = 0; i < runs; i++) {
            // Copy array for each run
            int[] copy = Arrays.copyOf(array, array.length);
            long startTime = System.nanoTime();
            algorithm.sort(copy);
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }

        // Calculate and print the average execution time
        System.out.printf("%s (Average Time for %d runs): %.3f ms%n", sortName, runs, totalTime / (runs * 1_000_000.0));
    }

    // Generates an array of random integers of a given size.
    static int[] generateRandomArray(int size) {
        // Seed for reproducibility
        Random rand = new Random(72147);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10000);
        }
        return array;
    }
}
