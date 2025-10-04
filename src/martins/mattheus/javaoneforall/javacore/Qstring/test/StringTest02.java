package martins.mattheus.javaoneforall.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Mattheus";
        System.out.println(name.charAt(1));
        System.out.println(name.length());
        System.out.println(name.replace("t","KK"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println();

        String numbers = " 012345 1";
        System.out.println(numbers.length());
        System.out.println(numbers.substring(0,3));
        System.out.println(numbers.trim());

    }
}
