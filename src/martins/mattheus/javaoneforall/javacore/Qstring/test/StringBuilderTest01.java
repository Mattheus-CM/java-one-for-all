package martins.mattheus.javaoneforall.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Mattheus";
        name.concat(" Martins");
        name.substring(0,3);
        System.out.println(name);
        System.out.println();

        StringBuilder sb = new StringBuilder("Mattheus");
        sb.append(" Martins");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);


    }
}
