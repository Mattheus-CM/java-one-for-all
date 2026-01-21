package martins.mattheus.javaoneforall.javacore.ZZClambdas.test;

import martins.mattheus.javaoneforall.javacore.ZZClambdas.domain.Anime;
import martins.mattheus.javaoneforall.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> animeComparatorSupplier = AnimeComparator::new;
        AnimeComparator comparator = animeComparatorSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 700), new Anime("One Punch Man", 50), new Anime("Attack on Titan", 64)));

        animeList.sort(comparator::compareByEpisodesNonStatic);
        System.out.println(animeList);

//        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Dragon Ball Super", 132));
    }
}
