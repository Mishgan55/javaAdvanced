package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(2,searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
    }
}