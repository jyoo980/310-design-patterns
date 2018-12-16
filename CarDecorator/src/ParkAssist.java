import interfaces.ICar;

public class ParkAssist extends CarDecorator {

    public ParkAssist(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding parking assist");
    }
}
