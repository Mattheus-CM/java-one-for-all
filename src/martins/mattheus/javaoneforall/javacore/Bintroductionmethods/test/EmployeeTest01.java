package martins.mattheus.javaoneforall.javacore.Bintroductionmethods.test;

import martins.mattheus.javaoneforall.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Mattheus");
        employee.setAge(23);
        employee.setSalaries(new double[]{1500, 2000, 2500});

        employee.print();
    }
}
