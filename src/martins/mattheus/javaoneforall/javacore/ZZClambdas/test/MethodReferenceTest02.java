package martins.mattheus.javaoneforall.javacore.ZZClambdas.test;

import martins.mattheus.javaoneforall.javacore.ZZClambdas.domain.Anime;
import martins.mattheus.javaoneforall.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator comparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 700), new Anime("One Punch Man", 50), new Anime("Attack on Titan", 64)));
//        animeList.sort((anime1, anime2) -> comparator.compareByEpisodesNonStatic(anime1, anime2));
        animeList.sort(comparator::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
