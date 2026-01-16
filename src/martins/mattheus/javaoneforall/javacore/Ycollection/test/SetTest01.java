package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 29.9, 5));
        mangas.add(new Manga(2L, "Pokemon", 14.9, 0));
        mangas.add(new Manga(3L, "Naruto", 24.9, 2));
        mangas.add(new Manga(4L, "Dragon Ball Z", 32.9, 0));

        mangas.forEach(System.out::println);
    }
}
