package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayTest {

    @Test
    void validMountainArrayTest1() {
        ValidMountainArray validMountainArray = new ValidMountainArray();
        assertTrue(validMountainArray.validMountainArray(new int[]{0,3,2,1}));
    }
}