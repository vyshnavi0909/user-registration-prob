public class ValidationException extends Exception {
    ExceptionType type;

    enum ExceptionType{
        ENTERED_EMPTY,ENTERED_NULL
    }
    public ValidationException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}

