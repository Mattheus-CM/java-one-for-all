package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 29.9, 5));
        mangas.add(new Manga(2L, "Pokemon", 14.9, 0));
        mangas.add(new Manga(3L, "Naruto", 24.9, 2));
        mangas.add(new Manga(4L, "Dragon Ball Z", 32.9, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantity() == 0){
//                mangaIterator.remove();
//            }
//        }
        System.out.println(mangas);
        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);

    }
}
