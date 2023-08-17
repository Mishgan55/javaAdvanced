package patterns.factory_method;

public class CarWinner {
    private static final CarWinner instance=new CarWinner();
    public  static CarWinner getInstance(){
        return instance;
    }
    private CarWinner(){

    }

    public Car getWinner(CarType carType){
        Car car=null;
        switch (carType){
            case FIRST_PLACE:
                car=new Mercedes();
                break;
            case SECOND_PLACE:
                car=new BMW();
                break;
            case THIRD_PLACE:
                car=new Audi();
                break;
        }
        return car;

    }
}
