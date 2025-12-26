package martins.mattheus.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("/home/martins/Programming/Java/java-one-for-all/file.txt");
        Path path2 = Paths.get("/home/martins/Programming/Java/java-one-for-all", "file.txt");
        System.out.println(path.getFileName());
        System.out.println(path2.getFileName());


    }
}
