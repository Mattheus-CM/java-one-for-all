package martins.mattheus.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void print() {
        System.out.println("--- Funcionário ---");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        if (salaries == null){
            return;
        }
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Salário " + (i + 1) + ": " + salaries[i]);
        }
        average();
    }

    public void average() {
        if (salaries == null){
            return;
        }

        double sum = 0;

        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];
        }
        System.out.println("A média é " + sum / salaries.length);
    }
}
