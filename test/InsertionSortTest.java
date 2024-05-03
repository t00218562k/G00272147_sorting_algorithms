import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    @Test
    void testSort() {
        SortingAlgorithm sorter = new InsertionSort();
        int[] input = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};

        sorter.sort(input);

        assertArrayEquals(expected, input);
    }
}