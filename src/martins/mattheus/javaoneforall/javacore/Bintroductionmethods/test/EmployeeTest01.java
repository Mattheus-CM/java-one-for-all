package martins.mattheus.javaoneforall.javacore.Bintroductionmethods.test;

import martins.mattheus.javaoneforall.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Mattheus";
        employee.age = 23;
        employee.salaries = new double[]{1500, 2000, 2500};

        employee.print();
    }
}
