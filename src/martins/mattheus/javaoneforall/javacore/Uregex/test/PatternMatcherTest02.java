package martins.mattheus.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Todos não dígitos
        // \s = Todos espaços \t \n \f \r
        // \S = Todos não espaços
        // \w = a-z || A-Z || digitos e _
        // \W = Tudo o que não for \w
        String regex = "\\W";
        String text = "aba2 9@bab4";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("texto:  " + text);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições Encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
