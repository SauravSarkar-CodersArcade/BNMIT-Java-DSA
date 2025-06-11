package com.bnmit.dsa.adv.algos.greedyAlgos.policemenCatchThieves;
import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public int catchThieves(char[] arr, int k) {
        Deque<Integer> police = new ArrayDeque<>();
        Deque<Integer> thief = new ArrayDeque<>();
        int result = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == 'P'){
                police.addLast(i);
            }else if(arr[i] == 'T'){
                thief.addLast(i);
            }
        }
        while (!police.isEmpty() && !thief.isEmpty()){
            int policeIndex = police.peekFirst();
            int thiefIndex = thief.peekFirst();
            if(Math.abs(policeIndex-thiefIndex) <= k){
                result++;
                police.pollFirst();
                thief.pollFirst();
            }else if(policeIndex < thiefIndex){
                police.pollFirst();
            }else {
                thief.pollFirst();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] arr = {'T', 'T', 'P', 'P', 'T', 'P'};
        int k = 2;
        System.out.println("Max Thieves Caught: " +
                solution.catchThieves(arr,k));
    }
}