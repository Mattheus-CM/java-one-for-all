package martins.mattheus.javaoneforall.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 1D;
        Character characterW = 'M';
        Boolean booleanW = false;

        System.out.println(intW);

        Integer intW2 = Integer.parseInt("34");
        System.out.println(intW2);

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('9'));
        System.out.println();
        System.out.println(Character.isLetterOrDigit('9'));
        System.out.println();
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('!'));
        System.out.println();
        System.out.println(Character.isLowerCase('9'));
        System.out.println(Character.toLowerCase('9'));
    }
}
