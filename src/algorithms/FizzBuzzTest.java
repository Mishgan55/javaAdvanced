package algorithms;

import java.nio.charset.StandardCharsets;


public class FizzBuzzTest {
    public byte[] fizzBuzzTest(int value){
        if (value%3==0 && value%5==0) return "FizzBuzz".getBytes(StandardCharsets.UTF_8);

        if (value%3==0) return "Fizz".getBytes(StandardCharsets.UTF_8);

        if (value%5==0) return "Buzz".getBytes(StandardCharsets.UTF_8);

        throw new IllegalArgumentException("Wrong Number");
    }
}
