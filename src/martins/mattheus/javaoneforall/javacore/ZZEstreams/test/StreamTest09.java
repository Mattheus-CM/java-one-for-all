package martins.mattheus.javaoneforall.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));
        System.out.println();
        IntStream.range(1, 50).filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));

        System.out.println("----------------");

        Stream.of("KA", "ME", "HA", "ME", "HA").forEach(System.out::print);
        System.out.println();

        int nums[] = {1, 2, 3, 4, 5, 6};
        Arrays.stream(nums).average().ifPresent(System.out::println);
        System.out.println();

        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(line -> line.contains("JAVA")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
