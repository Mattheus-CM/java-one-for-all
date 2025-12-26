package martins.mattheus.javaoneforall.javacore.Rdates.test;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.getTime());
    }
}
