package com.bnmit.dsa.basics.exceptions.customCheckedExceptions;

// Define a checked exception (must be handled with try-catch or throws)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
