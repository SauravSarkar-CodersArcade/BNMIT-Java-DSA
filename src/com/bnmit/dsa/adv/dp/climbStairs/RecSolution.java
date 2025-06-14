package com.bnmit.dsa.adv.dp.climbStairs;
public class RecSolution {
    public static int climbStairs(int n){
        if(n == 0 || n == 1) return 1;
        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Recursion: " + climbStairs(n));
    }
}
