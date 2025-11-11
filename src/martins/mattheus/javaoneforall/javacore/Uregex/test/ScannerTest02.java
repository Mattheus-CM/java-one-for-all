package martins.mattheus.javaoneforall.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Naruto, Sasuke, Sakura, true, 200";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(", ");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            } else if (scanner.hasNextBoolean()) {
                System.out.println(scanner.nextBoolean());
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
