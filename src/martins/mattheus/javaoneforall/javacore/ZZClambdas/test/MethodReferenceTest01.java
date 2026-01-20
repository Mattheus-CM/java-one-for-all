package martins.mattheus.javaoneforall.javacore.ZZClambdas.test;

import martins.mattheus.javaoneforall.javacore.ZZClambdas.domain.Anime;
import martins.mattheus.javaoneforall.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 700), new Anime("One Punch Man", 50), new Anime("Attack on Titan", 64)));
//        animeList.sort(animeList, (anime1, anime2) -> anime1.getTitle().compareTo(anime2.getTitle()));
//        animeList.sort(animeList, (anime1, anime2) -> AnimeComparator.compareByTitle(anime1, anime2));
//        animeList.sort(animeList, AnimeComparator::compareByTitle);
        animeList.sort(AnimeComparator::compareByEpisodes);
        System.out.println(animeList);
    }
}
