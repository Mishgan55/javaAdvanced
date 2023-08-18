package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTestTest {
    FizzBuzzTest fizzBuzzTest;
    @BeforeEach
    void createData(){
        fizzBuzzTest = new FizzBuzzTest();
    }

    @Test
    void fizzBuzzTestNumberDividedBy3() {
        assertArrayEquals( "Fizz".getBytes(StandardCharsets.UTF_8),fizzBuzzTest.fizzBuzzTest(3));
    }
    @Test
    void fizzBuzzTestNumber5() {
        assertArrayEquals( "Buzz".getBytes(StandardCharsets.UTF_8),fizzBuzzTest.fizzBuzzTest(5));
    }
    @Test
    void fizzBuzzTestNumberDividedBy3and5() {
        assertArrayEquals( "FizzBuzz".getBytes(StandardCharsets.UTF_8),fizzBuzzTest.fizzBuzzTest(15));
    }
    @Test
    void fizzBuzzTestNumberDividedBy1() {
        assertThrows(IllegalArgumentException.class,()->fizzBuzzTest.fizzBuzzTest(1));
    }
}