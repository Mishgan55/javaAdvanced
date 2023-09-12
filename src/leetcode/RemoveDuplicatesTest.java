package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(10,removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4,5,5,6,6,8,8,8,8,9,9,10,10,10}));
    }
}