package martins.mattheus.javaoneforall.javacore.Zgenerics.test;

import martins.mattheus.javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.List;

public class GenericMethodsTest01 {
    public static void main(String[] args) {
        List<Car> carList = createArrayWithOneObject(new Car("Fusca"));
        System.out.println(carList);
    }

    private static <T> List<T> createArrayWithOneObject(T t) {
        return List.of(t);
    }
}
