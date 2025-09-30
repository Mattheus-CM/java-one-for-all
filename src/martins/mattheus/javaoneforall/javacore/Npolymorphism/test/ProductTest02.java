package martins.mattheus.javaoneforall.javacore.Npolymorphism.test;

import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Computer;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Product;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product01 = new Computer("Lenovo Ideapad Gaming 3", 4000);
        System.out.println(product01.calculateTaxValue());

        Product product02 = new Tomato("Tomatão", 10);
        System.out.println(product02.calculateTaxValue());
    }
}
