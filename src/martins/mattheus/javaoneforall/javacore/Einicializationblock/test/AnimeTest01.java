package martins.mattheus.javaoneforall.javacore.Einicializationblock.test;

import martins.mattheus.javaoneforall.javacore.Einicializationblock.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto");
        
        for (int episode: anime.getEpisodes()){
            System.out.print(episode + " ");
        }
    }
}
