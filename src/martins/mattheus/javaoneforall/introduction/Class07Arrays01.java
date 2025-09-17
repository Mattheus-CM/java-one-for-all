package martins.mattheus.javaoneforall.introduction;

public class Class07Arrays01 {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 20;
        ages[1] = 30;
        ages[2] = 40;
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}
