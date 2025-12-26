package martins.mattheus.javaoneforall.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeUS = new Locale("en", "US");

        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.LONG, localeBR);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.LONG, localeUS);

        System.out.println(dateFormat1.format(calendar.getTime()));
        System.out.println(dateFormat2.format(calendar.getTime()));

        System.out.println(localeBR.getDisplayCountry(localeUS));
        System.out.println(localeUS.getDisplayCountry(localeUS));
    }
}
