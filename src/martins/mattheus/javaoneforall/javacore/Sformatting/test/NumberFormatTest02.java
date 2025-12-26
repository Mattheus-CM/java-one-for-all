package martins.mattheus.javaoneforall.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        NumberFormat[] numberFormats = new NumberFormat[1];
        numberFormats[0] = NumberFormat.getCurrencyInstance(Locale.getDefault());

        double value = 1000.23454;

        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "R$ 1.000,23";
        try {
            System.out.println(numberFormats[0].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
