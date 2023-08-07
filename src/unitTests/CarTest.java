package unitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}