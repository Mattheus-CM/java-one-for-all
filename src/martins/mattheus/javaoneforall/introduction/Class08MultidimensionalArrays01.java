package martins.mattheus.javaoneforall.introduction;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] multiArray = new int[3][3];
        multiArray[0][0] = 1;
        multiArray[0][1] = 2;
        multiArray[0][2] = 3;
        multiArray[1][0] = 4;
        multiArray[1][1] = 5;
        multiArray[1][2] = 6;
        multiArray[2][0] = 7;
        multiArray[2][1] = 8;
        multiArray[2][2] = 9;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println(multiArray[i][j]);
            }
        }

        System.out.println("");

        for (int[] baseArray: multiArray){
            for (int number: baseArray){
                System.out.println(number);
            }
        }
    }
}
