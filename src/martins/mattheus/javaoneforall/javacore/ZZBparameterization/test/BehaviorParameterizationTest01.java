package martins.mattheus.javaoneforall.javacore.ZZBparameterization.test;

import martins.mattheus.javaoneforall.javacore.ZZBparameterization.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorParameterizationTest01 {

    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));

    private static List<Car> filterGreenCars(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterRedCars(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarsByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarsByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public static void main(String[] args) {
        System.out.println(filterGreenCars(cars));
        System.out.println(filterRedCars(cars));
        System.out.println(filterCarsByColor(cars, "green"));
        System.out.println(filterCarsByColor(cars, "red"));
        System.out.println("----------------");
        System.out.println(filterCarsByYearBefore(cars, 2015));
    }
}
