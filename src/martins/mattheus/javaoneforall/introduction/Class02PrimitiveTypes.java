package martins.mattheus.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        int age = 22; // 0
        long longNumber = 1000000000; // 0
        float floatNumber = 57.35F; // 0.0F
        double doubleNumber = 1_000_000_000_000D; // 0.0D
        boolean isTrue = false; // false
        byte byteNumber = 127; // 0
        short shortNumber = 32_767; // 0
        char character = '\u004D'; // \u0000
        System.out.println("I am " + age + " years old");
        System.out.println(character);

        // casting
        float floatValue = (float) 2.55;

        // Strings
        // String is not a primitive type, but it will be used a lot in classes.
        String name = "Mattheus";
        System.out.println("My name is " + name);
        }
}
