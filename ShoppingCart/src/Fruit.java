public class Fruit implements ItemElement {

    private String name;
    private int weightInKg;
    private int pricePerKg;

    public Fruit(String name, int weightInKg, int pricePerKg) {
        this.name = name;
        this.weightInKg = weightInKg;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return this.name;
    }

    public int getWeightInKg() {
        return this.weightInKg;
    }

    public int getPricePerKg() {
        return this.pricePerKg;
    }

    @Override
    public int accept(ICartVisitor visitor) {
        return visitor.visit(this);
    }
}
