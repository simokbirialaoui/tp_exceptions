public class NombreNegatifException extends Exception {
    private int erroneousValue;
    private String message;

    public NombreNegatifException(String message, int erroneousValue) {
        this.erroneousValue = erroneousValue;
        this.message = message;
    }

    public String getMessage() {
        return message + " : " + erroneousValue;
    }

}
