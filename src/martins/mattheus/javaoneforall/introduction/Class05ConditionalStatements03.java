package martins.mattheus.javaoneforall.introduction;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        // TERNARY OPERATOR
        // if salary > 2000 can buy ps5 || can't buy
        double salary = 3000;
        // (condition) ? true : false;
        String displayMessage = (salary > 2000) ? "buy PS5" : "don't buy PS5";
        System.out.println(displayMessage);
    }
}
