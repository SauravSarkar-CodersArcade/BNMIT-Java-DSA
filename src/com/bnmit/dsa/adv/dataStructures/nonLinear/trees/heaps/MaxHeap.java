package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(22);
        maxHeap.add(1);
        maxHeap.add(33);
        maxHeap.add(34);
        maxHeap.add(50);
        System.out.println("Max Heap: " + maxHeap);
        System.out.println("Max Element: " + maxHeap.poll());
    }
}
