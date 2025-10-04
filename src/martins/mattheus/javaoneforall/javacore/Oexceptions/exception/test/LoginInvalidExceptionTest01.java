package martins.mattheus.javaoneforall.javacore.Oexceptions.exception.test;

import martins.mattheus.javaoneforall.javacore.Oexceptions.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            throw new RuntimeException(e);
        }
    }

    private static void login () throws LoginInvalidException {
        Scanner keyboard = new Scanner(System.in);
        String usernameDB = "Teste";
        String passwordDB = "12345";

        System.out.println("Username: ");
        String typedUsername = keyboard.nextLine();
        System.out.println("Password: ");
        String typedPassword = keyboard.nextLine();

        if (!usernameDB.equals(typedUsername) || !passwordDB.equals(typedPassword)) {
            throw new LoginInvalidException("Invalid Username or Password");
        }

        System.out.println("Login com sucesso");
    }
}
