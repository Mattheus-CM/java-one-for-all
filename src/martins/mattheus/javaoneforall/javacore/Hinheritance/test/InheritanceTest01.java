package martins.mattheus.javaoneforall.javacore.Hinheritance.test;

import martins.mattheus.javaoneforall.javacore.Hinheritance.domain.Address;
import martins.mattheus.javaoneforall.javacore.Hinheritance.domain.Employee;
import martins.mattheus.javaoneforall.javacore.Hinheritance.domain.People;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua dos Bobos");
        address.setZipCode("00000");
        People people = new People("João");
        people.setCpf("1111111");
        people.setAddress(address);

        people.print();
        System.out.println();

        Employee employee = new Employee("Maria");
        employee.setCpf("22222222");
        employee.setAddress(address);
        employee.setSalary(20000);
        employee.print();
    }
}
