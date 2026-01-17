package martins.mattheus.javaoneforall.javacore.Zgenerics.service;

import martins.mattheus.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    private List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));

    public Boat retrieveAvailableBoat() {
        System.out.println("Searching for any Boat available...");
        Boat boat = boatsAvailable.remove(0);
        System.out.println("Renting the Boat: " + boat);
        System.out.println("Available Boats to rent: " + boatsAvailable);
        return boat;
    }

    public void returnRentBoat(Boat boat) {
        System.out.println("Returning Boat: " + boat);
        boatsAvailable.add(boat);
        System.out.println("Available Boats to rent: " + boatsAvailable);
    }
}
