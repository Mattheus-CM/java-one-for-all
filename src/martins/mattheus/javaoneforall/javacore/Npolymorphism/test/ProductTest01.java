package martins.mattheus.javaoneforall.javacore.Npolymorphism.test;

import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Computer;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Television;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.service.CalculatorTax;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo Ideapad Gaming 3", 4000);
        Tomato tomato = new Tomato("Tomatão", 10);
        Television television = new Television("LG 52\"", 2000);

        CalculatorTax.calculateTax(computer);
        System.out.println("-------------------------------");
        CalculatorTax.calculateTax(tomato);
        System.out.println("-------------------------------");
        CalculatorTax.calculateTax(television);
    }
}
