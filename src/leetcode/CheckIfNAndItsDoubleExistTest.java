package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfNAndItsDoubleExistTest {

    @Test
    void checkIfExistTest1() {
        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        assertTrue(checkIfNAndItsDoubleExist.checkIfExist(new int[]{10,2,5,3}));
    }
    @Test
    void checkIfExistTest2() {
        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        assertFalse(checkIfNAndItsDoubleExist.checkIfExist(new int[]{3,1,7,11}));
    }
}