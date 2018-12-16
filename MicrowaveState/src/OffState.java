import interfaces.IMicrowaveState;

public class OffState implements IMicrowaveState {

    private Microwave context;

    public OffState(Microwave context) {
        this.context = context;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on oven: OffState -> OnState");
        this.context.setState(new OnState(this.context));
    }

    @Override
    public void turnOff() {
        System.out.println("This oven is already off");
    }

    @Override
    public void startCooking() {
        System.out.println("This oven is off, try turning it on first");
    }

    @Override
    public void cancel() {
        System.out.println("This oven is off, there are no tasks to cancel");
    }
}
