package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(1L, "Berserk", 29.9));
        mangas.add(new Manga(2L, "Pokemon", 14.9));
        mangas.add(new Manga(3L, "Naruto", 24.9));
        mangas.add(new Manga(4L, "Dragon Ball Z", 32.9));

//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4L, "Dragon Ball Z", 32.9);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
