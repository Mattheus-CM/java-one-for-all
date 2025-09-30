package martins.mattheus.javaoneforall.javacore.Npolymorphism.domain;

public abstract class Product implements Taxable {
    protected String name;
    protected double value;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
