import interfaces.IMicrowaveState;

public class OnState implements IMicrowaveState {

    private Microwave context;

    public OnState(Microwave context) {
        this.context = context;
    }

    @Override
    public void turnOn() {
        System.out.println("This oven is already on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off oven: OnState -> OffState");
        this.context.setState(new OffState(this.context));
    }

    @Override
    public void startCooking() {
        System.out.println("Turning off oven: OnState -> RunningState");
        this.context.setState(new RunningState(this.context));
    }

    @Override
    public void cancel() {
        System.out.println("Oven is not running, nothing to cancel");
    }
}
