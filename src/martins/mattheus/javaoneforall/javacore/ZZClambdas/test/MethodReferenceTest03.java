package martins.mattheus.javaoneforall.javacore.ZZClambdas.test;

import martins.mattheus.javaoneforall.javacore.ZZClambdas.domain.Anime;
import martins.mattheus.javaoneforall.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of a arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("mateus", "marcos", "lucas"));
//        list.sort((s1, s2) -> s1.compareTo(s2));
        list.sort(String::compareTo);
        System.out.println(list);

//        Function<String, Integer> numStringToInteger = (s1) -> Integer.parseInt(s1);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

//        BiPredicate<List<String>, String> checkName = (names, name) -> list.contains(name);
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "mateus"));
    }
}
