package martins.mattheus.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // [] -> range
        // ? 0 ou 1
        // * 0 ou mais
        // + 1 ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)0 -> ovo | oco
        // $ final da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("texto:  " + text);
        System.out.println("indice: 01234567890123456789012345");
        System.out.println("regex: " + regex);
        System.out.println("Posições Encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
