package peaksoft;

public class InvalidIssue extends RuntimeException{
    public InvalidIssue() {
    }

    public InvalidIssue(String message) {
        super(message);
    }

    public InvalidIssue(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIssue(Throwable cause) {
        super(cause);
    }

    public InvalidIssue(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
