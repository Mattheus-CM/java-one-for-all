package martins.mattheus.javaoneforall.javacore.Oexceptions.Runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("(ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e)");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void maybeThrowException () throws SQLException, FileNotFoundException {}
}
