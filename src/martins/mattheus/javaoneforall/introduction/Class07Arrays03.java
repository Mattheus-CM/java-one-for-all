package martins.mattheus.javaoneforall.introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers02 = {1,2,3,4,5};
        int[] numbers03 = new int[]{1,2,3,4,5};

//        for (int i = 0; i < numbers03.length; i++) {
//            System.out.println(numbers03[i]);
//        }

        for (int num : numbers03) {
            System.out.println(num);
        }
    }
}
