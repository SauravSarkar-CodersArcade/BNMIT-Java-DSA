package com.bnmit.dsa.adv.dp.fibonacci;
import java.util.Arrays;
public class FibonacciMemo {
    public static int fib(int n, int[] dp){
        if(n <= 1) return n;
        // Step 2 : If you have the value, return it, don't calculate
        if(dp[n] != -1){
            return dp[n];
        }
        // Step 3: If you don't have it, calculate it
        return dp[n] = fib(n-1,dp) + fib(n-2,dp);
    }
    public static void main(String[] args) {
        int n = 6;
        // Step 1:
        int[] dp = new int[n+1]; // O based indexing
        Arrays.fill(dp,-1); // Fill with default values -1
        System.out.println("Fibonacci of " + n + " th is: " +
                fib(n,dp));
    }
}
