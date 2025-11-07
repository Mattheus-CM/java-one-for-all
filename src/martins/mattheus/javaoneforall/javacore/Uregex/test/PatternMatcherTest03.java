package martins.mattheus.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // [] -> range
        String regex = "0[xX][0-9a-fA-F]";
        String text = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("texto:  " + text);
        System.out.println("indice: 01234567890123456789012345");
        System.out.println("regex: " + regex);
        System.out.println("Posições Encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        int numHex = 0xFFFFFF;
        System.out.println(numHex);
    }
}
