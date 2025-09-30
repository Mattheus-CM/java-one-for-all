package martins.mattheus.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public double getAverage() {
        return average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void print() {
        System.out.println("--- Funcionário ---");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        if (salaries == null) {
            return;
        }
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Salário " + (i + 1) + ": " + salaries[i]);
        }
        calculateAverage();
    }

    private void calculateAverage() {
        if (salaries == null) {
            return;
        }

        double sum = 0;

        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i];
        }
        System.out.println("A média é " + sum / salaries.length);
    }
}
