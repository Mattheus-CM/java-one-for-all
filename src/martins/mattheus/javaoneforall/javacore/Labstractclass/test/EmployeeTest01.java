package martins.mattheus.javaoneforall.javacore.Labstractclass.test;

import martins.mattheus.javaoneforall.javacore.Labstractclass.domain.Developer;
import martins.mattheus.javaoneforall.javacore.Labstractclass.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 1000);
        Developer developer = new Developer("Naruto", 100);

        System.out.println(manager);
        System.out.println(developer);
        manager.print();
    }
}
