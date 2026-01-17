package martins.mattheus.javaoneforall.javacore.Zgenerics.test;

import martins.mattheus.javaoneforall.javacore.Zgenerics.domain.Boat;
import martins.mattheus.javaoneforall.javacore.Zgenerics.service.BoatRentalService;

public class GenericClassesTest02 {
    public static void main(String[] args) {
        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.retrieveAvailableBoat();
        System.out.println("Using the Boat for an entire month");
        boatRentalService.returnRentBoat(boat);
    }
}
