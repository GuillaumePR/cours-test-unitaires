import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class SorterTest {

    @Test
    @DisplayName("Sort an array of integers")
    public void sort() {
        Integer[] testArray = {32, 39, 48, 56, 24};
        Integer[] expected = {24, 32, 39, 48, 56};

        Sorter.sort(testArray);

        assertArrayEquals(expected, testArray);
    }
}
