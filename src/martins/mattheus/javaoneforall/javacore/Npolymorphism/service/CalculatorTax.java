package martins.mattheus.javaoneforall.javacore.Npolymorphism.service;

import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Computer;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Product;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class CalculatorTax {
    public static void calculateTax(Product product) {
        System.out.println("Relatório de imposto");
        double taxValue = product.calculateTaxValue();
        System.out.println("Produto: " + product.getName());
        System.out.println("Valor: " + product.getValue());
        System.out.println("Imposto: " + taxValue);
        if (product instanceof Tomato) {
            Tomato tomato = (Tomato) product;
            System.out.println(tomato.getValidDate());
        }
    }
}
