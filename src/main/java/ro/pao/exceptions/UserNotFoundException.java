package ro.pao.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super("Upss! Utilizatorul nu a fost gasit!");
    }
}
