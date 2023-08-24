package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsTest {
    NumberOfSteps numberOfSteps;

    @BeforeEach
    void getData(){
        numberOfSteps=new NumberOfSteps();
    }

    @Test
    void numberOfStepsTest1() {
        assertEquals(4,numberOfSteps.numberOfSteps(8));
    }
    @Test
    void numberOfStepsTest2() {
        assertEquals(12,numberOfSteps.numberOfSteps(123));
    }
    @Test
    void numberOfStepsTest3() {
        assertEquals(6,numberOfSteps.numberOfSteps(14));
    }
}