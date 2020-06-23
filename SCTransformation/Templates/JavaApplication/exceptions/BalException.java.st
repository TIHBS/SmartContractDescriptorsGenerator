package €packageName€.client_application.exceptions;

public class BalException extends RuntimeException {
    private int code;

    public BalException() {
    }

    public BalException(String message, int code) {
        super(message);
        this.code = code;
    }

    public BalException(String message, int code, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public BalException(Throwable cause) {
        super(cause);
    }

    public int getCode() {
        return this.code;
    }
}
