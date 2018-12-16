public class Main {

    public static void main(String[] args) {
        Item item1 = new Item(33.00);
        Item item2=  new Item(11.99);
        ShoppingCart cart = new ShoppingCart(new OnlinePayment("James Yoo", "PayPal"));
        cart.addToCart(item1);
        cart.checkOut();
        cart.setPaymentStrategy(new CardPayment("James Yoo", "2022-10-11", 233));
        cart.addToCart(item2);
        cart.checkOut();
    }

}
