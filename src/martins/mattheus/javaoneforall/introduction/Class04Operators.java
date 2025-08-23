package martins.mattheus.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        // + - * /
        int number01 = 5;
        double number02 = 6;
        double result = number02 / number01;
        System.out.println(result);


        // %
        int modulo = 21 % 2;
        System.out.println(modulo);


        // < > <= >= != ==
        boolean isLowerThan = number02 < number01;
        boolean isGreaterOrEqualsThan = number02 >= number01;
        boolean isDifferentThan = number02 != number01;
        System.out.println(isLowerThan);
        System.out.println(isGreaterOrEqualsThan);
        System.out.println(isDifferentThan);


        // && || !
        int age = 35;
        float salary = 3500;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;
        System.out.println("isLegalOlderThanThirty " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty " + isLegalYoungerThanThirty);

        double currentAccount = 299;
        double savingsAccount = 3000;
        float playstationPrice = 500;
        boolean canBeBought = currentAccount > playstationPrice || savingsAccount > playstationPrice;
        System.out.println("canBeBought " + canBeBought);


        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000;
        System.out.println("bonus " + bonus);


        // Unary ++ --
        int count = 3;
        count++;
        count--;
        System.out.println(count);

    }
}
