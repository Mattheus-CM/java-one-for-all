package martins.mattheus.javaoneforall.javacore.Aintroductionclasses.test;

import martins.mattheus.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Fusca Bala";
        car1.model = "Sport";
        car1.year = 1969;

        car2.name = "Mustang";
        car2.model = "GT 500";
        car2.year = 1960;

        System.out.println("Carro 1");
        System.out.println("Nome: "+ car1.name);
        System.out.println("Modelo: "+ car1.model);
        System.out.println("Ano: "+ car1.year);

        System.out.println("\nCarro 2");
        System.out.println("Nome: "+ car2.name);
        System.out.println("Modelo: "+ car2.model);
        System.out.println("Ano: "+ car2.year);
    }
}
