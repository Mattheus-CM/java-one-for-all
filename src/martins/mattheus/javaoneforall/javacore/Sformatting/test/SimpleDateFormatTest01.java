package martins.mattheus.javaoneforall.javacore.Sformatting.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brasil,' dd 'de' MMMM' de 'yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("Brasil, 05 de outubro de 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
