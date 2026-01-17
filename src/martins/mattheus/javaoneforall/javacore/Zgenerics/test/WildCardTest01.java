package martins.mattheus.javaoneforall.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {

    @Override
    public void consult() {
        System.out.println("Consultando o Cachorro");
    }
}

class Cat extends Animal {

    @Override
    public void consult() {
        System.out.println("Consultando o Gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[]  cats = {new Cat(), new Cat()};

        printConsult(dogs);
        printConsult(cats);
    }

    public static void printConsult (Animal[] animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
//        animals[1] = new Cat();
    }
}
