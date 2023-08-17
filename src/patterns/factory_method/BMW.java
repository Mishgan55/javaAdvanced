package patterns.factory_method;

import java.util.Random;

public class BMW implements Car{
    Random random =new Random();
    @Override
    public void drive() {
        System.out.println(random.nextInt(200)+" km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
