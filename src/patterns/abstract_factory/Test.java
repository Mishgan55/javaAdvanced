package patterns.abstract_factory;

import patterns.abstract_factory.factories.USAFactory;
import patterns.abstract_factory.factory.TransportAndAircraftFactory;
import patterns.abstract_factory.transport.Aircraft;
import patterns.abstract_factory.transport.Car;

public class Test {
    public static void main(String[] args) {
        TransportAndAircraftFactory usaFactory = new USAFactory();
        Aircraft aircraft = usaFactory.createAircraft();
        aircraft.fly();

    }
}
