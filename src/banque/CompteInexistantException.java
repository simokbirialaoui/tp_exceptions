package banque;

public class CompteInexistantException extends Exception{
    public CompteInexistantException(String message) {
        super(message);
    }
}
