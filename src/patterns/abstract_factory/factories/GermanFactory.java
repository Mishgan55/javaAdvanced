package patterns.abstract_factory.factories;

import patterns.abstract_factory.aircrafts.Boeing747;
import patterns.abstract_factory.cars.Mercedes;
import patterns.abstract_factory.factory.TransportAndAircraftFactory;
import patterns.abstract_factory.transport.Aircraft;
import patterns.abstract_factory.transport.Car;

public class GermanFactory implements TransportAndAircraftFactory {
    @Override
    public Car createCar() {
        return new Mercedes();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
