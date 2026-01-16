package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1BC1","iPhone");
        Smartphone smartphone2 = new Smartphone("1BC1","iPhone");
        System.out.println(smartphone1.equals(smartphone2));
    }
}
