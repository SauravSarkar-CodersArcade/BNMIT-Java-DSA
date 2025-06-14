package com.bnmit.dsa.adv.dp.fibonacci;
public class FibonacciRec {
    public static int fib(int n){
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + "th is " + fib(n));
    }
}
