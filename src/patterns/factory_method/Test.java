package patterns.factory_method;

public class Test {

    public static void main(String[] args) {
        CarWinner.getInstance().getWinner(CarType.FIRST_PLACE).drive();
        CarWinner.getInstance().getWinner(CarType.SECOND_PLACE).stop();

    }
}
