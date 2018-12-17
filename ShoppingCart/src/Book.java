public class Book implements ItemElement {

    private int price;
    private String isbn;

    public Book(int price, String isbn) {
        this.price = price;
        this.isbn = isbn;
    }

    public int getPrice() {
        return this.price;
    }

    public String getIsbn() {
        return this.isbn;
    }

    @Override
    public int accept(ICartVisitor visitor) {
        return visitor.visit(this);
    }
}
