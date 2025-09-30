package martins.mattheus.javaoneforall.javacore.Gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua pergunta e eu responderei com SIM ou NÃO!");

        String question = input.nextLine();

        if (question.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
