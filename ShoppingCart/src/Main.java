import java.util.LinkedList;
import java.util.List;

public class Main {

    private static int computeCheckout(List<ItemElement> items) {
        ShoppingCartVisitor cartVisitor = new ShoppingCartVisitor();
        int totalCost = 0;
        for (ItemElement item : items) {
            totalCost += item.accept(cartVisitor);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        LinkedList<ItemElement> items = new LinkedList<>();
        items.add(new Book(20, "1234"));
        items.add(new Book(100, "5678"));
        items.add(new Fruit("Orange", 3, 4));
        items.add(new Fruit("Apple", 5, 2));
        System.out.println(computeCheckout(items));
    }
}