package martins.mattheus.javaoneforall.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = localDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = localDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = localDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());
    }
}
