package com.bnmit.dsa.adv.dp.climbStairs;
public class SOSolution {
    public static int climbStairs(int n){
        if(n == 0 || n == 1) return 1;
        int p2 = 1;
        int p1 = 1;
        for (int i=2; i<=n; i++){
            int curr = p2 + p1;
            p2 = p1;
            p1 = curr;
        }
        return p1;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println("Space Optimized: " + climbStairs(n));
    }
}
