package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(1L, "Berserk", 29.9));
        mangas.add(new Manga(2L, "Pokemon", 14.9));
        mangas.add(new Manga(3L, "Naruto", 24.9));
        mangas.add(new Manga(4L, "Dragon Ball Z", 32.9));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("--------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("--------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
