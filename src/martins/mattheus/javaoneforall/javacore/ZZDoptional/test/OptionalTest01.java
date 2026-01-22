package martins.mattheus.javaoneforall.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("AHAHAHAHA");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();

        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println();

        Optional<String> nameOptional = findName("Mateus");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s));

    }

    public static Optional<String> findName(String name) {
        List<String> names = List.of("Mateus", "Marcos");
        int i = names.indexOf(name);
        if (i != -1){
            return Optional.of(names.get(i));
        }
        return Optional.empty();
    }
}
