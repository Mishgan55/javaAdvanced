package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {


    @Test
    public void testMerge() {
        MergeSortedArray solution = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, nums1);
    }


    @Test
    public void testMergeWithEmptySecondArray() {
        MergeSortedArray solution = new MergeSortedArray();

        int[] nums1 = {4, 5, 6};
        int[] nums2 = new int[0];
        int m = 3;
        int n = 0;

        solution.merge(nums1, m, nums2, n);

        int[] expected = {4, 5, 6};
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeWithBothEmptyArrays() {
        MergeSortedArray solution = new MergeSortedArray();

        int[] nums1 = new int[0];
        int[] nums2 = new int[0];
        int m = 0;
        int n = 0;

        solution.merge(nums1, m, nums2, n);

        int[] expected = new int[0];
        assertArrayEquals(expected, nums1);
    }
}