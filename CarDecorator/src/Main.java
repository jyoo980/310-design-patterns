import interfaces.ICar;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating a car with a navigation system");
        ICar car = new NavSystem(new BasicCar());
        System.out.println("Adding cruise control");
        car = new CruiseControl(car);
        car.assemble();
        car = new ParkAssist(car);
    }
}
