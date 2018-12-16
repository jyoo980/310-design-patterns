import interfaces.IPaymentStrategy;

public class CardPayment implements IPaymentStrategy {

    private String holder;
    private String expiryDate;
    private int cvv;

    public CardPayment(String holder, String expiryDate, int cvv) {
        this.holder = holder;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public String getHolder() {
        return holder;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getCvv() {
        return cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Amount paid via card: " + amount);
    }
}
