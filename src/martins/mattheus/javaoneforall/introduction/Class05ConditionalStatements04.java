package martins.mattheus.javaoneforall.introduction;

public class Class05ConditionalStatements04 {
    /**
     * I want to know how much I have to pay in the Netherlands based on mu annual salary
     *
     * if salary < 34713 -> tax = 9.7%
     * else if salary < 68508 -> tax = 37.35%
     * else -> tax = 49.50%
     */
    public static void main(String[] args) {
        double annualSalary = 25000;
        double firstBracket = 9.70/100;
        double secondBracket = 37.35/100;
        double thirdBracket = 49.50/100;
        double amountToBePaid;
        if (annualSalary < 34713) {
            amountToBePaid = annualSalary * firstBracket;
        } else if (annualSalary < 68508) {
            amountToBePaid = annualSalary *  secondBracket;
        } else {
            amountToBePaid = annualSalary * thirdBracket;
        }

        System.out.println(amountToBePaid);
    }
}
