package patterns.facade.facade;

import patterns.facade.car_parts.Door;
import patterns.facade.car_parts.Light;
import patterns.facade.car_parts.Wheel;

public class CarFacade {
    private Door door=new Door();
    private Light light=new Light();
    private Wheel wheel=new Wheel();

    public void go(){
        door.open();
        light.light();
        wheel.wheel();
    }
}
