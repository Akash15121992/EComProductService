package dev.sandeep.EcomProductServiceDec23.exception;

public class NoProductPresentException extends RuntimeException{
    public NoProductPresentException() {
    }

    public NoProductPresentException(String message) {
        super(message);
    }

    public NoProductPresentException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoProductPresentException(Throwable cause) {
        super(cause);
    }

    public NoProductPresentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
