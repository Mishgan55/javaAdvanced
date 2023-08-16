package unitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    void preparedData(){
        car = new Car("Mercedes",1111,2008,"Mikhail Khorsun");
    }

    @Test
    void getCarName() {
        assertEquals("Mercedes",car.getCarName());
    }

    @Test
    void getNumber() {
        assertEquals(1111,car.getNumber());
    }

    @ParameterizedTest
    @CsvSource({"1234", "1111", "0001"})
    void setMultipleNumber(int input){
        car.setNumber(input);
        assertEquals(input,car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2008,car.getYear());
    }

    @Test
    void getCurrentOwner() {
        assertEquals("Mikhail Khorsun",car.getCurrentOwner());
    }

    @Test
    void setCurrentOwner() {
        car.setCurrentOwner("Hanna");
        assertEquals("Hanna",car.getCurrentOwner());
    }

    @Test
    void getLastOwners() {
        assertArrayEquals(new String[]{"Mikhail Khorsun"},car.getLastOwners().toArray());
    }
    @Test
    void getLastOwners2() {
        car.setCurrentOwner("Hanna");
        assertArrayEquals(new String[]{"Mikhail Khorsun","Hanna"},car.getLastOwners().toArray());
    }

    @ParameterizedTest
    @CsvSource({"Misha","Hanna"})
    @EmptySource
    void testSomeString(String value){
        try {
            Method method=Car.class.getDeclaredMethod("someString",String.class);
            method.setAccessible(true);

            assertEquals(value,method.invoke(car,value).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}