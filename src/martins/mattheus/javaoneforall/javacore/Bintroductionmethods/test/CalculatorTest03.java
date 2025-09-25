package martins.mattheus.javaoneforall.javacore.Bintroductionmethods.test;

import martins.mattheus.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.divideTwoNumbers(5, 2);
        System.out.println(result);

        double result2 = calculator.divideTwoNumbers02(5, 2);
        System.out.println(result2);

        calculator.printTwoNumbersDivided(6, 2);
    }
}
