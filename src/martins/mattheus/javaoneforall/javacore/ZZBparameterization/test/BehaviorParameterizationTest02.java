package martins.mattheus.javaoneforall.javacore.ZZBparameterization.test;

import martins.mattheus.javaoneforall.javacore.ZZBparameterization.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationTest02 {

    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBefore);
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> predicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
