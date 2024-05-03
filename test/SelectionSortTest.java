import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    void testSort() {
        SortingAlgorithm sorter = new SelectionSort();
        int[] input = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};

        sorter.sort(input);

        assertArrayEquals(expected, input);
    }
}