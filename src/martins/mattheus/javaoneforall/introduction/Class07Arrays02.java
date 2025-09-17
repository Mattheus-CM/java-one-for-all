package martins.mattheus.javaoneforall.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Naruto";
        names[1] = "Sasuke";
        names[2] = "Sakura";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
