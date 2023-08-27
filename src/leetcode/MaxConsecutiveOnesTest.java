package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    @Test
    void findMaxConsecutiveOnesTest1() {
        MaxConsecutiveOnes maxConsecutiveOnes=new MaxConsecutiveOnes();
        assertEquals(3,maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
    @Test
    void findMaxConsecutiveOnesTest2() {
        MaxConsecutiveOnes maxConsecutiveOnes=new MaxConsecutiveOnes();
        assertEquals(2,maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
}