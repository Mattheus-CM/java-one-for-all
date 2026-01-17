package martins.mattheus.javaoneforall.javacore.Zgenerics.test;

import martins.mattheus.javaoneforall.javacore.Zgenerics.domain.Boat;
import martins.mattheus.javaoneforall.javacore.Zgenerics.domain.Car;
import martins.mattheus.javaoneforall.javacore.Zgenerics.service.BoatRentalService;
import martins.mattheus.javaoneforall.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest03 {
    public static void main(String[] args) {
        List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));
        List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));

        RentalService<Car> carRentalService = new RentalService<>(carsAvailable);
        Car car = carRentalService.retrieveAvailableObject();
        System.out.println("Using the car for an entire month");
        carRentalService.returnRentCar(car);

        System.out.println("--------------------");

        RentalService<Boat> boatRentalService = new RentalService<>(boatsAvailable);
        Boat boat = boatRentalService.retrieveAvailableObject();
        System.out.println("Using the boat for an entire month");
        boatRentalService.returnRentCar(boat);

    }
}
