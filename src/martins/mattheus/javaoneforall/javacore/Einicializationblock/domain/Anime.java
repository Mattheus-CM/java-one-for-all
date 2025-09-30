package martins.mattheus.javaoneforall.javacore.Einicializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;

    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
