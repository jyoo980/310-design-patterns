import interfaces.ICar;

public class NavSystem extends CarDecorator {

    public NavSystem(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding navigation system");
    }
}
