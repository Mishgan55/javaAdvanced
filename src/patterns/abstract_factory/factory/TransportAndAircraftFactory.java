package patterns.abstract_factory.factory;

import patterns.abstract_factory.transport.Aircraft;
import patterns.abstract_factory.transport.Car;

public interface TransportAndAircraftFactory {

    Car createCar();

    Aircraft createAircraft();

}
