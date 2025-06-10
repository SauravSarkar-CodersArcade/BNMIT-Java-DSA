package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.heaps;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int k){
        // We will use a min heap with reverse order to create a max heap
        PriorityQueue<Integer> maxHeap = new
                PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr){
            maxHeap.add(num);
            if(maxHeap.size() > k){
                maxHeap.poll(); // Remove the largest to maintain k size
            }
        }
        return maxHeap.peek(); // The top element will be the kth smallest
    }
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        int ans = kthSmallest(arr,k);
        System.out.println("The " + k + "rd smallest elements in the array "
        + Arrays.toString(arr) + " is " + ans);
    }
}
