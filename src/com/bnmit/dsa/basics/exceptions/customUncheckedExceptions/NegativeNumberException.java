package com.bnmit.dsa.basics.exceptions.customUncheckedExceptions;

// Define an unchecked exception (extends RuntimeException)
class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}
