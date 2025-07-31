package com.bnmit.dsa.basics.exceptions.customUncheckedExceptions;

public class TestUnchecked {
    public static int squareRoot(int number) {
        if (number < 0) {
            throw new NegativeNumberException("Can't find square root of negative number");
        }
        return (int)Math.sqrt(number);
    }

    public static void main(String[] args) {
        try {
            System.out.println(squareRoot(-4));
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
