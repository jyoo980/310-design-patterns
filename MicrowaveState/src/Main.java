public class Main {

    public static void main(String[] args) {
        Microwave microwave = new Microwave();
        microwave.setState(new OffState(microwave));
        microwave.printState();
        microwave.turnOff();
        microwave.turnOn();
        microwave.printState();
    }
}