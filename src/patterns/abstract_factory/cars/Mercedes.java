package patterns.abstract_factory.cars;

import patterns.abstract_factory.transport.Car;

public class Mercedes implements Car {
    @Override
    public void start() {
        System.out.println("stop");
    }

    @Override
    public void stop() {
        System.out.println("start");
    }
}
