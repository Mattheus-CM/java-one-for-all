package martins.mattheus.javaoneforall.javacore.ZZEstreams.test;

import martins.mattheus.javaoneforall.javacore.ZZEstreams.domain.Category;
import martins.mattheus.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import martins.mattheus.javaoneforall.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 6.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        final Map<Category, Long> collect = lightNovels.stream()
                .collect(
                        Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        final Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))
                        ));
        System.out.println();
        System.out.println(collect1);

        final Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)
                        ));
        System.out.println();
        System.out.println(collect2);
    }
}
