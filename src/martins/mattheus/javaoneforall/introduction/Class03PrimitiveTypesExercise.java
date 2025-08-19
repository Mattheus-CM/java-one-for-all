package martins.mattheus.javaoneforall.introduction;

/**
 * Create variables for the fields described below between () and print the following message:<br />
 * I (name), living at (address), confirm that I received the salary of (salary) on (date).
 */

public class Class03PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Mattheus";
        String address = "Rua dos Bobos, N°0, Centro";
        double salary = 3500;
        String receivedSalaryDate = "12/09/2026"; // dd/MM/yyyy

        System.out.println("I, "+ name + ", living at "+ address + ", confirm that i received the salary of "+ salary + " on "+ receivedSalaryDate + ".");
    }
}
