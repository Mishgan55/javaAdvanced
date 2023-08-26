package patterns.facade;

import patterns.facade.facade.CarFacade;

public class Test {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
