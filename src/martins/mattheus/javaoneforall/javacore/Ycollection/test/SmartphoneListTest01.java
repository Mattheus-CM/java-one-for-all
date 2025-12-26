package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1BC1","iPhone");
        Smartphone smartphone2 = new Smartphone("2222","Pixel");
        Smartphone smartphone3 = new Smartphone("3333","Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

//        smartphones.clear();

        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone smartphone4 = new Smartphone("2222","Pixel");

        System.out.println(smartphones.contains(smartphone4));

        System.out.println(smartphones.indexOf(smartphone4));

    }
}
