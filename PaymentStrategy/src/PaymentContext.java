import interfaces.IPaymentStrategy;

public class PaymentContext {

    private IPaymentStrategy strategy;

    public PaymentContext(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public IPaymentStrategy getStrategy() {
        return strategy;
    }

    public IPaymentStrategy setStrategy(IPaymentStrategy strategy) {
        this.strategy = strategy;
        return strategy;
    }

    public void pay(double amount) {
        this.strategy.pay(amount);
    }
}
