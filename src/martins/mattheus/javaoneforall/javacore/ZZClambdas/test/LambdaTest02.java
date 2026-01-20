package martins.mattheus.javaoneforall.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Mattheus", "Marcos", "Lucas", "João"));

        forEach(names, name -> System.out.print(name + " "));
        System.out.println();
        List<Integer> qtd = map(names, name -> name.length());
        System.out.println(qtd);
    }

    private static <T> void forEach(List<T> list, Consumer consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
