package martins.mattheus.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate = LocalDate.parse("2022-10-05");
        LocalTime localTime = LocalTime.parse("20:30:06");
        System.out.println(localDate);
        System.out.println(localTime);


        LocalDateTime localDateTime2 = localDate.atTime(localTime);
        System.out.println(localDateTime2);
    }
}
