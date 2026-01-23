package martins.mattheus.javaoneforall.javacore.ZZEstreams.test;

import martins.mattheus.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream()
                .anyMatch(lightNovel -> lightNovel.getPrice() > 9));

        System.out.println(lightNovels.stream()
                .allMatch(lightNovel -> lightNovel.getPrice() > 0));

        System.out.println(lightNovels.stream()
                .noneMatch(lightNovel -> lightNovel.getPrice() > 0));

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
