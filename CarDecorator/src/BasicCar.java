import interfaces.ICar;

public class BasicCar implements ICar {

    @Override
    public void assemble() {
        System.out.println("Basic Car created");
    }

    @Override
    public void listFeature() {
        System.out.println("Basic Car -- No Features");
    }
}
