package martins.mattheus.javaoneforall.javacore.Zgenerics.test;

import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        printConsult(dogs);
        printConsult(cats);
    }

    public static void printConsult (List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
    }

    public static void printConsultAnimals (List<? super Animal> animals) {
        animals.add(new Cat());
        animals.add(new Dog());
    }
}
