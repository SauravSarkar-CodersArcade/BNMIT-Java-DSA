package com.bnmit.dsa.adv.algos.greedyAlgos.MinCostOfRopes;
import java.util.PriorityQueue;
class Solution {
    public static int minCost(int[] arr) {
        // Min Heap -> Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Add all the ropes to the heap
        for (int length : arr){
            pq.add(length);
        }
        int totalCost = 0;
        // Continue till only one rope is left
        while (pq.size() > 1){
            // Pick two smallest ropes
            int first = pq.poll();
            int second = pq.poll();
            int cost = first + second;
            totalCost += cost;
            // Add the combined rope back to the heap
            pq.add(cost);
        }
        return totalCost;
    }
}