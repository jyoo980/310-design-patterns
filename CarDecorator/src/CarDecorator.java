import interfaces.ICar;

public class CarDecorator implements ICar {

    private ICar car;

    public CarDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

    @Override
    public void listFeature() {
        this.car.listFeature();
    }
}
