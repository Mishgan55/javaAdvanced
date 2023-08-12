package unitTests;




import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;

class DogTest {
    Dog dog;

    @BeforeEach
    void dataPrepared(){
        dog=new Dog("Bob",2);
    }

    @org.junit.jupiter.api.Test
    void getTestName() {
        Assertions.assertEquals("Bob",dog.getName());
    }

    @org.junit.jupiter.api.Test
    void setTestName() {
        dog.setName("dik");
        Assertions.assertEquals("Bob",dog.getName());
    }
    @org.junit.jupiter.api.Test
    void setTestName2() {
        Dog dog= new Dog("",3);
        dog.setName("dik");
        Assertions.assertEquals("dik",dog.getName());
    }

    @org.junit.jupiter.api.Test
    void getYear() {
    }

    @org.junit.jupiter.api.Test
    void setYear() {
    }
}