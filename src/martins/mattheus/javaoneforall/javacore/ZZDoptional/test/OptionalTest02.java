package martins.mattheus.javaoneforall.javacore.ZZDoptional.test;

import martins.mattheus.javaoneforall.javacore.ZZDoptional.domain.Manga;
import martins.mattheus.javaoneforall.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Boku no Hero 2"));

        mangaByTitle.ifPresent(System.out::println);
        System.out.println();

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);
        System.out.println();

        Manga newManga = MangaRepository.findByTitle("Naruto").orElse(new Manga(3, "Naruto", 720));
        System.out.println(newManga);

        MangaRepository.findByTitle("Naruto").orElseThrow(RuntimeException::new);
    }
}
