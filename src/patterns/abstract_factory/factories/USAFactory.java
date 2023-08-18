package patterns.abstract_factory.factories;

import patterns.abstract_factory.aircrafts.TU137;
import patterns.abstract_factory.cars.BMW;
import patterns.abstract_factory.factory.TransportAndAircraftFactory;
import patterns.abstract_factory.transport.Aircraft;
import patterns.abstract_factory.transport.Car;

public class USAFactory implements TransportAndAircraftFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU137();
    }
}
