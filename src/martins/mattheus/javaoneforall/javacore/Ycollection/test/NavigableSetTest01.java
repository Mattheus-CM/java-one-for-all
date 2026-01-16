package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Manga;
import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneNameComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPriceComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());
        set.add(new Smartphone("111", "LG"));
        System.out.println(set);
        System.out.println("");
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(5L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99, 5));
        mangas.add(new Manga(1L, "Berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 39.99, 8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 0));
        mangas.add(new Manga(10L, "Slime", 1.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyuHakusho = new Manga(11L, "Yuyu Hakusho", 1.99, 0);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("-----------");
        System.out.println(mangas.lower(yuyuHakusho));
        System.out.println(mangas.floor(yuyuHakusho));
        System.out.println(mangas.higher(yuyuHakusho));
        System.out.println(mangas.ceiling(yuyuHakusho));

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());

    }
}