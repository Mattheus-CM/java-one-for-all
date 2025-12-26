package martins.mattheus.javaoneforall.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        NumberFormat[] numberFormats = new NumberFormat[1];
        numberFormats[0] = NumberFormat.getInstance(Locale.getDefault());

        double value = 10000000.23454;

        for (NumberFormat numberFormat : numberFormats) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "1234,1234";
        try {
            System.out.println(numberFormats[0].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
