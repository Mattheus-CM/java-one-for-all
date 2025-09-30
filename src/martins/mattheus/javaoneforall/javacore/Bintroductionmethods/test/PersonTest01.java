package martins.mattheus.javaoneforall.javacore.Bintroductionmethods.test;

import martins.mattheus.javaoneforall.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Mattheus");
        person.setAge(-1);
        person.setAge(23);

        person.print();

    }
}
