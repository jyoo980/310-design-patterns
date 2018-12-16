import interfaces.IMicrowaveState;

public class RunningState implements IMicrowaveState {

    private Microwave context;

    public RunningState(Microwave context) {
        this.context = context;
    }

    @Override
    public void turnOn() {
        System.out.println("This oven is already running");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off oven: RunningState -> OffState");
        this.context.setState(new OffState(this.context));
    }

    @Override
    public void startCooking() {
        System.out.println("This oven is already running");
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling oven task: RunningState -> OnState");
        this.context.setState(new OnState(this.context));
    }
}
