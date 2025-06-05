package com.bnmit.dsa.adv.dataStructures.linear.problems;
public class Solution {
    int solve(int n, int k){
        if(n == 1){
            return 0;
        }
        return (solve(n-1,k)+k)%n;
    }
    int findWinner(int n, int k){
        // int winner = solve(n,k) + 1;
        int winner = 0;
        for (int i=2; i<=n; i++){
            winner = (winner + k) % i;
        }
        return winner + 1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findWinner(5,2));
    }
}
