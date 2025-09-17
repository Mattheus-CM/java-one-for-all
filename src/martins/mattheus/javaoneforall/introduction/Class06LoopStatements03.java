package martins.mattheus.javaoneforall.introduction;

public class Class06LoopStatements03 {
    /**
     * Print the first 25 numbers from 0 to 50
     */
    public static void main(String[] args) {
        int maxValue = 50;
        for (int i = 0; i < maxValue; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
