package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceElementsTest {

    @Test
    void replaceElements() {
        ReplaceElements replaceElements = new ReplaceElements();

        assertArrayEquals(new int[]{18,6,6,6,1,-1},replaceElements.replaceElements(new int[]{17,18,5,4,6,1}));
    }
}