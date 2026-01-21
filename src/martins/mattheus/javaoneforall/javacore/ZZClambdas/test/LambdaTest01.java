package martins.mattheus.javaoneforall.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Mattheus", "Marcos", "Lucas", "João"));
        forEach(names, name -> System.out.println(name));
    }

    private static <T> void forEach(List<T> list, Consumer consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
