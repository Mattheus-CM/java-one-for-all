package martins.mattheus.javaoneforall.javacore.Oexceptions.exception.domain;

public class LoginInvalidException extends Exception {
    public LoginInvalidException() {
        super("Login inválido");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
