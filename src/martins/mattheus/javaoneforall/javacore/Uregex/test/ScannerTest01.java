package martins.mattheus.javaoneforall.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Naruto, Sasuke, Sakura";
        String[] names = text.split(",");
        for (String name: names){
            System.out.println(name.trim());
        }
    }
}
