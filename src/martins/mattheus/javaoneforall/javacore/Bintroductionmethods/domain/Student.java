package martins.mattheus.javaoneforall.javacore.Bintroductionmethods.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void print() {
        System.out.println("Estudante: ");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Sexo: " + this.gender);
        System.out.println();
    }
}
