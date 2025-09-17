package martins.mattheus.javaoneforall.introduction;

public class Class06LoopStatements01 {
    public static void main(String[] args) {
        // while, do-while, for
        byte counter = 0;
        while (counter < 5) {
            System.out.println("Inside while " + ++counter);
        }

        counter = 0;
        do {
            System.out.println("Inside do while " + ++counter);
        } while (counter < 5);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Inside For Statement " + i);
        }
    }
}
