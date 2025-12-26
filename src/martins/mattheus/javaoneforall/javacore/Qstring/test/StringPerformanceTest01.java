package martins.mattheus.javaoneforall.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken with String " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer " + (end - begin) + "ms");
    }

    public static void concatString(int length) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder text = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer text = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }
}
