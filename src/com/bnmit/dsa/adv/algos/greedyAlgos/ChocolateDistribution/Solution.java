package com.bnmit.dsa.adv.algos.greedyAlgos.ChocolateDistribution;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        if(m == 0 || arr.size() < m){
            return 0;
        }
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE; // Initially take a very large value
        // Sliding window
        for (int i=0; i + m - 1 < arr.size(); i++){
            int diff = arr.get(i+m-1) - arr.get(i);
            minDiff = Math.min(minDiff,diff);
        }
        return minDiff;
    }
}