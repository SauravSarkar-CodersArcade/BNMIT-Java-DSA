package com.bnmit.dsa.adv.dataStructures.linear.stacksAndQueues;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class BinaryGenerator {
    public static void generateBinaryNumbers(int N){
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while (N-- > 0){
            String current = q.poll();
            System.out.print(current+ " ");
            q.offer(current + "0");
            q.offer(current + "1");
        }
    }
    public static void main(String[] args) {
        int N = 5; // 1, 10, 11, 100, 101
        generateBinaryNumbers(N);
    }
}
