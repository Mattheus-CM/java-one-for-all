package martins.mattheus.javaoneforall.javacore.Cmethodoverloading.test;

import martins.mattheus.javaoneforall.javacore.Cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 12, "Complete");

        anime.print();
    }
}
