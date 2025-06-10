package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.heaps;
import java.util.PriorityQueue;
public class KLargestFromArray {
    public static void kLargestElements(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // 1 Insert all elements from array into heap
        // 2 Remove the elements exceeding the k size
        for (int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll(); // Remove the smallest if size exceeds k
            }
        }
        // 3 Print the remaining k elements in the heap
        System.out.println("The " + k + " largest elements are: ");
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {19,21,4,9,3,7};
        int k = 3;
        kLargestElements(arr,k);
    }
}
