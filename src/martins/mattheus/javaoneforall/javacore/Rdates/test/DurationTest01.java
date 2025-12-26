package martins.mattheus.javaoneforall.javacore.Rdates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);

        LocalTime localTime = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7);

        Duration duration = Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.between(localTime, timeMinusSevenHours);
        System.out.println(duration);
        System.out.println(duration2);

        System.out.println();

        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);

        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

    }
}
