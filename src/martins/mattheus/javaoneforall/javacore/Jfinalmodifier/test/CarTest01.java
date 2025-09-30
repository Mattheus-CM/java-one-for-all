package martins.mattheus.javaoneforall.javacore.Jfinalmodifier.test;

import martins.mattheus.javaoneforall.javacore.Jfinalmodifier.domain.Buyer;
import martins.mattheus.javaoneforall.javacore.Jfinalmodifier.domain.Car;
import martins.mattheus.javaoneforall.javacore.Jfinalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        Buyer buyer = new Buyer();

        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.BUYER);
        car.BUYER.setName("Kratos");
        System.out.println(car.BUYER);


        Ferrari ferrari = new Ferrari();
        ferrari.print();
        ferrari.setName("Enzzo");
        ferrari.print();

    }
}
