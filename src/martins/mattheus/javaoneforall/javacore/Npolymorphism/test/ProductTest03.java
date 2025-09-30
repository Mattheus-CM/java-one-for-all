package martins.mattheus.javaoneforall.javacore.Npolymorphism.test;

import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Computer;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Product;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.service.CalculatorTax;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product01 = new Computer("Lenovo Ideapad Gaming 3", 4000);

        Tomato tomato = new Tomato("Tomatão", 10);
        tomato.setValidDate("11/09/2001");

        CalculatorTax.calculateTax(tomato);
        System.out.println();
        CalculatorTax.calculateTax(product01);

    }
}
