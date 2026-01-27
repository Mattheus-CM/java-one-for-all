package martins.mattheus.javaoneforall.javacore.ZZEstreams.test;

import martins.mattheus.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 1 - Order LightNovel by title
// 2 - Retrieve the first 3 titles light novels with price less than 4
public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4)
    ));

    public static void main(String[] args) {
        lightNovels.forEach(System.out::println);
        long counted = lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() < 4)
                .count();
        long countedDistinct = lightNovels.stream()
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() < 4)
                .count();
        System.out.println(counted);
        System.out.println(countedDistinct);
    }
}
