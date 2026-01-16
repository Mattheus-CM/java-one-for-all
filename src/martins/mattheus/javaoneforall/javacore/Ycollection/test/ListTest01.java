package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        List<String> names2 = new ArrayList();
        names.add("Mattheus");
        names.add("João");
        names2.add("Martins");
        names2.add("Tiago");


        for (String name : names) {
            System.out.println(name);
        }

        names.addAll(names2);
        System.out.println("-------------");
        names.remove("João");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


        List<Integer> numbers = new ArrayList();
        numbers.add(1);

    }
}
