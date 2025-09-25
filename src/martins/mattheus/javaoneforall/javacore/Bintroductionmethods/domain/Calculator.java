package martins.mattheus.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 10);
    }

    public void multiplyTwoNumbers(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    public double divideTwoNumbers(double number1, double number2) {
        if (number2 == 0) return 0;
        return number1 / number2;
    }

    public double divideTwoNumbers02(double number1, double number2) {
        if (number2 != 0) return number1 / number2;
        return 0;
    }

    public void printTwoNumbersDivided(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(number1 / number2);
    }

    public void changeTwoNumbers(int number1, int number2) {
        System.out.println("Inside changeTwoNumbers");
        number1 = 33;
        number2 = 66;
        System.out.println("Number 1 -> " + number1);
        System.out.println("Number 2 -> " + number2);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
