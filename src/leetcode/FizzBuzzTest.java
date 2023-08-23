package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void createData(){
        fizzBuzz=new FizzBuzz();
    }
    @Test
    void fizzBuzzTest1() {

        assertArrayEquals(new String[]{"1","2","Fizz"},fizzBuzz.fizzBuzz(3).toArray());
    }
    @Test
    void fizzBuzzTest2() {

        assertArrayEquals(new String[]{"1","2","Fizz","4","Buzz"},fizzBuzz.fizzBuzz(5).toArray());
    }
    @Test
    void fizzBuzzTest3() {

        assertArrayEquals(new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"}
                ,fizzBuzz.fizzBuzz(15).toArray());
    }
}