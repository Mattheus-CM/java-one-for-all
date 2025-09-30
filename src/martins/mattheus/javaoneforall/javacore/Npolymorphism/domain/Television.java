package martins.mattheus.javaoneforall.javacore.Npolymorphism.domain;

public class Television extends Product {
    public static final double TAX_PERCENTAGE = 0.21;

    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculando imposto da TV");
        return this.value * TAX_PERCENTAGE;
    }
}
