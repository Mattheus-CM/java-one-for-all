package martins.mattheus.javaoneforall.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Mattheus"; // String Constant Pool
        String name2 = "Mattheus";
        name.concat(" Martins");
        System.out.println(name);
        System.out.println(name == name2);
        name = name.concat(" Martins");
        System.out.println(name == name2);
        System.out.println();

        String name3 = new String("Mattheus"); // Extremamente pesado
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());

    }
}
