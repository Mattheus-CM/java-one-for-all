package martins.mattheus.javaoneforall.javacore.Dconstructor.test;

import martins.mattheus.javaoneforall.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 700, "Completed", "Pierrot");
        anime.print();
    }
}
