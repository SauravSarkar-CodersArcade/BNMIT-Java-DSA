package com.bnmit.dsa.adv.dataStructures.linear.stacksAndQueues;
import java.util.Date;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
interface ABC {
    void display();
}
class Demo implements ABC{
    @Override
    public void display(){
        System.out.println("Hi...!!!");
    }
}
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // Heap
        queue.offer(1);
        queue.offer(13);
        queue.offer(12);
        queue.offer(16);
        System.out.println("Queue: " + queue);
        queue.poll();
        System.out.println("Queue: " + queue);
        System.out.println("Front: " + queue.peek());
    }
}
