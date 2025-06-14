package com.bnmit.dsa.adv.dp.fibonacci;
public class FibonacciTab {
    public static int fib(int n){ // 0(n) + O(n)
        if(n <= 1) return n;
        // Step 1: Create a dp array of size n + 1 (0-Based indexing)
        int[] dp = new int[n+1];
        // Step 2: Store the known values (Tabulation)
         dp[0] = 0;
         dp[1] = 1;
         // Step 3: Calculate the unknown value
        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + " th is " + fib(n));
    }
}
