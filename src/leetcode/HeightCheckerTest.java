package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightCheckerTest {

    @Test
    void heightChecker() {
        HeightChecker heightChecker = new HeightChecker();

        assertEquals(3,heightChecker.heightChecker(new int[]{1,1,4,2,1,3}));
    }
}