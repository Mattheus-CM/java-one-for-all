package martins.mattheus.javaoneforall.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // [] -> range
        // ? 0 ou 1
        // * 0 ou mais
        // + 1 ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)0 -> ovo | oco
        // $ final da linha
        // . -> Char coringa
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "naruto@gmail.com, sasuke@hotmail.com, @!#kakashi@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.print("Email Válido: ");
        System.out.println("@!#kakashi@mail.br".matches(regex));
        System.out.println();
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
