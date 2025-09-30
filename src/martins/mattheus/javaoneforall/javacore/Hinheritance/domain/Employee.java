package martins.mattheus.javaoneforall.javacore.Hinheritance.domain;

public class Employee extends People {
    private double salary;

    static {
        System.out.println("Dentro do bloco Static employee");
    }
    {
        System.out.println("Dentro do bloco 1 employee");
    }
    {
        System.out.println("Dentro do bloco 2 employee");
    }

    public Employee(String name) {
        super(name);
        System.out.println("Dentro do construtor employee");
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void print() {
        super.print();
        System.out.println(this.salary);
    }

    public void paymentReport() {
        System.out.println("Eu "+ this.name + " recebi o salário de " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
