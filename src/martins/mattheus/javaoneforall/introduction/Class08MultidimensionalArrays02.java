package martins.mattheus.javaoneforall.introduction;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[][] intArray = new int[3][];
        int[] numbers = {1, 2};

        intArray[0] = new int[]{1, 2, 3};
        intArray[1] = numbers;
        intArray[2] = new int[]{1, 2, 3, 4};

        for (int[] baseArray : intArray) {
            System.out.println("\n-------");
            for (int number : baseArray) {
                System.out.print(number);
            }
        }

        int[][] intArray2 = {{1,2},{1,3,5}};

        for (int[] baseArray : intArray2) {
            System.out.println("\n-------");
            for (int number : baseArray) {
                System.out.print(number);
            }
        }
    }
}
