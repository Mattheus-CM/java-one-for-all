package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Customer;
import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mattheus");
        Customer customer2 = new Customer("João");

        Manga manga1 = new Manga(5L, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 29.9);
        Manga manga3 = new Manga(2L, "Pokemon", 14.9);
        Manga manga4 = new Manga(3L, "Naruto", 24.9);
        Manga manga5 = new Manga(4L, "Dragon Ball Z", 32.9);

        List<Manga> mangaCustomer1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaCustomer2List = List.of(manga4, manga5, manga2);
        Map<Customer, List<Manga>> customerMangaMap = new HashMap<>();

        customerMangaMap.put(customer1, mangaCustomer1List);
        customerMangaMap.put(customer2, mangaCustomer2List);

        for (Map.Entry<Customer, List<Manga>> entry : customerMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("    " + manga.getName());
            }

        }

    }
}
