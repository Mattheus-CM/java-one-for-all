package martins.mattheus.javaoneforall.introduction;

public class Class05ConditionalStatements02 {
    public static void main(String[] args) {
        // age < 15 -> Junior
        // age < 18 -> Senior
        // age > 18 -> Masters
        int age = 20;
        String category = "Uncategorized";
        if (age < 15){
            category = "Category Junior";
        } else if (age < 18){
            category = "Category Senior";
        } else {
            category = "Category Masters";
        }
        category = age < 15 ? "Category Junior" : (age < 18) ? "Category Senior" : "Category Masters";

        System.out.println(category);
    }
}
