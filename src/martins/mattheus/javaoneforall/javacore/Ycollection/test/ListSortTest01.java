package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on Titan");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Naruto");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        System.out.println(mangas);


        System.out.println("------------");

        List<Double> values = new ArrayList<>();
        values.add(110.21);
        values.add(21.21);
        values.add(23.098);
        values.add(98.91);
        Collections.sort(values);
        System.out.println(values);
    }
}
