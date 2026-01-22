package martins.mattheus.javaoneforall.javacore.ZZDoptional.repository;

import martins.mattheus.javaoneforall.javacore.ZZDoptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangaList = List.of(new Manga(1, "Boku no Hero", 50), new Manga(2, "Overlord", 25));

    public static Optional<Manga> findById(Integer id) {
        return findBy(manga -> manga.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(manga -> manga.getTitle().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangaList) {
            if(predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
