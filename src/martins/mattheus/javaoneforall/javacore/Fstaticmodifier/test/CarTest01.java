package martins.mattheus.javaoneforall.javacore.Fstaticmodifier.test;

import martins.mattheus.javaoneforall.javacore.Fstaticmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car.setLimitSpeed(275);

        Car car1 = new Car("BMW", 200);
        Car car2 = new Car("Mercedes", 275);
        Car car3 = new Car("Audi", 290);

        car1.print();
        car2.print();
        car3.print();
    }
}
