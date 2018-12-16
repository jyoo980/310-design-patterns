import interfaces.IMicrowaveState;

public class Microwave {

    private IMicrowaveState state;

    public Microwave() {

    }

    public void setState(IMicrowaveState state) {
        this.state = state;
    }

    public void printState() {
        System.out.println(this.state);
    }

    public void turnOff() {
        this.state.turnOff();
    }

    public void turnOn() {
        this.state.turnOn();
    }

    public void run() {
        this.state.startCooking();
    }

    public void stop() {
        this.state.cancel();
    }
}
