package com.academy;

public class GameRepositoryException extends RuntimeException {

    public GameRepositoryException() {
    }

    public GameRepositoryException(String message) {
        super(message);
    }

    public GameRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameRepositoryException(Throwable cause) {
        super(cause);
    }

    public GameRepositoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
