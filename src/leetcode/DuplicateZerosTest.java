package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateZerosTest {


    @Test
    public void testDuplicateZeros() {
        int[][] testCases = {
                {1, 0, 2, 3, 0, 4, 5, 0}, // Original array with zeros
                {1, 2, 3, 4, 5},           // No zeros
                {0, 1, 0, 2, 0, 3}         // Zeros separated by non-zero values
        };

        int[][] expectedResults = {
                {1, 0, 0, 2, 3, 0, 0, 4,5,0,0}, // Expected array after duplicating zeros
                {1, 2, 3, 4, 5},           // No zeros, array remains unchanged
                {0, 0, 1, 0, 0, 2, 0, 0, 3} // Expected result with duplicated zeros
        };

        DuplicateZeros duplicator = new DuplicateZeros();

        for (int i = 0; i < testCases.length; i++) {
            int[] arr = testCases[i].clone(); // Clone to keep original array intact
            duplicator.duplicateZeros(arr);
            assertArrayEquals(expectedResults[i], arr, "Test case " + (i + 1) + " failed");
        }
    }
}