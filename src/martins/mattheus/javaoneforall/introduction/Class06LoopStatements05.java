package martins.mattheus.javaoneforall.introduction;

public class Class06LoopStatements05 {
    /**
     * Given a car's total price, for example 20000
     *     I want to find how much and for how long I'll have to pay monthly.
     *     Condition: The monthly payment cannot be lower than 1000
     */
    public static void main(String[] args) {
        double totalPrice = 20000;
        for (int monthlyCount = (int) totalPrice; monthlyCount >= 1; monthlyCount--) {
            double monthlyPrice = totalPrice / monthlyCount;
            if (monthlyPrice < 1000) {
                continue;
            }

            System.out.println("Months " + monthlyCount + " Price " + monthlyPrice);
        }
    }
}
