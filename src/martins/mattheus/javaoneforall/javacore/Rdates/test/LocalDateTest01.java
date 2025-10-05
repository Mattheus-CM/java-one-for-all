package martins.mattheus.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println();

        LocalDate localDate = LocalDate.of(2023, Month.OCTOBER, 05);
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.lengthOfYear());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.get(ChronoField.YEAR));
        System.out.println(localDate.get(ChronoField.DAY_OF_YEAR));
        System.out.println();

        localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println();

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
