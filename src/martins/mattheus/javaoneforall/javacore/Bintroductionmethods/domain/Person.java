package martins.mattheus.javaoneforall.javacore.Bintroductionmethods.domain;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Idade Inválida");
            return;
        }
        this.age = age;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
