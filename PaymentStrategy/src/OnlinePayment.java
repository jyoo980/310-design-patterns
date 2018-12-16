import interfaces.IPaymentStrategy;

public class OnlinePayment implements IPaymentStrategy {

    private String name;
    private String paymentProvider;

    public OnlinePayment(String name, String paymentProvider) {
        this.name = name;
        this.paymentProvider = paymentProvider;
    }

    public String getName() {
        return name;
    }

    public String getPaymentProvider() {
        return paymentProvider;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Amount paid online via: " + paymentProvider + ": " + amount);
    }
}
