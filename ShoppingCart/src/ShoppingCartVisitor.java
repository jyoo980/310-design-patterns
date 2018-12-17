public class ShoppingCartVisitor implements ICartVisitor {

    private static final int BOOK_DISCOUNT_COST = 50;

    @Override
    public int visit(Book book) {
        // Apply a 10% discount if the book costs more than 50 dollars
        int bookPrice = book.getPrice();
        if (bookPrice >= BOOK_DISCOUNT_COST) {
            return this.applyDiscount(bookPrice);
        }
        return bookPrice;
    }

    @Override
    public int visit(Fruit fruit) {
        return fruit.getPricePerKg() * fruit.getWeightInKg();
    }

    private int applyDiscount(int bookPrice) {
        int discount = (int) (bookPrice * 0.10);
        return bookPrice - discount;
    }
}
