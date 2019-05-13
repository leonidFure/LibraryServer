package com.library.exceptions;

public class ReaderNotFoundError{
    private String errorMessage;

    public ReaderNotFoundError(String message) {
        this.errorMessage = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
