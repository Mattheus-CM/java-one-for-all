package martins.mattheus.javaoneforall.javacore.Oexceptions.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends People {
    @Override
    public void save() throws LoginInvalidException, FileNotFoundException {
        System.out.println("Salvando Funcionário");
    }
}
