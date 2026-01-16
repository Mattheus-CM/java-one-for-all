package martins.mattheus.javaoneforall.javacore.Ycollection.test;

import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Customer;
import martins.mattheus.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mattheus");
        Customer customer2 = new Customer("João");

        Manga manga1 = new Manga(5L, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 29.9);
        Manga manga3 = new Manga(2L, "Pokemon", 14.9);
        Manga manga4 = new Manga(3L, "Naruto", 24.9);
        Manga manga5 = new Manga(4L, "Dragon Ball Z", 32.9);

        Map<Customer, Manga> customerManga = new HashMap<>();
        customerManga.put(customer1, manga1);
        customerManga.put(customer2, manga4);

        for (Map.Entry<Customer, Manga> entry : customerManga.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }
    }
}
