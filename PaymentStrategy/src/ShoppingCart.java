import interfaces.IPaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;
    private PaymentContext context;

    public ShoppingCart(IPaymentStrategy strategy) {
        this.items = new ArrayList<>();
        this.context = new PaymentContext(strategy);
    }

    public List<Item> addToCart(Item item) {
        this.items.add(item);
        return this.items;
    }

    public List<Item> removeFromCart(Item item) {
        this.items.remove(item);
        return this.items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void checkOut() {
        double totalAmount = this.getTotal();
        this.context.pay(totalAmount);
    }

    public IPaymentStrategy setPaymentStrategy(IPaymentStrategy strategy) {
        return this.context.setStrategy(strategy);
    }

    private double getTotal() {
        double itemCostSum = 0;
        for (Item item : items) {
            itemCostSum += item.getCost();
        }
        return itemCostSum;
    }
}
