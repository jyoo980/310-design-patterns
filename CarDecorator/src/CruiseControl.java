import interfaces.ICar;

public class CruiseControl extends CarDecorator {

    public CruiseControl(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding cruise control");
    }
}
