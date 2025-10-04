package martins.mattheus.javaoneforall.javacore.Oexceptions.exception.test;

import martins.mattheus.javaoneforall.javacore.Oexceptions.exception.domain.Employee;
import martins.mattheus.javaoneforall.javacore.Oexceptions.exception.domain.LoginInvalidException;
import martins.mattheus.javaoneforall.javacore.Oexceptions.exception.domain.People;

import java.io.FileNotFoundException;

public class OverrideWithExceptionsTest01 {
    public static void main(String[] args) {
        People people = new People();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
