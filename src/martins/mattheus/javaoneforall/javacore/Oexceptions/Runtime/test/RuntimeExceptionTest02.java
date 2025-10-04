package martins.mattheus.javaoneforall.javacore.Oexceptions.Runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            division(3, 0);
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    private static int division(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("O segundo parâmetro não pode ser 0");
        }
        return number1 / number2;
    }
}
