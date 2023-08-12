package unitTests;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carName;
    private int number;
    private int year;
    private String currentOwner;
    private List<String> lastOwners=new ArrayList<>();

    public Car(String carName, int number, int year, String currentOwner) {
        this.carName = carName;
        this.number = number;
        this.year = year;
        this.currentOwner = currentOwner;
        lastOwners.add(currentOwner);
    }

    public String getCarName() {
        return carName;
    }


    public int getNumber() {
        return number;
    }


    public int getYear() {
        return year;
    }


    public String getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(String currentOwner) {
        this.currentOwner = currentOwner;
        lastOwners.add(currentOwner);
    }

    public List<String> getLastOwners() {
        return lastOwners;
    }

    private String someString(String name){
        return name;
    }

}
