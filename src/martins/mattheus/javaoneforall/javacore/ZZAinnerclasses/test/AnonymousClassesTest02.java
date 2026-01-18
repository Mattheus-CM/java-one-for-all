package martins.mattheus.javaoneforall.javacore.ZZAinnerclasses.test;

import martins.mattheus.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> boats = new ArrayList<>(List.of(new Boat("Boat3"), new Boat("Boat1"), new Boat("Boat2")));
        boats.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat boat1, Boat boat2) {
                return boat1.getName().compareTo(boat2.getName());
            }
        });

        System.out.println(boats);
    }
}
