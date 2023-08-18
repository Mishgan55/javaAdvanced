package patterns.abstract_factory.aircrafts;

import patterns.abstract_factory.transport.Aircraft;

public class Boeing747 implements Aircraft {
    @Override
    public void fly() {
        System.out.println("fly");
    }
}
